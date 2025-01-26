package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;

	public String addProduct(Product product) {

		System.out.println("we are in service->add method");
		String msg = dao.addProduct(product);
		return msg;
	}

	public List<Product> displayProduct() {
		List<Product> plist = dao.displayProduct();
		return plist;
	}

	public String deleteProduct(int pk) {
		String res = dao.deleteProduct(pk);
		return res;
	}

	public Product getProduct(int pk) {

		Product product = dao.getProduct(pk);
		return product;
	}

	public String updateProduct(Product product) {
		String msg=dao.updateProduct(product);
		return msg;
	}

}
