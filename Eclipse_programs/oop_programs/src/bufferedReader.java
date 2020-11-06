import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		
		String str = br.readLine();
		System.out.println("string value is: "+str);
		
		int x =  Integer.parseInt(br.readLine());
		System.out.println("the integer value is: "+x);
		
		double d = Double.parseDouble(br.readLine());
		System.out.println("the value of double is: "+d);
		
	}

}
