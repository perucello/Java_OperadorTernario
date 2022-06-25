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

public class Exemplo4_acrescimo {

	public static void main(String[] args) {

		System.out.println("----------------------- salarioAcrescimo_IfElse -----------------------");
		salarioAcrescimo_IfElse();

		System.out.println("----------------------- salarioAcrescimo_Ternario -----------------------");
		salarioAcrescimo_Ternario();

	}

	public static void salarioAcrescimo_IfElse() {
		// double salario = 1000;
		double salario = 900;
		double bonus = 0;
		double total;

		if (salario > 1000) {
			bonus = salario * 0.10;
			total = salario + bonus;
		} else {
			bonus = salario * 0.15;
			total = salario + bonus;
		}

		System.out.println("Valor Salario: R$ " + salario);
		System.out.println("Valor Bonus: R$ " + bonus);
		System.out.println("Valor Total: R$ " + total);

	}

	/** Sintaxe do operador tern�rio: (express�o booleana) ? c�digo 1 : c�digo 2; */
	public static void salarioAcrescimo_Ternario() {
		// double salario = 1000;
		double salario = 900;

		double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
		double total = salario + bonus;

		System.out.println("Valor Salario: R$ " + salario);
		System.out.println("Valor Bonus: R$ " + bonus);
		System.out.println("Valor Total: R$ " + total);
	}

}
