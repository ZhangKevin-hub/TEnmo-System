package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountDao {

    boolean create(int user_id);

    boolean createAdditionalAccount(int userId);

    BigDecimal getFunds(String name);

    BigDecimal getBalance(int userId, int accountId);

    List<Integer> getAccountList(int account_id);

    Account getAccountById(int account_id);

}
