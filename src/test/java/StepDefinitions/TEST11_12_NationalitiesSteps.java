package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TEST11_12_NationalitiesSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("Click on the element in the left Nav2")
    public void clickOnTheElementInTheLeftNav2(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog2")
    public void clickOnTheElementInTheDialog2(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content2")
    public void userSendingTheKeysInDialogContent2(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
            //listin ilk elemanına(weblement adı), ikinci elemanını yanş değeri döner
        }
    }

    @And("User delete item from Dialog2")
    public void userDeleteItemFromDialog2(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndDeleteIn(listElement.get(i));
        }


    }

    @And("Success massage should be displayed2")
    public void successMassageShouldBeDisplayed2() {
        dc.findAndContainsText("successMessage", "success");
    }


    @And("User edit item from Dialog2")
    public void userEditItemFromDialog2(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndEdit(listElement.get(i));
        }
    }
}
