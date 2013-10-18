
public class threedarr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int threed[][][]= new int [4][5][6];

		int i, j, k;
for(i=0; i<4; i++)
	for(j=0; j<5; j++)
		for(k=0; k<6; k++)
		
			threed[i][j][k]=i*j*k;
			
		

for(i=0; i<4; i++){
	for(j=0; j<5; j++){
		for(k=0; k<6; k++)
System.out.print(threed[i][j][k] +" ");
		System.out.println();
	}
	System.out.println();

}
	}

}
