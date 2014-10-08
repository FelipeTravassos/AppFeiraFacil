package nucleoSupermercado.pedidos;

import gerenciabd.DataBaseSupermarketIdeal;

import java.util.ArrayList;

import nucleoSupermercado.exceptions.ExceptionUpdate;

/**
 * Class GerPedidos
 * @author Felipe
 */
public class GerPedidos {

	/**
	 * Get open request
	 * @param idSupermarket
	 * 		Id of the supermarket
	 * @return 
	 * 		ArrayList<String> with requests in order
	 * @throws ExceptionUpdate
	 */
	public static ArrayList<String> getPedidosEmAberto(String idSupermarket) throws ExceptionUpdate {
		return DataBaseSupermarketIdeal.getPedidosEmAberto(idSupermarket);
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
	public static Pedido getPedido(String id, String idSupermarket) throws ExceptionUpdate {
		Pedido pedido = new Pedido(
				DataBaseSupermarketIdeal.getDadosPedido(id, idSupermarket));
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
	public static int amountOfOpenOrders(String idSupermarket) throws ExceptionUpdate {
		return DataBaseSupermarketIdeal.amountOfOpenOrders(idSupermarket);
	}

	/**
	 * Close the request
	 * @param id
	 * 		Id of the request
	 * @param idSupermarket
	 * 		Id of the supermarket
	 * @throws ExceptionUpdate
	 */
	public static void closeTheRequest(String id, String idSupermarket) throws ExceptionUpdate {
		DataBaseSupermarketIdeal.updateRequest(id, idSupermarket);
	}

}
