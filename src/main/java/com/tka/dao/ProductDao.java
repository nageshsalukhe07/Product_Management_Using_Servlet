package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Product;

@Repository
public class ProductDao {
	@Autowired
	SessionFactory sf;

	public String addProduct(Product product) {
		
		try {
			Session ss = sf.openSession();
			Transaction tx = ss.beginTransaction();
			ss.save(product);
			tx.commit();
			String msg="product added successfully in db table";
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			String msg="somthing went wrong";
			return msg;
		}

		
	}

	public List<Product> displayProduct() {
		List<Product> plist=null;
		try {
			Session ss = sf.openSession();
			Criteria criteria = ss.createCriteria(Product.class);
//			plist=new ArrayList<Product>();
			plist=criteria.list();
			return plist;
		} catch (Exception e) {
			e.printStackTrace();
			String msg="somthing went wrong";
			return plist;
		}
	}
	


	public String deleteProduct(int pk) {

		Product product=null;
		try {
			Session ss = sf.openSession();
			Transaction tx = ss.beginTransaction();
			product=ss.get(Product.class, pk);
			ss.delete(product);
			tx.commit();
			String msg="product delete from DB";
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			String msg="somthing went wrong";
			return msg;
		}
		
	}
	
	public Product getProduct(int pk) {
	Product product=null;
	try {
		Session ss = sf.openSession();
		product=ss.get(Product.class, pk);
		return product;
	} catch (Exception e) {
		e.printStackTrace();
		return product;
	}
	
}

	public String updateProduct(Product product) {
		try {
			Session ss = sf.openSession();
			Transaction tx = ss.beginTransaction();
			ss.saveOrUpdate(product);
			tx.commit();
			String msg="product updated successfully in db table";
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			String msg="somthing went wrong";
			return msg;
		}
		
	}
	

}
