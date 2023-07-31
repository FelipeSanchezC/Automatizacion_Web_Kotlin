package tasks

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter
import userInterface.SigInPageUi

class ingresarCredencialesConParametrosTask (private val correo : String, private val password : String) : Task {

    //instanciar nuevo objeto de la clase sigInPageUi
    val siginPageUi = SigInPageUi()

    override fun <T : Actor?> performAs(actor: T) {
        actor?.attemptsTo(
            Enter.theValue(correo).into(siginPageUi.lbl_EmailAddres),
            Enter.theValue(password).into(siginPageUi.lbl_Password),
            Click.on(siginPageUi.btn_SignIn)
        )
    }

    companion object {
        fun conCredenciales(correo : String, password : String) : ingresarCredencialesConParametrosTask {
            return ingresarCredencialesConParametrosTask(correo, password)
        }
    }
}