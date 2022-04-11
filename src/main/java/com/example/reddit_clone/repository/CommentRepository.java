package com.example.reddit_clone.repository;

import com.example.reddit_clone.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
