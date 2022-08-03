import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import org.xmlpull.v1.sax2.Driver;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class AuthTest {



    private String reportDirectory = "reports";
    private String reportFormat = "JSON";
    private String testName = "DCBTest";
    protected AndroidDriver driver = new AndroidDriver();
DesiredCapabilities dc = new DesiredCapabilities();

    public void setUp() throws InterruptedException, MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);





    }


}
