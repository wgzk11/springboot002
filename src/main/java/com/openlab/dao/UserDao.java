package com.openlab.dao;

import com.openlab.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserDao extends JpaRepository<User,Long> {
   /* public User findByName(String name);
    public User findByNameAndAge(String name,Integer age);*/

 /*   @Transactional
    @Modifying
    @Query(value = "insert into user values(null,:name,?2)",nativeQuery = true)
    public  void  saveUser(String user);*/
}
