package com.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Products;
import com.utility.HibernateUtility;


public class Client {

	public static void main(String[] args) {
		
	}
	
	public static boolean addToDB(Products p) {
		Session sesh = HibernateUtility.getSession();
		Transaction tx = sesh.beginTransaction();
		
		sesh.save(p);
	
		tx.commit();
		
		System.out.println("Product added");
		
		return true;
	}

}
