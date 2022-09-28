package com.example.demo.config;

//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.RestClients;
//import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
//import org.springframework.http.HttpHeaders;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

/**
 * elastic config
 *
 * @author: wucheng
 * @date: 2022/5/25
 **/
//@Configuration
//public class ElasticConfig extends AbstractElasticsearchConfiguration {
//
//    @Value("${demo.elasticsearch.url:}")
//    private String esUrl;
//
//    @Bean
//    @Override
//    public RestHighLevelClient elasticsearchClient() {
//        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo(esUrl)
//                .withHeaders(() -> {
//                    HttpHeaders httpHeaders = new HttpHeaders();
//                    httpHeaders.add("currentTime", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//                    return httpHeaders;
//                })
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//}
