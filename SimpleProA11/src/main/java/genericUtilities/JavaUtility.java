package genericUtilities;

import java.util.Random;

public class JavaUtility {
	
	public int randomNumber() {
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}
	
}
