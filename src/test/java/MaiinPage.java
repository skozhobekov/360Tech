import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaiinPage {



private WebDriver driver;
@FindBy(id = "profileLanguage")
private WebElement Language;

@FindBy(id = "codeInput")
private WebElement shortCodeInputField;

@FindBy(id="InputNumber")
private WebElement NumberInputField;



}
