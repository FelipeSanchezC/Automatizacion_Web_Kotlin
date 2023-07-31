package userInterface

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

class loginPageUi {
    val txt_My_Account : Target =  Target.the("Texto que se evidencia con el login exitoso").located(By.cssSelector("h1.page-heading"))
}