package gerenciabd;

import gerenciabd.interfaces.IDataBaseSupermarket;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import nucleoSupermercado.Tradutores.TranslatorIdeal;
import nucleoSupermercado.exceptions.ExceptionUpdate;
import conexao.ConnectionIdeal;

/**
 * 
 */
public class DataBaseSupermarketIdeal implements IDataBaseSupermarket {

	TranslatorIdeal translater = new TranslatorIdeal();
	
	@Override
	public void updateBase() throws ExceptionUpdate {
		translater.update();
	}

	@Override
	public ArrayList<String> getPedidosEmAberto(String idSupermarket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getDadosPedido(String id, String idSupermarket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int amountOfOpenOrders(String idSupermarket) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateRequest(String id, String idSupermarket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSupermarket(String idSupermarket) {
		// TODO Auto-generated method stub
		return false;
	}

}
