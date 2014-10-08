package conexao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import conexao.interfaces.IConexao;

public class ConnectionIdeal implements IConexao {
	
	public void downloadFile (){
		String protocolo="http";
        String endereco ="ideal.com.br";
        String arquivo="/arquivos/produtos.txt";
        try {
            //cria URL
        	URL url1 = new URL(protocolo,endereco,arquivo);
		    //abre uma conexao na url criada àcima
		    URLConnection con =  url1.openConnection();
		    //tenta conectar.
		    con.connect();
		    //arquivo de saida
		    FileOutputStream fileOut = new FileOutputStream("c:/eagleBrazilSoftwares/feirafacil/ideal/produtos.txt");
		    int c=0;
		    do{
		    	//le o byte
		        c=con.getInputStream().read();
		        //escreve o byte no arquivo saida
		        fileOut.write(c);
	        }while(c !=-1);
			    //fecha o arquivo de saida
			    fileOut.close();
			    System.out.println("Arquivo baixado com sucesso");
        }catch(IOException e){  
        	e.printStackTrace();
		}
	}
}
