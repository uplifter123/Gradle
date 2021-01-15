package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsPage {

    public ElementsPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(xpath = "//div[@class='card-up']")
    public WebElement elementsCard;

    @FindBy(id="item-1")
    public WebElement checkboxMenuLink;

    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement checkBoxHeader;

    @FindBy(xpath = "//button[@title='Expand all']")
    public WebElement expandAllButton;

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement succesText;

    @FindBy(xpath = "//span[@class='text-success']")
    public List<WebElement> allSuccesText;


}
