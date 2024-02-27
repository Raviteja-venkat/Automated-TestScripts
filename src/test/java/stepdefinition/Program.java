package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.Maincode;

public class Program {
    private WebDriver driver = Data.driver;
    Maincode lp = new Maincode(driver);

    @Given("the user is on the Demo Web Shop login page")
    public void the_user_is_on_the_demo_web_shop_login_page() {
        Data.launchApplication();
    }


    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        lp.clickLogin();
        lp.userNameField();
        lp.passwordField();
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() throws InterruptedException {
        lp.btnLogin();
        Thread.sleep(5000);
    }

    @And("verify user able click on documents")
    public void verifyUserAbleClickOnDocuments() throws InterruptedException {
        lp.viewAllBtn("Agile Testing","Checklists","Agile PCI Checklist");
        Thread.sleep(5000);
    }

    @Then("verify user able to click on download")
    public void verifyUserAbleToClickOnDownload() {
        //lp.templateOptions("Download");
        lp.dwnld("Download");

    }

    @Given("user able to click on project repository")
    public void userAbleToClickOnProjectRepository() {
        lp.repoBtn();
    }

    @When("user able to see project name")
    public void userAbleToSeeProjectName() throws InterruptedException {
        lp.viewProject("Burnco Project 1","Functional Requirements","Item description worksheet");
    }

    @Then("verify user able to click on download button")
    public void verifyUserAbleToClickOnDownloadButton() {
        lp.dwnld1("Download");
    }


    @Given("user able to click on org Admin")
    public void userAbleToClickOnorgAdmin() throws InterruptedException {
        lp.admin("Business Units");
    }

    @When("usr able to add Bunit")
    public void usrAbleToAddBunit() {
        lp.addBunit();
    }

    @And("user able to click on program and Add")
    public void userableToClickOnProgramAndAdd() {
        lp.admin1("Programs","Add Program +","BU01");
    }


    @And("user able to click on Project and Add")
    public void userAbleToClickOnProjectAndAdd() {
        lp.cProject("Add Project +","fmc","Anusri mani");
    }

    @Then("user able to click on users")
    public void userAbleToClickOnUsers()  {
        //lp.users();
        lp.users("first_name","last_name","email","axer123@yopmail.com");
    }


    @When("user able to Add project from users")
    public void userAbleToAddProjectFromUsers() {
        lp.addProject("ADD ","Select Business Unit","Android Development","Program Name","NodeJs","Project Name","Hyniva");
    }




    @Then("verify user able to validate")
    public void verifyUserAbleToValidate() {
        lp.Validation("axer123@yopmail.com");

    }

    @Given("user able to click on Project Admin")
    public void userAbleToClickOnProjectAdmin() {
        lp.projectAdmin();
    }



}
