package com.itheima.es.repositories;

import com.itheima.es.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhaoxl01
 * @Description ArticleRepository
 * @date 2019/9/4
 */
public interface ArticleRepository extends ElasticsearchRepository<Article, Long> {
}
