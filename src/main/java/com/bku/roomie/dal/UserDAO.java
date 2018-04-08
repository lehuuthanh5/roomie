package com.bku.roomie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bku.roomie.entity.User;
@Repository
public interface UserDAO extends JpaRepository<User, Long> {

}
