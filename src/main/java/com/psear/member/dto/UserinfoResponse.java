package com.psear.member.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserinfoResponse {
    private Long id;

    private String email;
}