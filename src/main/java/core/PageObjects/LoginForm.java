package core.PageObjects;

import core.MethodsFactory;

/**
 * Created by Stan on 12.06.2017.
 */
public abstract class LoginForm extends MethodsFactory {

//    abstract protected void openPage(String url);

    abstract protected void typeLogin(String userName);

    abstract protected void typePassword(String userPass);

    abstract protected void clickSubmit();

    public void login(String login, String pass) {
        typeLogin(login);
        typePassword(pass);
        clickSubmit();
    }

}
