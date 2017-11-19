
public class WordCount {

	String string;
	
	public int CountWords(String str) {
		if(str == null || str.isEmpty())
			return 0;
		
		int count = 0;
		
		
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) !=' ') {
				count++;
				while(str.charAt(i) != ' ' && i<str.length()-1) {
					i++;
				}
			}
		}
		
		return count; 
	}
}
