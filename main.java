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
        Scanner passCheck = new Scanner(System.in); 
        System.out.println("Please insert password here");

        String Password = passCheck.nextLine();
        System.out.println("Your password is" + Password);
       
    }
}
 