package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
    public ElementsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='card-up'])[1]")
    public WebElement elementsCard;

    @FindBy(xpath = "//span[contains(text(),'Text Box')]")
    public WebElement textBox;

    @FindBy(xpath = "//div[contains(text(),'Text Box')]")
    public WebElement textBox1;

    @FindBy(id = "userName-label")
    public WebElement userName;
    @FindBy(id = "userEmail-label")
    public WebElement userEmail;
    @FindBy(id = "currentAddress-label")
    public WebElement currentAddress;
    @FindBy(id = "permanentAddress-label")
    public WebElement permanentAddress;
    @FindBy(id = "submit")
    public WebElement button;

}
