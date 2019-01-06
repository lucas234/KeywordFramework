package executionEngine;

import config.ActionKeywords;
import config.Constants;
import utility.ExcelUtils;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static Properties OR;
    public static int iTestStep;
    public static int iTestLastStep;
    public static String sTestCaseID;
    public static String sRunMode;

    public static void main(String args [])throws Exception{
        String Path_OR = Constants.Path_OR;
        //Creating file system object for Object Repository text/property file
        FileInputStream fs = new FileInputStream(Path_OR);
        //Creating an Object of properties
        OR= new Properties(System.getProperties());
        //Loading all the properties from Object Repository property file in to OR object
        OR.load(fs);
        System.out.println(OR.getProperty("btn_LogIn").toString());

        ExcelUtils.setExcelFile(Constants.Path_TestData);
        int iTotalTestCases = ExcelUtils.getRowCount(Constants.Sheet_TestCases);
        System.out.println(iTotalTestCases);
        sTestCaseID = ExcelUtils.getCellData(1, Constants.Col_TestCaseID, Constants.Sheet_TestCases);
        //This is to get the value of the Run Mode column for the current test case
        sRunMode = ExcelUtils.getCellData(1, Constants.Col_RunMode,Constants.Sheet_TestCases);
        //This is the condition statement on RunMode value
        System.out.println(sTestCaseID);
        System.out.println(sRunMode);

    }
}
