import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserValidation {
    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");
    static Pattern lastName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    public boolean validateFirstName(String testFirstName){
        Matcher matcher = firstName.matcher(testFirstName);
        return matcher.matches();
    }

    public boolean validateLastName(String testLastName){
        Matcher matcher = lastName.matcher(testLastName);
        return matcher.matches();
    }


}
