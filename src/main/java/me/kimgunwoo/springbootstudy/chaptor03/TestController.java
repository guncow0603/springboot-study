package me.kimgunwoo.springbootstudy.chaptor03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllmembers(){
        List<Member> members = testService.getAllMembers();
        return members;
    }

}
