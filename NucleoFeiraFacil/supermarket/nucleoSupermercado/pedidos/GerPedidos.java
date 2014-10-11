package nucleoSupermercado.pedidos;

import gerenciabd.DataBaseSupermarketIdeal;

import java.util.ArrayList;

import nucleoSupermercado.exceptions.ExceptionUpdate;

/**
 * Class GerPedidos
 * @author Felipe
 */
public class GerPedidos {

	DataBaseSupermarketIdeal DBSupermarketIdeal = new DataBaseSupermarketIdeal();
	
	/**
	 * Get open request
	 * @param idSupermarket
	 * 		Id of the supermarket
	 * @return 
	 * 		ArrayList<String> with requests in order
	 * @throws ExceptionUpdate
	 */
	public ArrayList<String> getPedidosEmAberto(String idSupermarket) throws ExceptionUpdate {
		return DBSupermarketIdeal.getPedidosEmAberto(idSupermarket);
	}

	/**
	 * Get request
	 * @param id
	 * 		Id of the request
	 * @param idSupermarket
	 * 		Id of the supermarket
	 * @return
	 * 		Order
	 * @throws ExceptionUpdate
	 */
	public Pedido getPedido(String id, String idSupermarket) throws ExceptionUpdate {
		Pedido pedido = new Pedido(
				DBSupermarketIdeal.getDadosPedido(id, idSupermarket));
		return pedido;
	}

	/**
	 * Amount of open orders
	 * @param idSupermarket
	 * 		Id of the supermarket
	 * @return
	 * 		Amount of open orders
	 * @throws ExceptionUpdate
	 */
	public int amountOfOpenOrders(String idSupermarket) throws ExceptionUpdate {
		return DBSupermarketIdeal.amountOfOpenOrders(idSupermarket);
	}

	/**
	 * Close the request
	 * @param id
	 * 		Id of the request
	 * @param idSupermarket
	 * 		Id of the supermarket
	 * @throws ExceptionUpdate
	 */
	public void closeTheRequest(String id, String idSupermarket) throws ExceptionUpdate {
		DBSupermarketIdeal.updateRequest(id, idSupermarket);
	}

}
