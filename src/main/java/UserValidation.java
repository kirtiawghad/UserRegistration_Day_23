import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserValidation {
    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");
    static Pattern lastName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");
    static Pattern emailId = Pattern.compile("^([A-Za-z0-9]{3,}+)((?:[\\.\\+\\-][a-zA-Z0-9]+)*)@([a-z0-9]{1,}+)\\.([a-z]{2,}+)((?:\\.[a-zA-Z]+)?)$");

    public boolean validateFirstName(String testFirstName){
        Matcher matcher = firstName.matcher(testFirstName);
        return matcher.matches();
    }

    public boolean validateLastName(String testLastName){
        Matcher matcher = lastName.matcher(testLastName);
        return matcher.matches();
    }

    public boolean validateEmailId(String testEmailId){
        Matcher matcher = emailId.matcher(testEmailId);
        return matcher.matches();
    }



}
