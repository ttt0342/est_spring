package com.example.basic.Spring_240717;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ApplicationScope
public class Comment {
    private Long id;
    private String content;
    private String author;
    private LocalDateTime createdAt;
    private BoardPost boardPost;
}
