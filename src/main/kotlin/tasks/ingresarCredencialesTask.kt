package tasks

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter
import userInterface.SigInPageUi

open class ingresarCredencialesTask : Task {

    private val email : String = "pruebas123@hotmail.com"
    private val password : String = "Pruebas123"

    // Se debe crear objeto a partir de la clase de interfaz para poder acceder a esta
    val siginPageUi = SigInPageUi()


    override fun <T : Actor?> performAs(actor: T) {
        actor?.attemptsTo(
            Enter.theValue(email).into(siginPageUi.lbl_EmailAddres),
            Enter.theValue(password).into(siginPageUi.lbl_Password),
            Click.on(siginPageUi.btn_SignIn)
        )
    }

    companion object {
        fun conCredenciales() : ingresarCredencialesTask {
            return ingresarCredencialesTask()
        }
    }
}