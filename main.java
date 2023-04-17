/*  PROJECT OUTLINE

    - Users are able to input passwords into the command prompt, from this point a test will be ran to check two criterias for a "Good" and "Strong" password.
    - This is to only be used within a Terminal and used for IT support / Developers only. 
    
    RULES TO FOLLOW

    - Source Control to be completed on GitHub
    - Stand-up meeting Test, and Unit testing is to be completed for each phase

 */


 import java.util.Scanner; 
//  This import allows me have user inputs 


class Main {
    public static void main(String[]    args) {

        System.out.println("This is a password checker. Before checking the securtiy level of your password, please check the following:");
        System.out.println("1. Please ensure their is a minimum of 8 characters.");
        System.out.println("2. You have used capital letters, symbols and numbers within the password.");
        System.out.println("3.Your password does not contain any work related words. \n");
        

        try (Scanner passCheck = new Scanner(System.in)) {
            System.out.println("Please insert password here");

            String Password = passCheck.nextLine();
            System.out.println("Your password is " + Password);


        } 
       
    }
}

/* Class code

    - Lines 21 to 24, this provides directions for the user to check before checking their own password.
    - Line 27 scanner util has been used and I have created an object called "Pass Check", this object is where I have created my Input.
    - Line 28 Prints out text for my object, directing the user to the input within the terminal or console. 
    - Line 30 I create a new string called password that takes the input from my passCheck object, and this is then passed out into line 24 and printed for the user to see. 
 
 */
 

 