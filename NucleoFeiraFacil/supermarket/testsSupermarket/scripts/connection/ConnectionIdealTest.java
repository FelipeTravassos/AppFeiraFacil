package testsSupermarket.scripts.connection;

import org.junit.Test;

import conexao.ConnectionIdeal;

public class ConnectionIdealTest {

	@Test
	public void testUS001_TC001TestarDownloadDeArquivo() {
		ConnectionIdeal cnx = new ConnectionIdeal();
		cnx.downloadFile();
	}

}
