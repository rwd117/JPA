package com.example.board.Dto;

import com.example.board.Domain.Entity.PostEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostDto {

    private Long id;
    private String writer;
    private String title;
    private String content;

    public PostEntity toEntity(){
        PostEntity postEntity = PostEntity.builder().
                id(id).
                title(title).
                content(content).
                writer(writer).
                build();
        return postEntity;
    }

    @Builder
    public PostDto(Long id,String title,String content,String writer){
        this.id = id;
        this.title=title;
        this.content=content;
        this.writer=writer;
    }
}
