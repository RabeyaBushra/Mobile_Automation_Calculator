import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class AppLaunch {
    public AndroidDriver driver;
   @BeforeTest
    private void setUp() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","My Device");
        cap.setCapability("uuid","cad2234a");
        cap.setCapability("platformName","My Device");
        cap.setCapability("platformVersion","10");
        cap.setCapability("appPackage","com.google.android.calculator");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        cap.setCapability("autoGrantPermissions","true");
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AndroidDriver(url,cap);
        Thread.sleep(2000);


    }
    @AfterTest
    public void closeApp()
    {
        //driver.quit();
    }
}
