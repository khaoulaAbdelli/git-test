package code.java.interview;

public class TestPalindrom {

	private static char[] charArray;
	
	public static void main(String[] args) {
		int x , y , z, temp;
		
		String pali = "tata";
		boolean test = TestPalindrom.revertString(pali);
		System.out.println(test);

	}
	 static boolean revertString(String palindrome) {
		 StringBuilder build = new StringBuilder();
		   build.append(palindrome);
		charArray = palindrome.toCharArray();
		for(int i=0;i<charArray.length-1;i++) {
			if(charArray[i]!=charArray[charArray.length-i+1])return false ;
		}
		return true ;
	}

}
