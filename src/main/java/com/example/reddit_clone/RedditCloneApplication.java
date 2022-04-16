package com.example.reddit_clone;

import com.example.reddit_clone.entity.Comment;
import com.example.reddit_clone.entity.Link;
import com.example.reddit_clone.repositories.CommentRepository;
import com.example.reddit_clone.repositories.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RedditCloneApplication {

    public static void main(String[] args) {

        SpringApplication.run(RedditCloneApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
        Link link = new Link("Spring boot", "https://deennn.com");
        linkRepository.save(link);
        Comment comment = new Comment("This is awesome", link);
        commentRepository.save(comment);
        link.addComment(comment);
        Link firstLink =  linkRepository.findByTitle("Spring boot");
//            System.out.println(firstLink);
            System.out.println(firstLink.getTitle());
//            System.out.println(firstLink.getComments());

        };
    }


}
