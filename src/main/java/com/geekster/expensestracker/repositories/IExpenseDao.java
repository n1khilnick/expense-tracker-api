package com.geekster.expensestracker.repositories;

import com.geekster.expensestracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IExpenseDao extends JpaRepository<Expense,Long> {

    @Query(value = "select * from expenses where fk_user_user_id = :userId",nativeQuery = true)
    Iterable<Expense> findAllExpensesByUserId(Long userId);

    Expense findByExpenseId(Long expenseId);
}
