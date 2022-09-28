package com.example.demo.po;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.Date;

/**
 * book
 *
 * @author: wucheng
 * @date: 2022/5/25
 **/
@Data
@Document(indexName = "idx_book", createIndex = true)
public class Book {

    @Field
    private Long id;

    @Field(type = FieldType.Text)
    private String title;

    @Field
    private String author;

    @Field
    private BigDecimal price;

    @Field(type = FieldType.Date, format = DateFormat.basic_date_time)
    private Date createTime;
}
