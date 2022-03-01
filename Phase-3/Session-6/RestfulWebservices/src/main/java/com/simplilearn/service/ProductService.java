package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.ProductEntity;
import com.simplilearn.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<ProductEntity> getAllProducts() {
		return productRepository.findAll();
	}
	public ProductEntity getProductById(int id) {
		ProductEntity pro= productRepository.findById(id).get();
		return pro;
	}
	public ProductEntity addProduct(ProductEntity product) {
		return productRepository.save(product);
	}
	public void deleteProductById(int id) {
		 productRepository.deleteById(id);
	}
	public ProductEntity updateProduct(int id,ProductEntity newProduct) {
		ProductEntity oldProduct= productRepository.findById(id).get();
		
		if(productRepository.findById(id).isPresent()) {
			oldProduct.setName(newProduct.getName());
			oldProduct.setDescription(newProduct.getDescription());
			productRepository.save(oldProduct);
		}
		
		return oldProduct;
	}
}
