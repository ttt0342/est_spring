package com.example.basic.Spring_240717;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board-post")
public class BoardPostController {

    private final BoardPostService boardPostService;

    @Autowired
    public BoardPostController(BoardPostService boardPostService) {
        this.boardPostService = boardPostService;
    }

    @PostMapping
    public ResponseEntity<BoardPostDto> createBoardPost(@RequestBody BoardPostDto boardPostDto){
        BoardPostDto createdBoardPostDto = boardPostService.createBoardPost(boardPostDto);
        return ResponseEntity.ok(createdBoardPostDto);
    }

    // 조회
    @GetMapping
    public ResponseEntity<List<BoardPostDto>> getAllBoardPost() {
        List<BoardPostDto> boardPostDtos = boardPostService.getAllBoardPosts();
        return ResponseEntity.ok(boardPostDtos);
    } //보더 포스트에 디티오를 리스트로 반환하는 역할

    // 특정 글 조회
    @GetMapping("/{id}")
    public ResponseEntity<BoardPostDto> getBoardPostById(@PathVariable("id") Long id){
        BoardPostDto boardPostDto = boardPostService.getBoardPostDtoById(id);
        return ResponseEntity.ok(boardPostDto);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBoardPost(@PathVariable("id") Long id){
        boardPostService.deleteBoardPost(id);
        return ResponseEntity.noContent().build();  // 204번 코드 출력
    }

    // 전체 수정
    @PutMapping("/{id}")
    public ResponseEntity<BoardPostDto> updateBoardPost(@PathVariable("id") Long id, @RequestBody
    BoardPostDto updateBoardPostDto){
        BoardPostDto updatedBoardPostDto = boardPostService.updateBoardPost(id,updateBoardPostDto);

        return ResponseEntity.ok(updatedBoardPostDto);
    }

    //댓글 추가 기능 구현

    //댓글 추가
    @PostMapping("/{postId}/comments")
    //전에 사용하던 id는 보드포스트에 대한 id 이므로 다른 것으로 작성해야 헷갈리지 않는다. (확실한 구별을 위해)
    public ResponseEntity<CommentDto> createComment(
            @PathVariable("postId") Long postId, @RequestBody CommentDto createCommentDto
    ){
        CommentDto createdCommentDto = boardPostService.createComment(postId,createCommentDto);
        return ResponseEntity.ok(createdCommentDto);
    }

    //댓글 삭제
    @DeleteMapping("/{postId}/comments/{commentId}")
    public ResponseEntity<Void> deleteComment(
            @PathVariable("postId") Long postId, @PathVariable("commentId") Long commentId
    ) {
        boardPostService.deleteComment(postId, commentId);
        return ResponseEntity.noContent().build();
    }
}
