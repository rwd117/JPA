package com.example.board.Domain.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Table(name = "POST")
public class PostEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String writer;

    @Builder
    public PostEntity(Long id,String title,String content,String writer){
        this.id = id;
        this.title=title;
        this.content=content;
        this.writer=writer;
    }


}
