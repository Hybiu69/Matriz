package Eclipse;

public class a {

	public static void main(String[] args) {

		int m []	[] = new int[4][4];       
		int v;

		for (int i = 0; i < 4; i++) {
			v = (int)Math.round(Math.random()*100);
			m[i][i] = v++;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}