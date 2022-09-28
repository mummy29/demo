package com.example.demo.controller.test;

//import com.example.demo.po.Book;
//import com.example.demo.repository.BookRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.elasticsearch.core.SearchHits;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.Random;
//import java.util.UUID;

/**
 * es
 *
 * @author: wucheng
 * @date: 2022/5/25
 **/
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/test/es")
//@Slf4j
//public class ESController {
//
//    private final BookRepository bookRepository;
//
//    @GetMapping("/save")
//    public String esSave() {
//
//        Book book = new Book();
//        book.setId(new Random().nextLong());
//        book.setTitle("张飞历险记" + UUID.randomUUID().toString());
//        book.setAuthor("张飞");
//        book.setPrice(new BigDecimal(99.99));
//        book.setCreateTime(new Date());
//        Book esBook = bookRepository.save(book);
//
//        log.info("esBook:{}", esBook);
//
//        return "success";
//    }
//
//    @GetMapping("/find")
//    public SearchHits<Book> esFind() {
//
//        SearchHits<Book> searchHits = bookRepository.find("张飞");
//
//        log.info("searchHits:{}", searchHits);
//        log.info("searchHits.getSearchHits:{}", searchHits.getSearchHits());
//
//        return searchHits;
//    }
//
//}
