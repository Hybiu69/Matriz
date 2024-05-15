package Eclipse;

public class Atividade {

	public static void main(String[] args) {

		int m [][] = new int[5][5];
		int s = 0, v;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				v = (int)Math.round(Math.random()*100);

				if (v %2==0)
					m[i][j] = v;
				s = s + m[i][j];
			}
		}

		System.out.println("Matriz:");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" " + m[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("A soma é: " + s);
	}

}