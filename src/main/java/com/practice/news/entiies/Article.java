package com.practice.news.entiies;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Article extends BaseTimeEntity{
    @Id @GeneratedValue()
    @Column(name = "article_id")
    private Long id;

    private String title;

    private String url;

    @Builder
    public Article(String title, String url) {
        this.title = title;
        this.url = url;
    }


}

