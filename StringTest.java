import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class StringTest {


	// Test to find longest word in a sentence and its size
	@Test (dataProvider="getData")
	public void unitTest(String sent){
		LongestWordAndSize objLWS = new LongestWordAndSize(sent);
		Assert.assertTrue(objLWS.longWord.equalsIgnoreCase("jumped"));
		Assert.assertTrue(objLWS.max==6);
		
	}

	@DataProvider
	public Object[][] getData(){
		return new Object[][] { { "The cow jumped over the moon" }};
	}

}
