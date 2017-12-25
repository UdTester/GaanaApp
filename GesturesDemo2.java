package GaanaDemo;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class GesturesDemo2 extends BaseG{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver  = (AndroidDriver<AndroidElement>) Capabilities();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
		driver.findElementByAndroidUIAutomator("text(\"English\")").click();
		driver.findElementByAndroidUIAutomator("text(\"GET STARTED\")").click();
		driver.findElementByAndroidUIAutomator("text(\"SKIP\")").click();
		driver.findElementByAndroidUIAutomator("text(\"English\")").click();
		driver.findElementByAndroidUIAutomator("text(\"SKIP\")").click();
		//Scroll to radio
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Radio\").instance(0));");		
		//click on Radio
		driver.findElementByAndroidUIAutomator("text(\"Radio\")").click();
		//click on "Mirchi Love Telugu"
		driver.findElementByAndroidUIAutomator("text(\"Mirchi Love Telugu\")").click();
		//Go to the home, to click on the menu option
		driver.findElementByAccessibilityId("com.gaana:id/action_home").click();
		//driver.findElementByAccessibilityId("(com.gaana:id/smallLabel)[0]").click();
		
		
		/*
		// After going to home page --> Click on side menu
		driver.findElementByAccessibilityId("com.gaana:id/menu_icon").click();
		// Click on settings
		driver.findElementByAndroidUIAutomator("text(\"Settings\")").click();
		// Click on "Push notifications"
		driver.findElementByAndroidUIAutomator("text(\"Push notifications\")").click();
		// Switch the On to OFF and oFF to ON 
		*/
		
	}

}
