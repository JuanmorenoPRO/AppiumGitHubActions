package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageBase {
    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id="editTextTitre")
    MobileElement taskNameTxt;

    @AndroidFindBy(id="editTextNote")
    MobileElement taskDescriptionTxt;

    @AndroidFindBy(id="action_save")
    MobileElement saveBtn;

    public void enterTaskName(String taskName){
        clear(taskNameTxt);
        sendText(taskNameTxt,taskName);
    }

    public void enterTaskDescription(String taskDescription){
        clear(taskDescriptionTxt);
        sendText(taskDescriptionTxt,taskDescription);
    }
    public void clickSaveBtn(){
        click(saveBtn);
    }

}
