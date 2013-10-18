import java.util.Scanner;
public class IntersectTwoLines {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x1=in.nextInt();
		int x2=in.nextInt();
		int y1=in.nextInt();
		int y2=in.nextInt();
		int a1=in.nextInt();
		int a2=in.nextInt();
		int b1=in.nextInt();
		int b2=in.nextInt();
		if(inters(x1, x2, y1, y2, a1, a2, b1, b2)){
			System.out.print("yep");
		} else System.out.print("nah");
	}

	
	static boolean inters(int x1, int x2, int y1, int y2, int a1, int a2, int b1, int b2){
		int m1=(int)((y2-y1)/(x2-x1));
		int m2=(int) ((b2-b1)/(a2-a1));
		if(m1!=m2){
			return false;
		}
		return true;
	}
}