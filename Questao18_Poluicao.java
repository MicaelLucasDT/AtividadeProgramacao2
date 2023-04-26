import java.util.Scanner;

public class Questao18_Poluicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o índice de poluição: ");
		double poluicao = sc.nextDouble();
		
		if (poluicao >= 0.05) {
			
			if (poluicao <= 0.25) {
				
				System.out.println("O nível de poluição está em ACEITÁVEL!");
				
			}
			
		}
		
		else if (poluicao > 0.25) {
			
			if (poluicao <= 0.3) {
				
				System.out.println("O nível de poluição exige suspensão das atividades!");
				
			}
			
		}
		
		else if (poluicao > 0.3) {
			
			if (poluicao <= 0.4) {
				
				System.out.println("Atividades suspensas e multa! ");
				
			}
			
		}
		
		else if (poluicao > 0.4) {
			
			if (poluicao <= 0.5) {
				
				System.out.println("TODOS OS GRUPOS. Parada de suas atividades!!! ");
				
			}
			
		}
		
		sc.close();

	}

}
