package day6Labs;

//import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		String str = "racecar";
		
		StringBuffer b = new StringBuffer(str);
		
		b.reverse();
		
		if (str.equals(b.toString())) {
			System.out.println("String Is palindrone!");

		
/*		
		// Code to check for a palindrone
		boolean isPalindrone = true;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
			for (int i = 0; i < str.length()/2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
					isPalindrone = false;
					break;
				}
*/				
				
			}
		
		
/*		String str = "Hello World !";
		// Stores the results of for loop in an array
		String[] words = str.split(" ");
		// Formula for splitting words in an array
		for(int i = 0; i < words.length; i++)
			// Prints out results of loop in an array
			System.out.println(words[i]);
*/		
	}

		
		/*		char[] ar = {'H', 'e', 'l', 'l', 'o'};
		
		String str = new String (ar);
		// if the string is not null and equals "admin", then print.
		if (str != null && str.equals("admin")) {
			System.out.println("Hello Admin!");
		}
		
		if (str.endsWith("lo"))
			System.out.println("String ends with lo!");
		System.out.println(str);

	}
*/
}

/*for(int i=0; i<l; i++)
{
    ch=s.charAt(i);
    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
        pos=i; //storing the index of the first vowel
        break;
    }
}*/
