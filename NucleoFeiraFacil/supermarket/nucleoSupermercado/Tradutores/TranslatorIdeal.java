package nucleoSupermercado.Tradutores;

import gerenciabd.DataBaseSupermarketIdeal;
import conexao.ConnectionIdeal;
import nucleoSupermercado.exceptions.ExceptionUpdate;
import nucleoSupermercado.interfaces.ITranslator;

public class TranslatorIdeal implements ITranslator {

	ConnectionIdeal cnx = new ConnectionIdeal();
	DataBaseSupermarketIdeal bd = new DataBaseSupermarketIdeal();
	
	@Override
	public void update() throws ExceptionUpdate{
		cnx.downloadFile();
		//pegar o arquivo
		//atualizar bd
		
	}

}
