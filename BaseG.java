package GaanaDemo;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseG {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f, "com.gaana_2017-12-14.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		//UD-Nexus_5X_API_27_x86
	//	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "UD-Nexus_5X_API_27_x86");
		//Nexus5X_API_27_x86
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5X_API_27_x86"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		cap.setCapability(AndroidMobileCapabilityType.APPLICATION_NAME, "Gaana");
		//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gaana_2017-12-14.apk");

		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gaana");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.gaana.SplashScreenActivity");

		//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		
		//cap.setCapability("newCommandTimeout", 120);
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	//	cap.setCapability("noReset", "false"); 
		//cap.setCapability(MobileCapabilityType.FULL_RESET,"False");


//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://192.168.1.101:4723/wd/hub"), cap);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		
	}

}
