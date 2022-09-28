package com.example.demo.mapper;

import com.example.demo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * user mapper
 *
 * @author: wucheng
 * @date: 2022/5/24
 **/
@Mapper
@Repository
public interface UserMapper {

    /**
     * 查询
     * @return
     */
    List<User> findAll();

    /**
     * 添加数据
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 根据用户名查询数据
     * @param username
     * @return
     */
    User findByName(String username);
}
