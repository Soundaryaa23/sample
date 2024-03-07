package com.Product1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	@Autowired 
	ProductService ps;
	
	@PostMapping("/saveall")
	public String  saveall(@RequestBody List<ProductEntity>d){
		return ps.saveall(d);
		
	}
	@GetMapping("/get")
	public List<ProductEntity>get(){
		return ps.get(); 
	}
}
