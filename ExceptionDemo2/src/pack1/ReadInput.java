package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {
	public int readInput() throws IOException, ArithmeticException{
		//reads as byte, converts to char, from keyboard
		InputStreamReader ir = new InputStreamReader(System.in);
		//memories which store a set of characters
		BufferedReader br = new BufferedReader(ir);
		
		//added throws IOException to correct warning/error
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		return(Integer.parseInt(str1)/Integer.parseInt(str2));
	}
}

