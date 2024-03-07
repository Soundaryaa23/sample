package com.Product1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
	@Autowired
	ProductRespoistory pr;

	public String saveall(List<ProductEntity> d) {
		 pr.saveAll(d);
		 return "Success";
	}
	public List<ProductEntity>get(){
		return pr.findAll();
	}

}
