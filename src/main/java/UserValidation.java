import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserValidation {
    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    public boolean validateFirstName(String testFirstName){
        Matcher matcher = firstName.matcher(testFirstName);
        return matcher.matches();
    }

}
