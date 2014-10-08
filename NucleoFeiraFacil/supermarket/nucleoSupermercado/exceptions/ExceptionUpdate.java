package nucleoSupermercado.exceptions;

/**
 * Class ExceptionUpdate
 * @author Felipe
 */
public class ExceptionUpdate extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Falha de atualização, verifique sua conexão";
	}
}
