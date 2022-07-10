import java.util.Scanner;
public class FirstLetterPrinter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		splitwords(str);
	}
	static void splitwords(String str){
		String worlds[] = str.split(" ");
		for (int i = 0; i < worlds.length; i++){
			String s= worlds[i];
			System.out.print(s.charAt(0)); 
		}
	}
}