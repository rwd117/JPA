package com.example.board.Domain.Repository;

import com.example.board.Domain.Entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
