package com.demoqa.tests;

import com.demoqa.pages.ElementsPage;
import com.demoqa.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us02_TestBox extends TestBase {
    ElementsPage elements = new ElementsPage();

    @Test
    public void checkBoxButton(){
        elements.elementsCard.click();
        Assert.assertTrue(elements.checkboxMenuLink.isDisplayed());

    }
    @Test
    public void checkBoxText() {
        elements.elementsCard.click();
        elements.checkboxMenuLink.click();
        System.out.println("CheckBox Text : "+ elements.checkBoxHeader.getText());
        Assert.assertTrue(elements.checkBoxHeader.isDisplayed());

    }




}
