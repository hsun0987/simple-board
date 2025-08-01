package com.example.simple_board.post.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

    // select * from post where id = ? status = ? order by id desc limit 1
    public Optional<PostEntity> findFirstByIdAndStatusOrderByIdDesc(Long id, String status);
}
