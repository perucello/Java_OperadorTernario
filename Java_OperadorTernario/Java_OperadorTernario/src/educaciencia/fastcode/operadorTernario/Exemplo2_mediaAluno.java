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

public class Exemplo2_mediaAluno {

	public static void main(String[] args) {

		System.out.println("----------------------- Com_If_Else -----------------------");
		Com_If_Else();

		System.out.println("----------------------- Com_Ternario -----------------------");
		Com_Ternario();

	}

	public static void Com_If_Else() {
		int nota = 6;
		if (nota <= 5) {
			System.out.println("Reprovado.");
		} else {
			System.out.println("Aprovado!");
		}
	}

	/** Sintaxe do operador tern�rio: (express�o booleana) ? c�digo 1 : c�digo 2; */
	public static void Com_Ternario() {
		int nota = 5;
		System.out.println((nota <= 5) ? "Reprovado." : "Aprovado!");
	}

}
