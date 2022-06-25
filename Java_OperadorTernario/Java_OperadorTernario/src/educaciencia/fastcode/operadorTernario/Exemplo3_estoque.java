package educaciencia.fastcode.operadorTernario;
/**
Com IF
 if (condição) 
 	{código para execução em caso de validação positiva da condição} 
	else 
	{código para execução em caso de validação negativa da condição}
 
Ternário - lembre-se
 <EXPRESSÃO BOOLEANA> ? <Valor se EXPRESSÃO BOOLEANA é true> : <Valor se EXPRESSÃO BOOLEANA é false>;

 */

public class Exemplo3_estoque {

	public static void main(String[] args) {

		System.out.println("----------------------- estoque_ifElse -----------------------");
		estoque_ifElse();

		System.out.println("----------------------- estoque_Ternario -----------------------");
		estoque_Ternario();

	}

	public static void estoque_ifElse() {

		int estoque = 100;
		if (estoque > 99) {
			System.out.println("Estoque OK");
		} else {
			System.out.println("Estoque abaixando");
		}

	}

	/** Sintaxe do operador ternário: (expressão booleana) ? código 1 : código 2; */
	public static void estoque_Ternario() {
		int estoque = 100;
		System.out.println(estoque > 99 ? "Estoque OK !" : "Estoque abaixando");

	}

}
