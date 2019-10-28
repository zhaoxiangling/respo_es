package com.itheima.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author zhaoxl01
 * @Description Article
 * @ate 2019/9/4
 */
@Document(indexName = "sdes_blog", type = "article")
public class Article {
    @Id
    @Field(type = FieldType.Long, store = true)
    private Long id;
    @Field(type = FieldType.text, store = true, analyzer = "ik_smart")
    private String title;
    @Field(type = FieldType.text, store = true, analyzer = "ik_smart")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
