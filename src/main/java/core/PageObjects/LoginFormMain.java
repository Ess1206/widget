package core.PageObjects;

import core.Element;
import org.openqa.selenium.By;

/**
 * Created by Stan on 12.06.2017.
 */
public class LoginFormMain extends LoginForm {

    Element email = new Element(By.id("user-email"), "email");
    Element pass = new Element(By.id("user-password"), "Pass");
    Element loginButon = new Element(By.cssSelector("#sign-in-form .submit"), "Login");

    @Override
    protected void typeLogin(String userName) {
            email.type(userName);
        }

    @Override
    protected void typePassword(String userPass) {
        pass.type(userPass);

    }

    @Override
    protected void clickSubmit() {
        loginButon.click();

    }
}
