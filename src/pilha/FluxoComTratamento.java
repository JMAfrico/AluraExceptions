package pilha;

public class FluxoComTratamento {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
//        try {
       	metodo1();
//        }catch (ArithmeticException | NullPointerException e) {
//        	String msg = e.getMessage();
//			System.out.println("Exceção: " + msg);
//			e.printStackTrace();//mostra o rastro da exceção, por onde os erros passaram
//		}
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
//        ArithmeticException ex = new ArithmeticException("Deu Ruim!");
//        throw ex;
        throw new ArithmeticException("Deu Ruim!");
        //System.out.println("Fim do metodo2");
    }
}
