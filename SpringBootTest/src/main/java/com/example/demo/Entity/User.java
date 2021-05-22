package com.example.demo.Entity;


import lombok.*;

import javax.persistence.*;

@Entity//DB와 매핑할 객체임을 알려준다.
@Table(name = "USERTABLE")//클래스이름과 테이블의 이름이 다른경우 Table로 따로 선언
@NoArgsConstructor(access = AccessLevel.PROTECTED)//안전한 객체 생성을 위해서, 접근 제어
@Getter
@ToString
//@SequenceGenerator(name = "User_Seq_Generator",sequenceName = "User_seq",initialValue = 1,allocationSize = 1)
//시퀀스 생성 식별자 생성기 이름, db에 등록될 시퀀스 이름, 시작하는 수, 증가하는 수
public class User {

//    @Id//Db기본키
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "User_Seq_Generator")//오라클의 경우 시퀀스로 지정 auto로 설정해도 됨.
//    private long id;

    @Id
    private String username;
    @Column(nullable = false)
    private String password;


    //setter만 사용할경우 목적을 알기 어렵다.또한, setter의 무분별한 사용보다 알기 쉬움.
    @Builder//특정한 경우에 사용되는 값들만 builder을 이용하여 setter생성
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }




}
