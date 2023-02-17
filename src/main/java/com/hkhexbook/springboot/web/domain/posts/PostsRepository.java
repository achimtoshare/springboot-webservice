package com.hkhexbook.springboot.web.domain.posts;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends org.springframework.data.jpa.repository.JpaRepository<Posts,Long> { //도메인 패키지와 함께 관리한다. 같은 패키지내 있어야함.
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
