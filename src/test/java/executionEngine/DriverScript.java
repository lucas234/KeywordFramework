package executionEngine;

import java.util.concurrent.TimeUnit;

import config.ActionKeywords;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.ExcelUtils;

public class DriverScript {
    private static WebDriver driver = null;
    public static void main(String[] args) throws Exception {

        // Declaring the path of the Excel file with the name of the Excel file
        String sPath = "src\\test\\java\\dataEngine\\DataEngine.xlsx";

        // Here we are passing the Excel path and SheetName as arguments to connect with Excel file
        ExcelUtils.setExcelFile(sPath, "TestCase");

        //Hard coded values are used for Excel row & columns for now
        //In later chapters we will replace these hard coded values with varibales
        //This is the loop for reading the values of the column 3 (Action Keyword) row by row
        for (int iRow=1;iRow<=9;iRow++){
            //Storing the value of excel cell in sActionKeyword string variable
            String sActionKeyword = ExcelUtils.getCellData(iRow, 3);

            //Comparing the value of Excel cell with all the project keywords
            if(sActionKeyword.equals("openBrowser")){
                //This will execute if the excel cell value is 'openBrowser'
                //Action Keyword is called here to perform action
                ActionKeywords.openBrowser();}
            else if(sActionKeyword.equals("navigate")){
                ActionKeywords.navigate();}
            else if(sActionKeyword.equals("click_MyAccount")){
                ActionKeywords.click_MyAccount();}
            else if(sActionKeyword.equals("input_Username")){
                ActionKeywords.input_Username();}
            else if(sActionKeyword.equals("input_Password")){
                ActionKeywords.input_Password();}
            else if(sActionKeyword.equals("click_Login")){
                ActionKeywords.click_Login();}
            else if(sActionKeyword.equals("waitFor")){
                ActionKeywords.waitFor();}
            else if(sActionKeyword.equals("click_Logout")){
                ActionKeywords.click_Logout();}
            else if(sActionKeyword.equals("closeBrowser")){
                ActionKeywords.closeBrowser();}

        }
    }
}