package com.example.reddit_clone.repository;

import com.example.reddit_clone.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Link findByTitle(String title);
}
