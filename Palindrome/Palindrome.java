import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.base.Preconditions;


public class Palindrome {

//	@Test
//	public void testPalindrome(){
//		assertTrue(isPalindrome("radar"));
//		assertFalse(isPalindrome("radsr"));
//		assertTrue(isPalindromeNonRecursive("radar"));
//		assertFalse(isPalindromeNonRecursive("radsr"));
//	}
	
	public static void main(String[] args){
		System.out.println(isPalindrome("radar"));
		System.out.println(isPalindrome("cat"));
	}
	
	
	public static boolean isPalindrome(String s){
		Preconditions.checkNotNull(s,"Cannot check a null string is a palindrome");
		Preconditions.checkArgument(!s.isEmpty(), "Cannot check an empty string");
		
		int len=s.length();
		if(len<=1) return true;
		
		char first = s.charAt(0);
		char last = s.charAt(len-1);
		
		if (first == last)
			return isPalindrome(s.substring(1, len-1));
		else
			return false;
		

	}
	
	public static boolean isPalindromeNonRecursive(String s){
		Preconditions.checkNotNull(s, "Cannot check a null string is a palindrome");
		Preconditions.checkArgument(!s.isEmpty(), "Cannot check an empty string");
		
		int left = 0;
		int right = s.length()-1;
		
		while (left<right){
			if(s.charAt(left)!=s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;	
	}
}
