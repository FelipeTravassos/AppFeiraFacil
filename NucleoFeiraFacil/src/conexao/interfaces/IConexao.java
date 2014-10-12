package conexao.interfaces;

import java.io.File;

public interface IConexao {
	
	/**
	 * Download of file of supermarket with name, description and price.
	 * @return
	 * 		file that was downloaded
	 */
	public File downloadFile();
	
	/**
	 * Path of file that was downloaded
	 * @return
	 * 		String with path of file
	 */
	public String pathOfFile();
}
