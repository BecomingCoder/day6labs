package day6Labs;

/* Program to translate a word into pig latin:
	take first letter and move it to the end, add 'ay' suffix
	
	upgrade to include processing an entire line of input
*/

   import java.util.Scanner;
	
    public class Test
   {
       public static void main(String[] args)
      {
         Scanner sc = new Scanner(System.in);
         String word; // original word
         String pigLatin = "";  // pig latin translation, init to empty string
         char first;
         boolean cap = false;
         String userInput;
      
         System.out.print("enter line to translate: ");
         userInput = sc.nextLine();
         sc = new Scanner(userInput);
      	
      	// loop through all the words in the line
         while (sc.hasNext())	// is there another word?
         {
            word = sc.next();
            first = word.charAt(0);
            if ('A' <= first && first <= 'Z')  // first is capital letter
            {
               first = Character.toLowerCase(first);
               cap = true;
            }
            else
         		cap = false;
         
         // test if first letter is a vowel
            if 
            (first=='a' || first=='e' || first=='i' || first=='o' || first=='u')
            	pigLatin = word + "hay";
            else  // not a vowel
            {	
               if (cap)
               {
            	   pigLatin = "" + Character.toUpperCase(word.charAt(1));  // char to String conversion
            	   pigLatin = pigLatin + word.substring(2) + first + "ay";
               }
               else
            	   pigLatin = word.substring(1) + first + "ay";
            }
         
            System.out.print(pigLatin + " ");
         } // end of loop to process one word
      }
   }