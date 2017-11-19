import java.util.Scanner;

public class DuplicateCount 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The String\n");
		String input = scanner.nextLine();
		String input1 = input.toLowerCase();
		String[] words=input1.split(" ");	//Split the word from String
		int count=1;							//Variable for getting Repeated word count
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					count += 1;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0" && count>1)
			System.out.println(words[i]+"--"+count);	//Printing the word along with count
			count=1;
			
	     }  
			
	}

}   