package com.example.demo.controller;


import com.example.demo.service.MemberService;
import com.example.demo.web.dto.MemberResponse;
import com.example.demo.web.dto.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public Long signup(@RequestBody SignupRequest request){
        return memberService.signup(
                request.name(),
                request.email(),
                request.password(),
                request.passwordConfirm(),
                request.phone()
        );
    }

    @GetMapping
    public List<MemberResponse> list(){
        return memberService.findAll()
                .stream()
                .map(MemberResponse::from)
                .toList();
    }
}
