package pilha;

public class Fluxo {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        
        try {
        	metodo2();
        }catch (ArithmeticException | NullPointerException e) {
        	String msg = e.getMessage();
			System.out.println("Exceção: " + msg);
			//e.printStackTrace();//mostra o rastro da exceção, por onde os erros passaram
		}
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            try {
            	int a = i/0;
//            Conta c = null;
//            c.deposita();
//            }catch (ArithmeticException e) {
//				System.out.println("Não pode dividir por 0");
//			}
        }
        System.out.println("Fim do metodo2");
    }
}
