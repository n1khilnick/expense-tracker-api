package com.geekster.expensestracker.repositories;

import com.geekster.expensestracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<User,Integer> {

    User findFirstByUserEmail(String userEmail);
}
