package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementPage {
    public ViceDeanManagementPage()
    { PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//td")
    public WebElement table;



    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButon;

    @FindBy(xpath = "//a[.='Vice Dean Management']")
    public  WebElement viceDeanManagementLink;

    @FindBy(xpath = "//a[.='Dean Management']")
    public  WebElement deanManagementLink;


    @FindBy(xpath = "(//*[@class='page-link'])[5]")
    public WebElement pageLinkLastPage;




    @FindBy(xpath = "//*[@id='name']")
    public WebElement viceDeanName;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surName;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;


    @FindBy(xpath = "(//*[@name='gender'])[1]")
    public WebElement radioButtonGenderFemale;

    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement radioButtonGenderMale;


    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement nameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surNameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement dateOfBirthRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement ssnRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement userNameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement passwordRequired;

    @FindBy(xpath = "//div[.='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement min12Karakter;

    @FindBy(xpath = "//div[.='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement min11Karakter;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement min8Karakter;

    @FindBy(xpath = "//div[@class='card-body']//tbody")
    public WebElement viceDeanListe;

    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[18]")
    public WebElement edit;

    @FindBy(xpath = "(//*[@id='name'])[2]")
    public WebElement nameDegisiklik;

    @FindBy(xpath = "(//*[@id='surname'])[2]")
    public WebElement surNameDegisiklik;

    @FindBy(xpath = "(//*[@id='birthPlace'])[2]")
    public WebElement birthplaceDegisiklik;

    @FindBy(xpath = "(//*[@name='gender'])[4]")
    public WebElement genderDegisiklik;

    @FindBy(xpath = "(//*[@id='birthDay'])[2]")
    public WebElement birthdayDegisiklik;

    @FindBy(xpath = "(//*[@id='phoneNumber'])[2]")
    public WebElement phonenumberDegisiklik;

    @FindBy(xpath = "(//*[@id='ssn'])[2]")
    public WebElement ssnDegisiklik;

    @FindBy(xpath = "(//*[@id='username'])[2]")
    public WebElement usernameDegisiklik;

    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement passwordDegisiklik;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement buttonDegisiklik;

    @FindBy(xpath = "//span[.='ALMUS KAYA']")
    public WebElement isim;


    @FindBy(xpath = "(//*[@class='btn-close'])[3]")
    public WebElement kapatmaISareti;

    @FindBy(xpath = "//span[.='senih lslsl']")
    public WebElement NameSurnameNew;






}
