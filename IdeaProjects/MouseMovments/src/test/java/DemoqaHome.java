import org.junit.runner.manipulation.Sortable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoqaHome {

    @FindBy(css = " #menu-item-141")
    public WebElement Droppable;

    @FindBy(css = " #menu-item-151")
    public WebElement Sortable;

    public void droppable (){
        Droppable.click();
    }

    public void sortable (){
        Sortable.click();
    }
}
