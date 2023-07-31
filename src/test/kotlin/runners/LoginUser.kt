package runners

import io.cucumber.junit.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith


@RunWith(CucumberWithSerenity::class)
@CucumberOptions(
    features = ["C:\\Users\\DELL\\IdeaProjects\\Aut-Kotlin-Web\\src\\test\\resources\\features\\LoginWebPage.feature"],
    glue = ["stepDefinition"],
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    tags = "@TestCaseMultipleLogin"
)

class LoginUser {
}