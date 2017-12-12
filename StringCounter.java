import java.util.Scanner;

public class StringCounter {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		String inputStr= kb.nextLine();
		String[] tokens = inputStr.split(" ");
		for (String s : tokens){
			System.out.println(s);
			
		}
		System.out.println(tokens.length);
	}
}
