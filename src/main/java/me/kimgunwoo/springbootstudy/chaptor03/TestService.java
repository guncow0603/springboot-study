package me.kimgunwoo.springbootstudy.chaptor03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
