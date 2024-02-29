import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Calculadora {

	public static void main(String[] args) {
		//nome();
		//CalculoIdade();
		//datas();
		//CalculoIdade2();
		//pularLinha();
		testeErro();
	}
	
	private static void nome() {		System.out.println("Qual seu nome?");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		System.out.println("Meu nome é " + nome);
	}
	
	private static void CalculoIdade() {
		System.out.println("Qual seu ano de nascimento?");
		Scanner entrada = new Scanner(System.in);
		int anoNascimento = entrada.nextInt();
		int idade = 2024 - anoNascimento;
		System.out.println("Sua idade é: " + idade + " anos.");
		//Ou ("idade" + (2024- ano));
	}
	
	private static void datas() {
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora: " + horaAtual);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora: " + dataHoraAtual);
		
	}
	
	private static void CalculoIdade2() {
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Qual seu ano de nascimento?");
		Scanner entrada = new Scanner(System.in);
		
		int anoNascimento = entrada.nextInt();
		int idade = dataAtual.getYear() - anoNascimento;
		System.out.println("Sua idade é: " + idade + " anos.");	
		
	}
	
	private static void pularLinha() {
		System.out.println("Qual seu nome?");
		Scanner entrada = new Scanner(System.in);
		String fulano = entrada.nextLine();
		System.out.println("Boa noite "+ fulano + "\nVocê já é usa haki?");
	}
	
	private static void testeErro() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite agora um nome: ");
		entrada.nextLine();
		String nome = entrada.nextLine();
		System.out.println("O número digitado foi " + n1+ " e nome foi " + nome);
		
		
	}
	
}
