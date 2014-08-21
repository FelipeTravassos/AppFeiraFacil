package com.example.feirafacil.utils;

import java.util.ArrayList;
import java.util.List;

import com.example.feirafacil.cloud.CloudUtils;
import com.example.feirafacil.system.Product;

public class Utils {

	public static String separador = CloudUtils.getSeparador();

	/**
	 * Prepare the list of products for search in cloud
	 * @param produtos:
	 * 		List of objects of type Product
	 * @return
	 * 		List of objects of type String.
	 */
	public static List<String> converteListaProdutosParaListaString (List<Product> produtos) {
		List<String> retorno = new ArrayList<String>();
		for (Product produto : produtos) {
			String prod = "";
			prod += produto.getId()+Utils.separador+produto.getQuantidade();
			retorno.add(prod);
		}
		return retorno;
	}
}