import java.lang.String;
import java .io.*;
public class BRDemo{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		
		System.out.println("Enter name");
		String name = br.readLine();


		System.out.println(name);

	}
}