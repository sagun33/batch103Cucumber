package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPage {
//    USER STORY : US167854_manager_login_test
//NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
//AC:
//Given kullanici ana sayfada
//When kullanici login sayfasina gider
//And kullanıcı adini girer
//And sifreyi girer
//And login buttoning basar
//Then login islemi gerçekleşir
//ARTIFACT:
//url : https://www.bluerentalcars.com/
//Credentials:
//                {"sam.walker@bluerentalcars.com","c!fas_art"},
//                {"kate.brown@bluerentalcars.com","tad1$Fas"},
//                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
//                {“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
//NOT: scenario outline kullanalim
public BlueRentalCarsPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(partialLinkText = "Login")
    public WebElement loginLink;

@FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement error_message_1;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;
}

