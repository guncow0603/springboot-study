package me.kimgunwoo.springbootstudy.repository;

import me.kimgunwoo.springbootstudy.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
