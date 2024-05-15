package Eclipse;

import java.util.Scanner;

public class Eclipse {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);

		int m[][] = new int [10][10];

		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				m [i][j] =(int)Math.round(Math.random()*100);
			}
		}
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				System.out.println("Os Valores são " +m [i][j]);
			}
		}
		ler.close();
	}
}