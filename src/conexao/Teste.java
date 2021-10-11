package conexao;

public class Teste {

	public static void main(String[] args) {

		//Utilizando o contrato AutoCloseable, inst�nciamos a nova conexao entre par�nteses e
		//basta abrir a conexao, que ser� gerado automaticamente o fechamento da conex�o
		//try e finally, o catch � necess�rio fazer
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch (IllegalStateException e) {
			System.out.println("Erro na conexao");
		}
		
		//-----------------------
		
//		Conexao conexao = null;
//
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//
//		} catch (IllegalStateException e) {
//			System.out.println("Erro na conexao");
//
//		} finally {
//			if(conexao != null) {
//				conexao.close();
//			}
//		}

	}
}
