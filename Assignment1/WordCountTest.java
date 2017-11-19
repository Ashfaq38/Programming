import java.util.Scanner;

public class WordCountTest {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String string = scanner.nextLine();
		
		WordCount wordcount = new WordCount();
		
		int count = wordcount.CountWords(string);
		System.out.println("The word count for given String is : "+count);

	}

}
