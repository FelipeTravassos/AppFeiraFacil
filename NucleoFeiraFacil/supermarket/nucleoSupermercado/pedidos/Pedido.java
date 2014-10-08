package nucleoSupermercado.pedidos;

/**
 * Class Pedido
 * @author Felipe
 */
public class Pedido {

	String[] pedidos;
	
	/**
	 * Default constructor
	 * @param pedidos
	 */
	public Pedido(String[] pedidos) {
		setPedidos(pedidos);
	}

	/**
	 * Get requests
	 * @return String[] with requests
	 */
	public String[] getPedidos() {
		return pedidos;
	}

	/**
	 * Set requests
	 * @param pedidos
	 */
	public void setPedidos(String[] pedidos) {
		this.pedidos = pedidos;
	}
}
