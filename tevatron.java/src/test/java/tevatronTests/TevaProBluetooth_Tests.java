package tevatronTests;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class TevaProBluetooth_Tests extends tevatron.pages.TestBase {
private boolean acceptNextAlert = true;
private StringBuffer verificationErrors = new StringBuffer () ;
@Test
public void testTevaBt2 () throws Exception {
    driver.get(baseUrl + "/index.html");
    driver.findElement(By.linkText("TevaPro Bluetooth")).click();
    try {
      assertTrue(isElementPresent(By.xpath("//*[@class = 'product-info']//h3[text()='TevaPro Bluetooth']")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
}

private boolean isElementPresent (By by) {
try {
driver.findElement (by);
return true;
} catch (NoSuchElementException e) {
return false;
}
}

private String closeAlertAndGetItsText() {
try {
Alert alert = driver.switchTo().alert();
String alertText = alert.getText ();
if (acceptNextAlert) {
alert.accept();
} else {
alert.dismiss();
}
return alertText;
} finally {
acceptNextAlert = true;
}
}
}
