package me.kimgunwoo.springbootstudy.service;


import lombok.RequiredArgsConstructor;

import me.kimgunwoo.springbootstudy.domain.User;
import me.kimgunwoo.springbootstudy.dto.AddUserRequest;
import me.kimgunwoo.springbootstudy.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .auth(dto.getAuth())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
