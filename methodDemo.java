import java.lang.String;
class methodDemo{
	// void 
	 static void factorial(int x){
	 	int f1 =1;
	 	for( int i =1 ; i<=x ; i++)
	 		f1*=i;
	 	System.out.println("factorial"+f1);
	 }
// return type
	  static int fact(int v){
	 	int fa =1;
	 	for( int i =1 ; i<=v ; i++)
	 		fa*=i;
	 	return fa;
	 }

	 public static void main(String[] args) 
	 {
	 
	 	int n1 = 4 + (int)(Math.random()*8);
	 	System.out.println(n1);
	 	factorial(n1);
	 
	 	int n2 = 4 + (int)(Math.random()*6);
	 	System.out.println(n2);
	 	factorial(n2);
	 
	 	int n3 = 4 + (int)(Math.random()*10);
	 	System.out.println(n3);
	 	factorial(n3);
// when int type is given
	 
	 	int n = 4 + (int)(Math.random()*8);
	 	System.out.println(n);
	 	System.out.println(fact(n));
	
	 	int nu = 4 + (int)(Math.random()*6);
	 	System.out.println(nu);
	 	System.out.println(fact(nu));
	 
	 	int n4 = 4 + (int)(Math.random()*10);
	 	System.out.println(n4);
	 	System.out.println(fact(n4));
	 }
}