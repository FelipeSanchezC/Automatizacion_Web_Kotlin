package tasks.general

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Interaction
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Enter
import net.serenitybdd.screenplay.targets.Target

class IngresarInformacionTask (private var textoIngresar : String, private var target : Target) : Interaction {

    override fun <T : Actor?> performAs(actor: T) {
        actor?.attemptsTo(
            Enter.theValue(textoIngresar).into(target)
        )
    }

    companion object {
        fun ingresarTexto( textoIngresar : String, target : Target) :IngresarInformacionTask {
            return ingresarTexto(textoIngresar, target)
        }
    }


}