package com.example;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootTest
class TokenDemoApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void TestBCryptPasswordEncoder() {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encode = passwordEncoder.encode("123456");
//        String encode2 = passwordEncoder.encode("123456");
//        System.out.println(encode);
//        System.out.println(encode2);

        Boolean isTrue = passwordEncoder.matches("123456", "$2a$10$rWpe3.CGSkv5SkD8NZH/sOBvkXKNZfc3fuZ8xHjkXF2fIxPLh4bRa");
        System.out.println(isTrue);
    }

    @Test
    public void TestUserMapper() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
