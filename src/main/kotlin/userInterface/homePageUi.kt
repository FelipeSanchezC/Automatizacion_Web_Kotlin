package userInterface

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.targets.Target

//si se maneja la interfaz como un objeto no es necesario crear un nuevo objeto, de la clase

object homePageUi {

    val btn_SingIn : Target = Target.the("Boton sign in Home page Web").located(By.cssSelector("a.login"))


}