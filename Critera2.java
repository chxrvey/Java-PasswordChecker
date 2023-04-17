/*  Criteria 2
    GOOD PASSWORD
    
    - This is the Criteria for the "Good" Password, for this criteria to be met the following must be:

    1. 8 to 10 Characters in length
    2. Include 2 symbols, numbers or captials
    3. None work related words such as: "Inconnection", "Events", "Hospitality", "name" or "DOB".

    
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Critera2 {
    public static void main(String[] args){
        
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]{4,}"); 
        Matcher matcher = pattern.matcher("password");



        if (matcher.find() && "passCheck".length() >= 14 ){
            System.out.println("Your password is good");
        } else if ("passCheck".length() >= 14) {
            System.out.println("Your password has no special characters");
        }
        else {
            System.out.println("Your password is not sufficient, please update this.");
        }
    }
}


/*  
   Line 21, I am using the utility import to recognise special characters that can be used within the password.
   Line 22 I am using the match util to look at the input from the password and registering again the pattern.

   The code bliock from 24 to 29 is a conditional block for the good criteria with checks that will occur. 
 */