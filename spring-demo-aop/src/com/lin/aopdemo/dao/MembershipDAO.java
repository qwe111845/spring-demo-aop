package com.lin.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	private void addAccount() {
		
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		
	}

	public void add() {
		this.addAccount();		
	}
}
