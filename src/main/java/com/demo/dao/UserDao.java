package com.demo.dao;

import com.demo.pojo.Person;
import com.demo.pojo.Project;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;

@Repository
public interface UserDao {
    @Select("select  * from person where name=#{name}")
    Person getInformation(String name);

    @Select("select * from project where grade=#{grade}")
    LinkedList<Project> getAllPeople(int grade);
}
