package nucleoSupermercado.interfaces;

import nucleoSupermercado.exceptions.ExceptionUpdate;

/**
 * @author Felipe
 * Interface for translator of supermarkets
 */
public interface ITranslator {

	/**
	 * Pega os dados dos produtos como nome, preço, descrição 
	 * e atualiza a base de dados do feira fácil. 
	 * @throws ExceptionUpdate 
	 */
	public void update() throws ExceptionUpdate;
}
