import java.util.Scanner;


public class Questao13_IdentificarOCacula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a idade do João: ");
		int joao = sc.nextInt();
		System.out.println("Insira a idade do José: ");
		int jose = sc.nextInt();
		System.out.println("Insira a idade da Maria: ");
		int maria = sc.nextInt();
		
		if (joao < jose) {
			
			if (joao < maria) {
				
				System.out.println("O joão é o caçula! ");
				
			}}
			else if(jose < joao) {
			
				if (jose < maria) {
					
					System.out.println("José é o caçula! ");
					
				}}
			else if (maria < jose){
				
				if (maria < joao) {
				
				System.out.println("Maria é a caçula! ");
				
			}}
			
			
		
		sc.close();
	}

}
