package com.vmaurop;


import com.vmaurop.actions.HomeActionsUI;
import com.vmaurop.api.APICalls;
import com.vmaurop.core.TestNGBase;
import com.vmaurop.questions.HomeQuestionsUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example extends TestNGBase {

    @Autowired
    private HomeActionsUI homeActionsUI;

    @Autowired
    private HomeQuestionsUI homeQuestionsUI;


    @Autowired
    APICalls apiCalls;




    @BeforeClass(alwaysRun = true, description = "")
    @Parameters(value = {"apiUrl"})
    public void createInitialData(String apiUrl) {
        System.out.println(1);

    }

    @Test(alwaysRun = true, description = "")
    public void testStep_1() {
    }

    @Test(alwaysRun = true, dependsOnMethods = "testStep_1", description = "")
    public void testStep_2() {

    }

    @Test(alwaysRun = true, dependsOnMethods = "testStep_2", description = "")
    public void testStep_3() {
    }

    @Test(alwaysRun = true, dependsOnMethods = "testStep_3", description = "")
    public void testStep_4() {

    }

}
