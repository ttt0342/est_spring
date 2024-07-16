package com.example.basic.Spring_240715;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    private List<Post> posts = new ArrayList<>();
    private Long nextId = 1L;  //id가 PK이므로 고유해야하므로 nextId 사용한다.

    // 조회 - CRUD 중 C 구현
    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", posts);
        //model.addAttribute("posts", posts); // posts가 DB를 대신하여 게시물을 저장한다.
        // 없어도 되는 코드
        return "post/list";
    } // 포스트 글 목록을 보여준다.(조회기능)

    @GetMapping("/new")
    public String newPostForm(Model model) {
//        model.addAttribute("post", new Post());
        // 없어도 되는 코드
        return "post/form";
    }// 포스트를 만들 생성 폼을 보여준다.

    @PostMapping
    public String savePost(@ModelAttribute Post post) {
        post.setId(nextId++); //id를 증가시키는 이유? pk
        post.setCreateAt(LocalDateTime.now()); // 생성시 시간 현재시간
        posts.add(post); // 게시물 추가
        return "redirect:/posts";
    }// posts는 리스트 메서드를 호출한다. 리다이렉트를 통해 새로 생성한 데이터도 보일 수 있게 한다.
     // 게시물을 생성한다.

    @GetMapping("/{id}")// {} 사용하는 이유: 경로변수를 사용하여 id에 따라 게시물 내용 확인 가능
    public String detail(@PathVariable("id") Long id, Model model) {
        Post post = posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                // 없어도 되나 맨처음에 찾은 값만 출력한다.
                .orElseThrow(() -> new IllegalArgumentException());

        model.addAttribute("post", post);
        return "post/detail";
    } // 이때 id는 기본키(PK)로 고유하므로 해당 포스트 내용에 접근할 수 있다.
      // title로 정하지 않는 이유 - 중복이 가능하여 경로변수 사용 불가능

    // delete
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        posts.removeIf(post -> post.getId() == id);
        return "redirect:/posts";
    }

    //update
    @GetMapping("/{id}/edit")
    public String editform(@PathVariable("id") Long id, Model model){
        Post post = posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());

        model.addAttribute("post", post);
        return "post/edit";
    } // 수정버튼을 누를 때 수정 시 내용 작성화면에서 기존 작성 내용을 가지고 있어야 한다.

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, @ModelAttribute Post updatePost) {
        Post post = posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
        post.setTitle(updatePost.getTitle()); //set 메서드로 업데이트 객체의 title 값으로 변경
        post.setContent(updatePost.getContent()); //set 메서드로 업데이트 객체의 content 값으로 변경
        return "redirect:/posts/{id}";
    }
}
