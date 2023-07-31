package questions

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question
import net.serenitybdd.screenplay.questions.Visibility
import net.serenitybdd.screenplay.targets.Target
import userInterface.loginPageUi

class ValidarLoginExitosoQuestion () : Question<Boolean>  {

    val targetLoginPage = loginPageUi ()

    override fun answeredBy(actor: Actor?): Boolean {
        return Visibility.of(targetLoginPage.txt_My_Account).answeredBy(actor)
    }

    companion object {
        fun elementoPresente() : ValidarLoginExitosoQuestion {
            return ValidarLoginExitosoQuestion()
        }
    }
}