
public class insertionsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={23,45,34,13,56,67,7,56,35,59};
int b=0;
for(int i=0; i<a.length; i++)
{
	if(a[i+1]>a[i])
		b=a[i];
	else
		b=a[i+1];
	
}
for(int i=0; i<a.length; i++)
	System.out.println(b);

		
	}

}
