package seleniumPOM.seleniumBaseApiPageFactory.dropdownMenu;

import org.testng.annotations.DataProvider;

class DataProviderUrls {

    @DataProvider
    public static Object[][] getUrlsOfDropMenu() {
        return new Object[][]{
                {1, "https://formy-project.herokuapp.com/autocomplete"},
                {2, "https://formy-project.herokuapp.com/buttons"},
                {3, "https://formy-project.herokuapp.com/checkbox"},
                {4, "https://formy-project.herokuapp.com/datepicker"},
                {5, "https://formy-project.herokuapp.com/dragdrop"},
                {6, "https://formy-project.herokuapp.com/dropdown"},
                {7, "https://formy-project.herokuapp.com/enabled"},
                {8, "https://formy-project.herokuapp.com/fileupload"},
                {9, "https://formy-project.herokuapp.com/filedownload"},
                {10, "https://formy-project.herokuapp.com/keypress"},
                {11, "https://formy-project.herokuapp.com/modal"},
                {12, "https://formy-project.herokuapp.com/scroll"},
                {13, "https://formy-project.herokuapp.com/radiobutton"},
                {14, "https://formy-project.herokuapp.com/switch-window"},
                {15, "https://formy-project.herokuapp.com/form"}
        };
    }
}
