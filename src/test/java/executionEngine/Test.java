package executionEngine;

import config.ActionKeywords;

import java.lang.reflect.Method;

public class Test {
    public static void main(String args [])throws Exception{
        ActionKeywords actionKeywords;
        Method method[];

        actionKeywords = new ActionKeywords();
        //This will load all the methods of the class 'ActionKeywords' in it.
        //It will be like array of method, use the break point here and do the watch
        method = actionKeywords.getClass().getDeclaredMethods();
        for (Method temp:method){
            if (temp.getName().equals("test")){
                System.out.println(temp.getName());
                temp.invoke(actionKeywords);}
        }
    }
}
