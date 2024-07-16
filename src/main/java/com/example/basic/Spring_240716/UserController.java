package com.example.basic.Spring_240716;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers(){ // 유저는 여러명이므로 리스트 사용
        //전체 사용자 목록 조회
        return null;
    }

    @PostMapping // 행위를 나타내는 것으로 사용자를 생성하는 것을 이미 알고 있어 적을 필요 없음
    public User createUser(@RequestBody User user){ //리퀘스트바디 = HTTP로 통신하는 데이터를 담아 이동
        //사용자 생성 로직
        return null;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        // 특정 사용자 찾기
        return null;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User updateUser){
        //업데이트 로직
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        //사용자 삭제 메서드
        //리턴 필요 없음
    }

}
