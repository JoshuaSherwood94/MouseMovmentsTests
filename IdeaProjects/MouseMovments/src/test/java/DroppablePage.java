import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage {
    @FindBy(css = "#draggableview > p")
    public WebElement Draggable1;

    @FindBy(css = "#droppableview")
    public WebElement Target1;

    public void drag (WebDriver webDriver) {
        Actions builder = new Actions (webDriver);
        builder.clickAndHold(Draggable1).moveToElement(Target1).release().perform();
    }

    @FindBy(css = "#draggableaccept > p")
    public WebElement Draggable2;

    @FindBy(css = "#droppableaccept")
    public WebElement Target2;

    public void accept(WebDriver webDriver) {
        Actions builder = new Actions (webDriver);
        builder.clickAndHold(Draggable2).moveToElement(Target2).release().perform();
    }

    @FindBy(css = "#draggableprop")
    public WebElement Draggable3;

    @FindBy(css = "#droppable-inner")
    public WebElement Target31;

    @FindBy(css = "#droppable2-inner")
    public WebElement Target32;

    @FindBy(css = "#droppableprop2")
    public WebElement Target33;

    @FindBy(css = "#ui-id-2")
    public WebElement acceptButton;

    @FindBy(css = "#ui-id-3")
    public WebElement preventButton;

    public void prevent(WebDriver webDriver) {
        Actions builder = new Actions (webDriver);
        builder.clickAndHold(Draggable3).moveToElement(Target31).release();
        builder.clickAndHold(Draggable3).moveToElement(Target33).release();
        builder.clickAndHold(Draggable3).moveToElement(Target32).release().perform();
    }

    public void acceptTab (){
        acceptButton.click();
    }

    public void preventTab (){
        preventButton.click();
    }
}
