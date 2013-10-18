

import java.util.Arrays;

public class SortTwoSortedArray {

	public static void main(String arg[]) {
		int[] a = { 1, 3, 4, 5, 6, 7, 8 };
		int[] b = { 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}

		System.out.print(Arrays.toString(c));
	}

}
