package Test;

import PageObjects.CreateTaskPage;
import PageObjects.TaskListPage;
import Utils.JsonReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class ToDo_Test  extends TestBase {

    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;

    @DataProvider(name ="Task data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONdata(
                System.getProperty("user.dir")+"/data/TaskData.json",
                "Task Data",
                2);

    }

    @Test(dataProvider = "Task data")
    public void TestAddTask(String taskName, String TaskDescription) throws MalformedURLException {
        setUp();
        taskListPage =new TaskListPage(driver);
        createTaskPage =new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDescription(TaskDescription);
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        tearDown();
    }
}
