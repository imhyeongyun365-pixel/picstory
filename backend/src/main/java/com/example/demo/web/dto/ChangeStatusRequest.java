package com.example.demo.web.dto;

import com.example.demo.domain.MemberStatus;

public record ChangeStatusRequest (
        MemberStatus status
) {
}
