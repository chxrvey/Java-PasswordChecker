import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Critera2 {
    public static void main(String[] args){
        
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]{4,}"); 
        Matcher matcher = pattern.matcher("passCheck");



        if (matcher.find() && "passCheck".length() >= 12 ){
            System.out.println("Your password is good");
        } else if ("passCheck".length() >= 12) {
            System.out.println("Your password has no special characters");
        }
        else {
            System.out.println("Your password is not sufficient, please update this.");
        }
    }
}
