package conexao;

public class Teste {

	public static void main(String[] args) {

		//Utilizando o contrato AutoCloseable, instânciamos a nova conexao entre parênteses e
		//basta abrir a conexao, que será gerado automaticamente o fechamento da conexão
		//try e finally, o catch é necessário fazer
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
