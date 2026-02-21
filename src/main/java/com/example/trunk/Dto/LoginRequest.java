package com.example.trunk.Dto;

import jakarta.persistence.Column;

public record LoginRequest(
    @Column(name = "email", nullable = false)
    String email,
    @Column(name = "password", nullable = false)
    String password
) {
    
}
