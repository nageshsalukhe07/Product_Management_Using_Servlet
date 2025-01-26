package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.entity.Product;
import com.tka.service.ProductService;

@Controller
public class ProductContoller {
	@Autowired
	private ProductService service;
	@GetMapping("/add-product")
	public String insertProductPage() {
		return "add";
	}
	
	@PostMapping("/insert-product")
	public String addProduct(@ModelAttribute Product product) {
		System.out.println(product);
		String msg=service.addProduct(product);
		System.out.println(msg);
		return "add";
	}
	
	@GetMapping("/display-product")
	public String displayProduct(Model model) {
		List<Product> list=service.displayProduct();
		model.addAttribute("products",list);
		return "display";
	}
	
	@GetMapping("/delete-product")
	public String deleteProduct(@RequestParam("pid") int pk) {
		String res=service.deleteProduct(pk);
		return "redirect:/display-product";
	}
	
	@GetMapping("/view-product")
	public String updateProduct(@RequestParam("pid") int pk, Model model) {
		
		Product product=service.getProduct(pk);
		model.addAttribute("p",product);
		return "update";
	}
	
	@PostMapping("/update-product")
	public String updateProduct(@ModelAttribute Product product) {
		String msg=service.updateProduct(product);
		return "redirect:/display-product";
	}

}
