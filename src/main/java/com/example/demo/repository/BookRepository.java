package com.example.demo.repository;

import com.example.demo.po.Book;
import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * es book repository
 *
 * @author: wucheng
 * @date: 2022/5/25
 **/
//public interface BookRepository extends ElasticsearchRepository<Book, Long> {
//
//    @Highlight(fields = {
//            @HighlightField(name = "title"),
//            @HighlightField(name = "author")
//    })
//    @Query("{\"match\":{\"title\":\"?0\"}}")
//    SearchHits<Book> find(String keyword);
//}
