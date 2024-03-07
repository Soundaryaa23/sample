package com.Product1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDAO pd;

	public String saveall(List<ProductEntity> d) {
		return pd.saveall(d);
	}
	
	public List<ProductEntity> get() {
		return pd.get();
	}

}
