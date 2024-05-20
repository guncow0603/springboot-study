package me.kimgunwoo.springbootstudy.service;

import lombok.RequiredArgsConstructor;
import me.kimgunwoo.springbootstudy.domain.Article;
import me.kimgunwoo.springbootstudy.dto.AddArticleRequest;
import me.kimgunwoo.springbootstudy.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @Not Null이 붙은 필드의 생성자 추가
@Service // 빈으로 둥록
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    public Article findById(long id){
        return blogRepository.findById(id).orElseThrow(()->new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id){
        blogRepository.deleteById(id);
    }
}
