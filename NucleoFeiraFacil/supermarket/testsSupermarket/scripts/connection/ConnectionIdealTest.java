package testsSupermarket.scripts.connection;

import static org.junit.Assert.*;

import org.junit.Test;

import conexao.ConnectionIdeal;

public class ConnectionIdealTest {

	@Test
	public void testUS001_TC001TestarDownloadDeArquivo() {
		ConnectionIdeal cnx = new ConnectionIdeal();
		cnx.downloadFile();
	}

}
