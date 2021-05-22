package com.example.demo.Entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "POSTTABLE")//클래스이름과 테이블의 이름이 다른경우 Table로 따로 선언
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@SequenceGenerator(name = "Post_Seq_Generator",sequenceName = "POST_seq",initialValue = 1,allocationSize = 1)
//시퀀스 생성 식별자 생성기 이름, db에 등록될 시퀀스 이름, 시작하는 수, 증가하는 수
public class Post {

    @Id//Db기본키
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Post_Seq_Generator")//오라클의 경우 시퀀스로 지정 auto로 설정해도 됨.
    private long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String writer;

}
