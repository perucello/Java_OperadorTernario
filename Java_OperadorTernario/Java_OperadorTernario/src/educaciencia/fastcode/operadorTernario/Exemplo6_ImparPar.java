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

public class Exemplo6_ImparPar {

	public static void main(String[] args) {

		System.out.println("----------------------- Com_If_Else_ImparPar -----------------------");
		Com_If_Else_ImparPar();

		System.out.println("----------------------- Com_Ternario_ImparPar -----------------------");
		Com_Ternario_ImparPar();

	}

	public static void Com_If_Else_ImparPar() {
		int numero = 10; // resultado deve ser "par"
		int numero2 = 7; // resultado deve ser "Impar"
		if (numero % 2 == 1)
			System.out.println("O numero � Impar " + numero);
		else
			System.out.println("O numero � Par " + numero);

		if (numero2 % 2 == 1)
			System.out.println("O numero � Impar " + numero2);
		else
			System.out.println("O numero � Par " + numero2);
	}

	/** Sintaxe do operador tern�rio: (express�o booleana) ? c�digo 1 : c�digo 2; */
	public static void Com_Ternario_ImparPar() {
		int numero = 10; // resultado deve ser "par"
		int numero2 = 7; // resultado deve ser "Impar"
		System.out.println((numero % 2 == 1) ? "O numero � Impar " + numero : "O numero � Par " + numero);
		System.out.println((numero2 % 2 == 1) ? "O numero � Impar " + numero : "O numero � Par " + numero);
	}

}
