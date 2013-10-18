package shashi.sort;

public class QuickSort {
	public static void main(String[] args) {

        int [] A={3,6,3,2,6,5,1,4};
        int N=A.length;
        quickSort(A, 0, N - 1);
        for(int i=0; i<N; i++){
        	System.out.print(A[i]+" ");
        }
    }

    static void quickSort(int[] a, int p, int r){
        if(p<r)
        {
            int q=partition(a,p,r);
            quickSort(a,p,q-1);
            quickSort(a,q+1,r);
        }
    }

   static int partition(int[] a, int p, int r) {
        int x = a[p];
        int i = p;
        int j = r ;
        while (i<j) {
            while (a[i] <=x && i<a.length-1)
                i++;
            while (a[j] > x)
                j--;
            if (i < j)
                swap(a, i, j);
            
        }
        a[p]=a[j];
        a[j]=x;
        return j;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}