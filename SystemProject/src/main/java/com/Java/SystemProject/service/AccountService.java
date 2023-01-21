package com.Java.SystemProject.service;

import org.springframework.stereotype.Service;

import com.Java.SystemProject.entity.Account;

public interface AccountService {
	public Iterable<Account> findAllAccount();
	public Account findById(int id);
	public void createAccount(Account acc);
	public void updateAccount(Account acc);
	public void deleteAccount(int id);
}
