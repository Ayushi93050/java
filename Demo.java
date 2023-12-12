import java.util.Scanner;
class Demo{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] m1 = new int[3][4];

		//populate array
		for(int i = 0 ; i<m1.length;i++){
			for(int j = 0 ; j<m1[i].length ; j++){
              System.out.println("Enter element");
              m1[i][j] = s.nextInt();
             }
		}
		// printing 2d array
		for(int i = 0 ; i<m1.length;i++){
			System.out.println();
			for(int j = 0 ; j<m1[i].length ; j++){
              System.out.print(m1[i][j]+" ");	
	        }
        }
   }
} 