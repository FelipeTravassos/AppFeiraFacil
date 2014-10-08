package gerenciabd.interfaces;

import java.util.ArrayList;

import nucleoSupermercado.exceptions.ExceptionUpdate;

/**
 * 
 */
public interface IDataBaseSupermarket {

	/**
	 * Update database with supermarket database
	 * @throws ExceptionUpdate 
	 */
	public void updateBase() throws ExceptionUpdate;

	/**
	 * Get open requests
	 */
	public ArrayList<String> getPedidosEmAberto(String idSupermarket);

	/**
	 * Get data of request
	 * @param id
	 * 		Id of the request
	 * @param idSupermarket
	 * 		Id of the supermarket
	 */
	public String[] getDadosPedido(String id, String idSupermarket);

	/**
	 * Amount of open orders
	 * @param idSupermarket
	 * 		Id of the supermarket
	 */
	public int amountOfOpenOrders(String idSupermarket);

	/**
	 * Update request, if the request is opened the method sets 
	 * its state to closed, if other case, sets the request to opened
	 * @param id
	 * 		Id of the request
	 * @param idSupermarket
	 * 		Id of the supermarket
	 */
	public void updateRequest(String id, String idSupermarket);

	/**
	 * Verify if is a registered supermarket 
	 * @param idSupermarket
	 * 		Id of the supermarket
	 * @return
	 * 		True if it's a registered supermarket, false if it other case
	 */
	public boolean isSupermarket(String idSupermarket);
}
