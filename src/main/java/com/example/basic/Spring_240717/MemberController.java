package com.example.basic.Spring_240717;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController { // 멤버에 관련된 로직 수행

    private List<Member> members = new ArrayList<>();
    private long nextId = 1;

    //전체 리스트(멤버) 조회
    @GetMapping
    public List<Member> getAllMembers(){
        return members;
    }

    // 멤버 생성
    @PostMapping
    public Member createMember(@RequestBody Member member){
        member.setId(nextId++);
        members.add(member);
        return member;
        // 객체 반환 시 사용자가 보는 것은 제이슨 형태
        // 잭슨 라이브러리 기능을 통해 제이슨으로 변환해준다.
    }

    // id로 조회하기
    @GetMapping("/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable("id") Long id){
        Member member1 = members.stream()
                .filter(member -> member.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
        // id =3까지 만약 4를 요청한다면 에러가 발생한다.
        // ResponseEntity 에러코드 설정 가능
        // 해당 에러 처리가 없다면 에러코드 "500"

//        return ResponseEntity.notFound().build(); //에러코드 404로 나타냄
        return ResponseEntity.status(404).body(member1);
    }

    // 업데이트
    @PutMapping("/{id}")
    public Member updateMember(@PathVariable("id") Long id, @RequestBody Member updateMember){
        Member member = members.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("멤버를 찾지 못하였습니다."));

        member.setName(updateMember.getName());
        member.setEmail(updateMember.getEmail());
        return member;
    }

    // 삭제(delete)
    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable("id") Long id){
        members.removeIf(member -> member.getId() == id);
    }

}
