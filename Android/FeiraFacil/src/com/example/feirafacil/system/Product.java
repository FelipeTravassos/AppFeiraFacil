package com.example.feirafacil.system;

/**
 * 
 * @author FELIPE
 */
public class Product {
	Long id;
	int quantidade;
	
	public Product(long id, int quantidade) {
		this.id = id;
		this.quantidade = quantidade;
	}

	/**
	 * Get id
	 * @return
	 * 		Long with id of product
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Get quantity
	 * @return
	 * 		int with quantity
	 */
	public int getQuantidade() {
		return quantidade;
	}
}
