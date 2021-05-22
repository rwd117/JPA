package com.example.demo.Repository;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
//기본적인 Crud기능을 지원한다. CrudRepository에서 페이징,정렬 등의 기능을 가지고있음. JPA
// 그 외 기능을 사용하고 싶으면 선언해준 뒤 service에서 구현.
}
