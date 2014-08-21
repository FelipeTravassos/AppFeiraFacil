package com.example.feirafacil.payment;

import java.util.List;

import com.example.feirafacil.system.Product;

public interface IPayment {

	public void pagar(Long IdSupermercado, List<Product> produtos, Double preco);
}
