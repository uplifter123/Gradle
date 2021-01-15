package com.demoqa.tests;

import com.demoqa.pages.ElementsPage;
import com.demoqa.utilities.Driver;
import com.demoqa.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us01_TestBox extends TestBase {

    ElementsPage elementsPage = new ElementsPage();

    @Test
    public void Us01_TestBox() {

        elementsPage.elementsCard.click();
        elementsPage.textBox.isDisplayed();
        elementsPage.textBox.click();
        System.out.println("Text Box links text : "+ elementsPage.textBox.getText());

        Assert.assertTrue(elementsPage.textBox1.isDisplayed());



    }
    @Test
    public void Us01_TestBox_Click() {

        elementsPage.elementsCard.click();

        String before = Driver.getDriver().getCurrentUrl();
        elementsPage.textBox.click();
        String after = Driver.getDriver().getCurrentUrl();

        System.out.println(before+" != " + after);
        Assert.assertNotEquals(before,after);

        String [] appear = {"Full Name", "Email", "Current Address" , "Permanent Address", "Submit" };
        System.out.println(appear[0]);
        Assert.assertTrue(elementsPage.userName.getText().equals(appear[0]));
        Assert.assertTrue(elementsPage.userEmail.getText().equals(appear[1]));
        Assert.assertTrue(elementsPage.currentAddress.getText().equals(appear[2]));
        Assert.assertTrue(elementsPage.permanentAddress.getText().equals(appear[3]));
        Assert.assertTrue(elementsPage.button.getText().equals(appear[4]));

    }


}
