package conexao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

import conexao.interfaces.IConexao;

/**
 * ConnectionIdeal class
 * @author Felipe
 */
public class ConnectionIdeal implements IConexao {
	final String protocolo="http";
	final String stringUrl ="ftp://192.168.1.10:2121/sdcard/Documents/tsteConexao.txt";
	final String arquivo ="sdcard/Documents/tsteConexao.txt";
	final String pathLocal = "c:/eagleBrazilSoftwares/feirafacil/ideal/produtosIdeal.txt";
	
	/**
	 * Download of file of supermarket with name, description and price.
	 * @return
	 * 		file that was downloaded
	 */
	public File downloadFile() {
		try {
			URL url = new URL(stringUrl);
			InputStream is = url.openStream();
			FileOutputStream fos = new FileOutputStream(pathLocal);
			int umByte = 0;
			while ((umByte = is.read()) != -1){
				fos.write(umByte);
			}
			is.close();
			fos.close();
			return new File(pathLocal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Path of file that was downloaded
	 * @return
	 * 		String with path of file
	 */
	public String pathOfFile(){
		return this.pathLocal;
	}
}
