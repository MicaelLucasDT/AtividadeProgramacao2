import java.util.Scanner;

public class Questao_9_TestesEncadeados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número para comparar: ");
		double num1 = sc.nextDouble();
		System.out.println("Insira o segundo número: ");
		double num2 = sc.nextDouble();
		
		if( num1 > num2 ) {
			
			System.out.println("O " + num1 + "é maior que " + num2 + '!');
			
		}
		else {
			
			System.out.println("O " + num2 + "é maior que " + num1 + '!');
			
		}
		
		
		
		
		sc.close();

	}

}
