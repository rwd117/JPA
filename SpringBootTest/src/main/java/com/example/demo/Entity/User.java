package com.example.demo.Entity;


import lombok.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "USERTABLE")//클래스이름과 테이블의 이름이 다른경우 Table로 따로 선언
@NoArgsConstructor(access = AccessLevel.PROTECTED)//안전한 객체 생성을 위해서, 접근 제어
@Getter
@ToString
@SequenceGenerator(name = "User_Seq_Generator",sequenceName = "User_seq",initialValue = 1,allocationSize = 1)
//시퀀스 생성 식별자 생성기 이름, db에 등록될 시퀀스 이름, 시작하는 수, 증가하는 수
public class User {

    @Id//Db기본키
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//오라클의 경우 시퀀스로 지정 auto로 설정해도 됨.
    private long id;
    private String username;
    private String password;

    @Builder//특정한 경우에 사용되는 값들만 builder을 이용하여 setter생성
    //setter만 사용할경우 목적을 알기 어렵다.또한, setter의 무분별한 사용보다 알기 쉬움.
    public void UserLogin(String username,String password){
        this.username=username;
        this.password=password;
    }


}
