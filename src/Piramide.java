import java.util.Scanner;

public class Piramide {
	
	private Scanner sc = new Scanner(System.in);
	private int linha;
	
	public static void main(String[] args) {
		new Piramide().criar();
	}
	
	private void criar() {
		System.out.println("Quantas linhas tem a pirâmide?");
		linha = sc.nextInt();
		int qtdBranco;
		int asteriscos = 1;
		
		for(int i = 0; i < linha; i += 1) {
			qtdBranco = linha - i;
			
			for(int x = 0; x < qtdBranco; x += 1) {
				System.out.print(' ');
			}
			for(int x = 0; x < asteriscos; x += 1) {
				System.out.print("*");
			}
			asteriscos += 2;
			System.out.println();
		}
	}
}
