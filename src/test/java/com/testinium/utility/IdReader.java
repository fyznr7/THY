package com.testinium.utility;

import com.thoughtworks.gauge.Step;
public class IdReader extends BaseTest{
    @Step("<second> wait seconds")
    public void wait(int second)throws InterruptedException{
        Thread.sleep(second*1000);
    }
    @Step({"Click on the book a flight button"})

    public void booking(){
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/acMain_btnBooking").click();
    }
/*
    @Step({"Find the <element> and fill out the <key>"})
    public void select(String element, String key)
    {
        driver.findElementByAccessibilityId(element).sendKeys(key);
    }

 */
    @Step({"Select one way"})
    public void ticketType(){
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frDashboard_tvOneWay\n");
    }
    @Step("Fill flight from the airport value out")
    public void sendKeyFlightFrom(String value)throws Exception{
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frDashboard_llFrom\n").click();
        wait(5);
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frAirportSelection_etSearch\n").sendKeys(value);
        wait(5);
        driver.findElementByAccessibilityId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]\n").click();
        wait(5);
    }
    @Step("Fill flight to the airport value out")
    public void  sendKeyFlightTo(String value)throws Exception{
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frDashboard_llTo\n").click();
        wait(5);
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frAirportSelection_etSearch").sendKeys(value);
        wait(2);
        driver.findElementByAccessibilityId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.TextView[2]\n").click();

    }
    @Step("passenger numbers")
    public void passengerNumbers(Integer number){
            driver.findElementByAccessibilityId("[{\"key\":\"elementId\",\"value\":\"d2125af2-e04e-4c59-a30a-5324f592d38a\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"6\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.turkishairlines.mobile\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.FrameLayout\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"\",\"name\":\"text\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"true\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"true\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[925,992][1080,1146]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]").click();

    }
    @Step("identify the date")
    public void date() throws InterruptedException {
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frDashboard_fdvDeparture\n").click();
        wait(5);
        driver.findElementByAccessibilityId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[6]/android.widget.TextView\n").click();
        wait(5);
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frDashboard_btnDone\n").click();

    }
    @Step("Search the flight")
    public void searchFlight() throws InterruptedException {
        wait(2);
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frDashboard_btnSearch\n").click();
        wait(2);
    }
    @Step("Select the flight")
    public void selectFlight() throws InterruptedException {
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/itemFlightSearchParent_rlRoot\n");
        wait(2);
    }
    @Step("Identify the class of the flight")
    public void flightClass() throws InterruptedException{
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/brandItem\n[1]").click();
        wait(2);
    }
    @Step("continue")
    public void continueToTheProcess() throws InterruptedException{
        driver.findElementByAccessibilityId("com.turkishairlines.mobile:id/frFlightSearch_btnContinue\n").click();
        wait(5);
    }

    }


