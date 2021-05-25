package com.example.board.Controller;

import com.example.board.Dto.PostDto;
import com.example.board.Service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @GetMapping("/")
    public String list(){
        return "post/list.html";
    }

    @GetMapping("/post")
    public String postwrite(){
        return "post/write.html";
    }

    @PostMapping("/post")
    public String postwrite(PostDto postDto){

        postService.writepost(postDto);

        return "post/list.html";
    }
}
