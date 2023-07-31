package stepDefinition

import io.cucumber.java.Before
import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.GivenWhenThen.seeThat
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Open
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnStage.*
import net.serenitybdd.screenplay.actors.OnlineCast
import org.hamcrest.Matchers
import questions.ValidarLoginExitosoQuestion
import tasks.ingresarCredencialesTask
import userInterface.homePageUi


class testCaseLoginStepDefinition {

    @Before
    fun setUp() {
        OnStage.setTheStage(OnlineCast())
    }

    @Given("Me encuentro en la pagina de Your Logo")
    fun meEncuentroEnLaPaginaDeYourLogo() {
        theActorCalled("Juan").wasAbleTo(Open.url("http://www.automationpractice.pl/index.php?id_category=3&controller=category")
        )
    }

    @When("Selecciona la opcion del Login")
    fun seleccionaLaOpcionDelLogin() {
        theActorInTheSpotlight().attemptsTo(
            Click.on(homePageUi.btn_SingIn)
        )
    }

    @When("Ingreso las credenciales")
    fun ingresoLasCredenciales() {
        theActorInTheSpotlight().attemptsTo(
            ingresarCredencialesTask.conCredenciales()
        )
    }

    @Then("Valido que el Login se realice de forma correcta")
    fun validoQueElLoginSeRealiceDeFormaCorrecta() {
        theActorInTheSpotlight().should(
            seeThat(ValidarLoginExitosoQuestion.elementoPresente(), Matchers.`is`(true))
        )
    }
}