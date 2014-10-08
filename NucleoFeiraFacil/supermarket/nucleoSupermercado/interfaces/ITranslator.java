package nucleoSupermercado.interfaces;

import nucleoSupermercado.exceptions.ExceptionUpdate;

/**
 * @author Felipe
 * Interface for translator of supermarkets
 */
public interface ITranslator {

	/**
	 * Pega os dados dos produtos como nome, pre�o, descri��o 
	 * e atualiza a base de dados do feira f�cil. 
	 * @throws ExceptionUpdate 
	 */
	public void update() throws ExceptionUpdate;
}
