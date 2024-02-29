import java.util.Scanner;
import java.time.LocalDate;

public class Aula2 {

	public static void main(String[] args) {
		//ex0();
		//ex1();
		//ex2();
		//ex3();
		//ex4();
	}
	
	private static void ex0() {
		System.out.println("Hello Universe");
		
	}
	
	private static void ex1() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Qual a seu ano de nascimento?"); 
		int nascimento = entrada.nextInt();
		
		LocalDate d2 = LocalDate.now();
		int anoatual = d2.getYear();
		
		System.out.println("Sua idade é " + (anoatual - nascimento)); 
		entrada.close();	
	}
	
	private static void ex2() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero:");
		int n1 = teclado.nextInt();
		System.out.println("Digite agora um nome:");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.println("O numero digitado foi " +n1+ " e o nome foi " +nome+ ".");
		teclado.close();
	}

	private static void ex3() {
		String nome, apelido;
		nome = "João Gabriel";
		apelido = nome;
		nome = null;
		System.out.println(apelido);
	}
	
	private static void ex4() {
		int SALARIOMIN = 1412;
		Scanner Entrada = new Scanner (System.in);
		System.out.println("Digite seu salário:");
		int salario = Entrada.nextInt();
		System.out.println("A diferença é: " + (salario - SALARIOMIN));
	}
	
}
