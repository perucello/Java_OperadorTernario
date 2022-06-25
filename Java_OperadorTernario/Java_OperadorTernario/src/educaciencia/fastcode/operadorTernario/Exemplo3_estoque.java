package educaciencia.fastcode.operadorTernario;
/**
Com IF
 if (condi��o) 
 	{c�digo para execu��o em caso de valida��o positiva da condi��o} 
	else 
	{c�digo para execu��o em caso de valida��o negativa da condi��o}
 
Tern�rio - lembre-se
 <EXPRESS�O BOOLEANA> ? <Valor se EXPRESS�O BOOLEANA � true> : <Valor se EXPRESS�O BOOLEANA � false>;

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

	/** Sintaxe do operador tern�rio: (express�o booleana) ? c�digo 1 : c�digo 2; */
	public static void estoque_Ternario() {
		int estoque = 100;
		System.out.println(estoque > 99 ? "Estoque OK !" : "Estoque abaixando");

	}

}
