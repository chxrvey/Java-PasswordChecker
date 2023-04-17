/*  Criteria 1
    GOOD PASSWORD
    
    - This is the Criteria for the "Good" Password, for this criteria to be met the following must be:

    1. 8 to 10 Characters in length
    2. Include 2 symbols, numbers or captials
    3. None work related words such as: "Inconnection", "Events", "Hospitality", "name" or "DOB".

    
 */

 import java.util.regex.Matcher;
 import java.util.regex.Pattern;


    public class Criteria1 {
        public Criteria1(String password) {
        }

        public static void main(String[] args) {
           
           Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$"); 
           Matcher matcher = pattern.matcher("passCheck");
   
   
           if (matcher.matches()){
               System.out.println("Your password is good");
           } 
           else {
               System.out.println("Your password is not sufficient, please update this.");
           }
       } 
       
   }
   

/*  
   Line 20, I am using the utility import to recognise special characters that can be used within the password.
   Line 21 I am using the match util to look at the input from the password and registering again the pattern.

   The code bliock from 24 to 29 is a conditional block for the good criteria with checks that will occur. 
 */