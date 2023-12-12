import java.util.Scanner;
import java.lang.String;
class diaSum{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[][] ar = new int[3][3];
		int sum=0;

		 for (int i = 0 ; i<ar.length ; i++){
		 	for ( int j=0 ; j<ar[i].length ; j++){
		 		System.out.println("Enter elements");
		          ar[i][j] = s.nextInt();
                    if(ar[i][j] == ar[j][i] ){
             	     sum+=ar[i][j];
             }      
		 	}
		 }
		 /*for (int i = 0 ; i<ar.length ; i++){
		 	System.out.println();
		 	for ( int j=0 ; j<ar[i].length ; j++){
                  System.out.print(ar[i][j]+" ");
              }
          }*/
          System.out.println("Sum of Diagonal"+ sum);
	}

}