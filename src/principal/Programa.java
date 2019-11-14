package principal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("N�mero de linhas : ");
		int l = sc.nextInt();
		System.out.println("N�mero de colunas : ");
		int c = sc.nextInt();
		
		int[][] matriz = new int[l][c];
		
		
		for (int i=0; i<matriz.length; i++) {
		  for (int j=0; j<matriz[i].length; j++) {
			System.out.println("n�mero[" + i + "][" + j +"] :");  
			matriz[i][j] = sc.nextInt();  
		  }	
		}
		
		System.out.println("Quem achar : ");
		int x = sc.nextInt(); // quem achar
		int k = 0;
		
		for (int i=0; i<matriz.length; i++) {
		  for (int j=0; j<matriz[i].length; j++) {
			if (matriz[i][j] == x) {
				k = matriz[i][j];
				System.out.println("Posi��o " + i + "," + j + ":");
				if (j > 0) {
					System.out.println("� esquerda: " + matriz[i][j-1]);
				}
				if (i > 0) {
					System.out.println("Em cima: " + matriz[i-1][j]);
				}
				if (j < matriz[i].length-1) {
					System.out.println("� direita: " + matriz[i][j+1]);
				}
				if (i < matriz.length-1) {
					System.out.println("Em baixo: " + matriz[i+1][j]);
				}
			}
		  }	
		}
		
		if (k != x) {System.out.println("N�mero n�o existe na matriz");}
		
		sc.close();
	}

}
