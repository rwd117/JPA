package com.example.board.Service;

import com.example.board.Domain.Repository.PostRepository;
import com.example.board.Dto.PostDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class PostService {

    private PostRepository postRepository;

    @Transactional
    public Long writepost(PostDto postDto){

        return postRepository.save(postDto.toEntity()).getId();
    }

}
