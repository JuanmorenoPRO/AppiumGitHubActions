package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TaskListPage;
import Test.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class CreateNewTask extends TestBase {

    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;


    @Given("Tap add new Task")
    public void tapAddNewTask() throws MalformedURLException {
        setUp();
        taskListPage = new TaskListPage(driver);
        createTaskPage= new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
    }

    @Given("Enter the task name")
    public void enterTheTaskName() {
        createTaskPage.enterTaskName("Task 1");
    }

    @Given("Enter the task description")
    public void enterTheTaskDescription() {
        createTaskPage.enterTaskDescription("Description 1");
    }

    @When("Tap save")
    public void tapSave() {
        createTaskPage.clickSaveBtn();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully() {
        driver.hideKeyboard();
        tearDown();
    }
}
