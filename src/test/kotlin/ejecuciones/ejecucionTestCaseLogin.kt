package ejecuciones

import net.serenitybdd.junit.runners.SerenityRunner
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.GivenWhenThen.seeThat
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Open
import net.thucydides.core.annotations.Managed
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver
import questions.ValidarLoginExitosoQuestion
import tasks.ingresarCredencialesTask
import userInterface.homePageUi

import org.hamcrest.Matchers.equalTo


@RunWith(SerenityRunner::class)
class ejecucionTestCaseLogin {

    @Managed
    var webDriver : WebDriver? = null

    private val actor: Actor = Actor.named("Juan")

    @Test
    fun runTestCaseLogin () {

        //val juan = Actor.named("Juan")

        actor.can(BrowseTheWeb.with(webDriver))

        actor.attemptsTo(
            Open.url("http://www.automationpractice.pl/index.php?id_category=3&controller=category"),
            Click.on(homePageUi.btn_SingIn),
            ingresarCredencialesTask.conCredenciales()
        )

        val resultado = actor.asksFor(ValidarLoginExitosoQuestion.elementoPresente().asString())
        println("El resultado de la questions es $resultado")

        actor.should(
            seeThat(ValidarLoginExitosoQuestion.elementoPresente(), Matchers.`is`(true))
        )


    }

}