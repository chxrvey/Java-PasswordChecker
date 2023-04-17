/*  PROJECT OUTLINE

    - Users are able to input passwords into the command prompt, from this point a test will be ran to check two criterias for a "Good" and "Strong" password.
    - This is to only be used within a Terminal and used for IT support / Developers only. 
    
    RULES TO FOLLOW

    - Source Control to be completed on GitHub
    - Stand-up meeting Test, and Unit testing is to be completed for each phase

 */


 import java.util.Scanner;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 
 public class main {
     public static void main(String[] args) {
         System.out.println("This is a password checker. Before checking the security level of your password, please check the following:");
         System.out.println("1. Please ensure there is a minimum of 8 characters.");
         System.out.println("2. You have used capital letters, symbols and numbers within the password.");
         System.out.println("3. Your password does not contain any work related words. \n");
 
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("Please enter your password:");
 
             String password = scanner.nextLine();
            //  System.out.println("Your password is " + password);
 
             Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");
             Matcher matcher = pattern.matcher(password);
 
             if (matcher.matches()) {
                 System.out.println("Your password is good");
             } else {
                 System.out.println("Your password is not sufficient, please update this.");
             }
         }
     }
 }
 

/* Class code

    - Lines 20 to 23, this provides directions for the user to check before checking their own password.
    - Line 25 scanner util has been used and I have created an object called "Pass Check", this object is where I have created my Input.
    - Line 26 Prints out text for my object, directing the user to the input within the terminal or console. 
    - Line 28 I create a new string called password that takes the input from my passCheck object, and this is then passed out into line 29 and printed for the user to see. 
 
    - Line 31, I am using the utility import to recognise special characters that can be used within the password.
    - Line 32 I am using the match util to look at the input from the password and registering again the pattern.

   The code bliock from 34 to 38 is a conditional block for the good criteria with checks that will occur. 
 */
 

 