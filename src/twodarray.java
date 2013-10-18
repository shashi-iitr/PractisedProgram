public class twodarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twod[][] = new int[5][5];
		int i, j;
		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++) {
				twod[i][j] = i + j;

			}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++)

				System.out.print(twod[i][j] + " ");
			System.out.println();
		}
	}

}
