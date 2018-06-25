import org.apache.log4j.Logger;
import org.testng.Reporter;

public class LongestWordAndSize {

	int max;
	String longWord;
	Logger logger = Logger.getLogger(LongestWordAndSize.class);
	
	
	// constructor
	LongestWordAndSize(String sentence){
		longWord = findLongestWord(sentence);
		logger.info("Longest word in the String is "+longWord);
		Reporter.log("Longest word in the String is "+longWord, true);
		max = findLongestWord(sentence).length();
		logger.info("Length of the longest word in the String is "+max);
		Reporter.log("Length of the longest word in the String is "+max, true);

	}
	

	// method to return String with max length
	String findLongestWord(String sentence){
		String longWord = "";
		int max	= 0;
		String[] words = sentence.split(" ");
		for(String word: words){
			if(max<word.length()){
				longWord = word;
				max = word.length();
			}
		}
		return longWord;
	}


}
