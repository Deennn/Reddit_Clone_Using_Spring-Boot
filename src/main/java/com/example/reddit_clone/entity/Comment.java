package com.example.reddit_clone.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor


public class Comment extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    private String body;
    @ManyToOne
    private Link link;

    public Comment(String body, Link link) {
        this.body = body;
        this.link = link;
    }
}
