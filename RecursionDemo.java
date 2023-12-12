class RecursionDemo{
static int n = 1;
public static void main(String[] args) {
		String[] cdac = null;
		if (n <= 100){
			System.out.println(n++ + " ");
			main(cdac);
		}
	}	
}