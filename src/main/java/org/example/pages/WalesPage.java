package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WalesPage extends Utility {
    private static final Logger log = LogManager.getLogger(WalesPage.class.getName());

    public WalesPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement startbutton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement radiobuttonwales;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement yes;

   @CacheLookup
    @FindBy(xpath = "//div[@class='form-group']/fieldset/div[3]")
    WebElement dentalwales;

   @CacheLookup
    @FindBy(xpath = "//div[@class='form-date']/div[1]/input")
    WebElement date;

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-date']/div[2]/input")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-date']/div[3]/input")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement no;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='heading-large']")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//div[@class='grid-row']")
    WebElement text1;

    @CacheLookup
    @FindBy(xpath= "//*[@class='lede']")
    WebElement resultUnder16;

    @CacheLookup
    @FindBy(xpath= "//ul[@class='form-hint-list']/li")
    List<WebElement> allNHSCostElements;

    public String verifyunder16(){
        return getTextFromElement(text1);
    }

    public String verifytext(){
        return getTextFromElement(text);
    }
    public void clickonstart(){
        clickOnElement(startbutton);
    }
    public void clickonno(){
        clickOnElement(no);
    }


    public void selectdental(){
        clickOnElement(dentalwales);
    }
    public void clickonyes(){
        clickOnElement(yes);
    }
    public void clickonwales(){
        clickOnElement(radiobuttonwales);
    }
    public void enterDay(String day) {
        sendTextToElement(date, day);
    }

    public void enterMonth(String m) {
        sendTextToElement(month, m);
    }

    public String verifyunder(){
        return getTextFromElement(resultUnder16);
    }

}
