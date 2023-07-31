package stepDefinition

import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.GivenWhenThen.seeThat
import net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight
import org.hamcrest.Matchers
import questions.ValidarLoginExitosoQuestion
import tasks.ingresarCredencialesConParametrosTask

class testCaseMultipleLoginStepDefinition {

    @When("Ingreso el correo {string} y password {string}")
    fun ingresoElCorreoYPassword(correo: String, password: String) {
        //println("el correo es $correo y el password es $password")
        theActorInTheSpotlight().attemptsTo(
        ingresarCredencialesConParametrosTask.conCredenciales(correo, password)
        )
    }

    @Then("Valido que se presente el mensaje de control")
    fun validoQueSePresenteElMensajeDeControl() {
        theActorInTheSpotlight().should(
            seeThat(ValidarLoginExitosoQuestion.elementoPresente(), Matchers.`is`(true))
        )
    }



}