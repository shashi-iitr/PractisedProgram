public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 62, 75, 35, 82, 41, 91, 87, 14, 42, 36 };
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <=arr.length-1; j++) {
				if (arr[j - 1] > arr[j]){
					a = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = a;
				}
			}
		}
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}