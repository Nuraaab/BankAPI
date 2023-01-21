package com.Java.SystemProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Java.SystemProject.entity.Account;
import com.Java.SystemProject.entity.User;
import com.Java.SystemProject.repository.AccountRepository;
import com.Java.SystemProject.service.AccountService;

@RestController
@RequestMapping("api/acco")
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private AccountRepository accountRepository;
	@RequestMapping(value = "findall",method=RequestMethod.GET, produces= {MimeTypeUtils.APPLICATION_JSON_VALUE}, headers ="Accept=Application/json")
	public ResponseEntity<Iterable<Account>> findAll(){
	try {
		return new ResponseEntity<Iterable<Account>>(accountService.findAllAccount(),HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<Iterable<Account>>(HttpStatus.BAD_REQUEST);
	}
}
	@RequestMapping(value = "find/{id}",method=RequestMethod.GET, produces= {MimeTypeUtils.APPLICATION_JSON_VALUE}, headers ="Accept=Application/json")
	public ResponseEntity<Account> find(@PathVariable("id") int id){
			try {
				return new ResponseEntity<Account>(accountService.findById(id),HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<Account>(HttpStatus.BAD_REQUEST);
			}
	}
	
	@RequestMapping(value = "create",method=RequestMethod.POST, produces= {MimeTypeUtils.APPLICATION_JSON_VALUE},consumes= {MimeTypeUtils.APPLICATION_JSON_VALUE}, headers ="Accept=Application/json")
	public ResponseEntity<Void> create(@RequestBody Account acc){
			try {
				accountService.createAccount(acc);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
			}
	}
	
	@RequestMapping(value = "update",method=RequestMethod.PUT, produces= {MimeTypeUtils.APPLICATION_JSON_VALUE},consumes= {MimeTypeUtils.APPLICATION_JSON_VALUE}, headers ="Accept=Application/json")
	public ResponseEntity<Void> update(@RequestBody Account acc){
			try {
				accountService.updateAccount(acc);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
			}
	}

	@RequestMapping(value = "delete/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable("id") int  id){
			try {
				accountService.deleteAccount(id);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
			}
	}
	
	@RequestMapping(value = "{id}/transfer/{destAcctID}",method=RequestMethod.PUT, produces= {MimeTypeUtils.APPLICATION_JSON_VALUE},consumes= {MimeTypeUtils.APPLICATION_JSON_VALUE}, headers ="Accept=Application/json")
	public ResponseEntity<Void> transferAmount(@PathVariable int acctID, @PathVariable int destAcctID, @PathVariable int amount){
		try {
			accountRepository.withdrawById(acctID, amount);
			accountRepository.saveBalanceById(destAcctID, amount);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
