package me.kimgunwoo.springbootstudy.service;

import lombok.RequiredArgsConstructor;
import me.kimgunwoo.springbootstudy.domain.RefreshToken;
import me.kimgunwoo.springbootstudy.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken){
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(()->new IllegalArgumentException("Unexpected token"));
    }
}
