package com.example.feirafacil.search;

import java.util.ArrayList;
import java.util.List;

import com.example.feirafacil.cloud.CloudSearch;
import com.example.feirafacil.system.Address;
import com.example.feirafacil.system.Product;
import com.example.feirafacil.system.Supermarket;
import com.example.feirafacil.utils.Utils;

/**
 * 
 * @author FELIPE
 */
public class Search {
	CloudSearch cs = new CloudSearch();
	private Utils utils = new Utils();
	
	/**
	 * 
	 * @param produtos
	 * @return
	 */
	public List<Supermarket> buscar (List<Product> produtos) {
		return gerarObjetosSupermercados(cs.buscar(Utils.converteListaProdutosParaListaString(produtos)));
	}
	
	/**
	 * 
	 * @param strSupermercados
	 * @return
	 */
	private List<Supermarket> gerarObjetosSupermercados(List<String> strSupermercados){
		List<Supermarket> supermercados = new ArrayList<Supermarket>();
		for (String spr : strSupermercados) {
			Long id = Long.parseLong(spr.split(utils.separador)[0]);
			String nome = spr.split(utils.separador)[1];
			Address endereco = getEndereco(spr.split(utils.separador)[2]);
			Double preco = Double.parseDouble(spr.split(utils.separador)[3]);
			supermercados.add(new Supermarket(id, nome, endereco, preco));
		}
		return supermercados;
	}
	
	/**
	 * Get address
	 * @param endereco:
	 * 		String with address
	 * @return
	 * 		Object of type Address with address
	 */
	private Address getEndereco(String endereco) {
		String number = endereco.split(utils.separador)[0];
		String road = endereco.split(utils.separador)[1];
		String neighborhood = endereco.split(utils.separador)[2];
		String city = endereco.split(utils.separador)[3];
		String phoneNumber = endereco.split(utils.separador)[4];
		Address retorno = new Address(number, road, neighborhood, city, phoneNumber);
		return retorno;
	}
	
}
