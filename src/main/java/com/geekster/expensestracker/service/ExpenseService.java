package com.geekster.expensestracker.service;

import com.geekster.expensestracker.model.Expense;
import com.geekster.expensestracker.repositories.IExpenseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    IExpenseDao expenseDao;

    public void addExpense(Expense expense) {
        expenseDao.save(expense);
    }

    //
    public Iterable<Expense> getAllExpensesByUserId(Long userId) {
            return expenseDao.findAllExpensesByUserId(userId);
    }

    public void deleteExpense(Long expenseId) {
        expenseDao.deleteById(expenseId);
    }

    public void updateExpense(Long expenseId, Double amount) {
           Expense expense = expenseDao.findByExpenseId(expenseId);
            expense.setAmount(amount);
    }

    public Expense findExpenseById(Long expenseId) {
        return expenseDao.findByExpenseId(expenseId);
    }
}
