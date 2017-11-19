package core.PageObjects;

import core.Element;
import core.MethodsFactory;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 12.06.2017.
 */
public class MatchPage extends MethodsFactory {

    Element likeButton = new Element(By.cssSelector(".button--matches-like"),"like");
    Element dislikeButton = new Element(By.cssSelector(".button--matches-like"),"DisLike");
    Element userID = new Element(By.cssSelector(".matches-carousel [data-uid]"),"ID user");

    public void open(){
        get("https://kismia.com/matches");
    }

    public String getCurrentUserID(){
        return userID.getAttribute("data-uid");
    }

    public List<String> disLikeUser(int count){
        List<String> userLiset = new ArrayList<>();
        for (int i=0; i<count; i++){
            String currentuserID = getCurrentUserID();
            userLiset.add(currentuserID);
            dislikeButton.click();
        }
        return userLiset;
    }

}
