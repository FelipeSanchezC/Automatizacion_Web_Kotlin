package userInterface

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

open class SigInPageUi {

    val lbl_EmailAddres : Target = Target.the("Label ingreso del email para login").located(By.id("email"))
    val lbl_Password : Target = Target.the("Label ingreso de password para login").located(By.id("passwd"))
    val btn_SignIn : Target = Target.the("Boton sing in para login").located(By.id("SubmitLogin"))

}