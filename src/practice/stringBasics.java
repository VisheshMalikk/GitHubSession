package practice;

import java.text.SimpleDateFormat;

public class stringBasics {

	public static void main(String[] args) {
		
		String timeStamp = new SimpleDateFormat("MM/dd/yyy KK:mm a").format(new java.util.Date());
		System.out.println(timeStamp);
		System.out.println("Vishesh Malik");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}

}
