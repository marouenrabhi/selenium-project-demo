package com.e2etests.automation.step_definitions;



import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte à l'application OrangeHRM")
	public void jeMeConnecteÀLApplicationOrangeHRM() {
		authenticationPage.goToURL();

	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickOnbtnLogin();
	}

	@Then("Je me derige vers la page Home{string}")
	public void jeMeDerigeVersLaPageHome(String msg) {
		String message = AuthenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));

	}

}
