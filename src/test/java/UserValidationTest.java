
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
public class UserValidationTest {
    UserValidation user = new UserValidation();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateFirstName("Kirti");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateFirstName("kirti");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateLastName("Madan");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateLastName("Madan");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateEmailId("abcxyz@bridgelabz.co.on");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateEmailId("abc@xyz@bridgelabz.co.on");
        Assert.assertFalse(result);
    }

}