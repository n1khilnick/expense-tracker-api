package com.geekster.expensestracker.repositories;

import com.geekster.expensestracker.model.AuthToken;
import com.geekster.expensestracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthTokenDao extends JpaRepository<AuthToken,Long> {

    AuthToken findByUser(User user);

    AuthToken findFirstByToken(String token);


}
