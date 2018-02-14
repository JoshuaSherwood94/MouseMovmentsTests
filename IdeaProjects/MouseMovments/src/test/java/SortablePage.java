import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SortablePage {

    @FindBy(css = "#sortable > li:nth-child(1)")
    public WebElement b1;
    @FindBy(css = "#sortable > li:nth-child(2)")
    public WebElement b2;
    @FindBy(css = "#sortable > li:nth-child(3)")
    public WebElement b3;
    @FindBy(css = "#sortable > li:nth-child(4)")
    public WebElement b4;
    @FindBy(css = "#sortable > li:nth-child(5)")
    public WebElement b5;
    @FindBy(css = "#sortable > li:nth-child(6)")
    public WebElement b6;
    @FindBy(css = "#sortable > li:nth-child(7)")
    public WebElement b7;

    public void move(WebDriver webDriver) {
        Actions builder = new Actions(webDriver);
        builder.dragAndDrop(b1,b7);
        builder.dragAndDrop(b2,b7);
        builder.dragAndDrop(b3,b7);
        builder.dragAndDrop(b4,b7);
        builder.dragAndDrop(b5,b7);
        builder.dragAndDrop(b6,b7).perform();
    }

    @FindBy(css = "#sortable1 > li:nth-child(1))")
    public WebElement b1c1;
    @FindBy(css = "#sortable1 > li:nth-child(2)")
    public WebElement b2c1;
    @FindBy(css = "#sortable1 > li:nth-child(3)")
    public WebElement b3c1;
    @FindBy(css = "#sortable1 > li:nth-child(4)")
    public WebElement b4c1;
    @FindBy(css = "#sortable1 > li:nth-child(5)")
    public WebElement b5c1;

    @FindBy(css = "#sortable2 > li:nth-child(1)")
    public WebElement b1c2;
    @FindBy(css = "#sortable2 > li:nth-child(2)")
    public WebElement b2c2;
    @FindBy(css = "#sortable2 > li:nth-child(3)")
    public WebElement b3c2;
    @FindBy(css = "#sortable2 > li:nth-child(4)")
    public WebElement b4c2;
    @FindBy(css = "#sortable2 > li:nth-child(5)")
    public WebElement b5c2;

    public void move2(WebDriver webDriver) {
        Actions builder = new Actions(webDriver);
        builder.dragAndDrop(b1c1,b1c2);
        builder.dragAndDrop(b1c2,b2c1);
        builder.dragAndDrop(b2c1,b1c1);
        builder.dragAndDrop(b2c2,b1c2);
        builder.dragAndDrop(b3c1,b2c1);
        builder.dragAndDrop(b3c2,b2c2);
        builder.dragAndDrop(b4c1,b3c1);
        builder.dragAndDrop(b4c2,b3c2);
        builder.dragAndDrop(b5c1,b4c1);
        builder.dragAndDrop(b5c2,b4c2).perform();
    }

    @FindBy(css = "#ui-id-2")
    public WebElement connectButton;

    public void ConnectTab (){
        connectButton.click();
    }
    
}
