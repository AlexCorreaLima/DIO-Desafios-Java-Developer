import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			double soma = 0;
			for(int k=0; k<x; k++) {
				double c = Math.pow(2, (k));
				soma = soma + c;
			}

			System.out.println((long)(soma/12000) + " kg");   //Complete o código aqui.
		}
		sc.close();
	}
}
