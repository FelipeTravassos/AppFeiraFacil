package nucleoSupermercado.pedidos;

import java.util.Iterator;

import nucleoSupermercado.exceptions.ExceptionUpdate;
import nucleoSupermercado.utils.VerifyConsistency;

/**
 * Class Pedidos
 * @author Felipe
 */
public class Pedidos {

	GerPedidos gerPedidos = new GerPedidos();
	
	/**
	 * Iterator with id of requests in order
	 */
	Iterator<String> idOrders;
	
	/**
	 * id of supermarket
	 */
	String idSupermarket;
	
	/**
	 * Default constructor
	 */
	public Pedidos(String idSupermarket) throws ExceptionUpdate{
		VerifyConsistency.verifyIdSupermarket(idSupermarket);
		update();
		this.idSupermarket = idSupermarket;
	}
	
	/**
	 * Update the iterator with the ids of the next orders
	 */
	private void update() throws ExceptionUpdate{
		idOrders = gerPedidos.getPedidosEmAberto(this.idSupermarket).iterator();
	}
	
	/**
	 * Amount of open orders
	 * @return integer with amount of open orders
	 */
	public int amountOfOpenOrders() throws ExceptionUpdate{
		return gerPedidos.amountOfOpenOrders(this.idSupermarket);
	}
	
	/**
	 * Close the request
	 * @param id of request complete
	 */
	public void closeTheRequest(String id) throws ExceptionUpdate{
		gerPedidos.closeTheRequest(id, this.idSupermarket);
	}
	
	/**
	 * Get next request
	 * @return Object type Pedido with the next request
	 */
	public Pedido getProximoPedido() throws ExceptionUpdate{
		if(!idOrders.hasNext()){
			update();
		}
		if(idOrders.hasNext()){
			return gerPedidos.getPedido(idOrders.next(), this.idSupermarket);
		}else{
			return null;
		}
	}
}
