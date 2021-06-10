package com.vmaurop;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.vmaurop.actions.HomeActionsUI;
import com.vmaurop.api.EuroNiceAPI;
import com.vmaurop.core.TestNGBase;
import com.vmaurop.domain.CdTRequest;
import com.vmaurop.domain.TrElementExpressions;
import com.vmaurop.domain.TrElements;
import com.vmaurop.questions.HomeQuestionsUI;
import com.vmaurop.utils.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Example extends TestNGBase {

    @Autowired
    private HomeActionsUI homeActionsUI;

    @Autowired
    private HomeQuestionsUI homeQuestionsUI;


    @Autowired
    EuroNiceAPI euroNiceAPI;



    @BeforeClass(alwaysRun = true, description = "The user has requested a translation request to CdT and logs in as admin to Euronice")
    @Parameters(value = {"apiUrl"})
    public void createInitialData(String apiUrl) throws JsonProcessingException {
        CdTRequest cdTRequest = new CdTRequest();
        cdTRequest.setSatelliteEntityId(Data.getRandomNumberUsingInts(10,1000));
        cdTRequest.setDossierType(1);
        cdTRequest.setFirstLanguage("EN");
        cdTRequest.setSecondLanguage("FR");
        cdTRequest.setReferenceLanguage("EN");
        cdTRequest.setNationality("gb");
        cdTRequest.setTargetLanguages(Arrays.asList("SL","SV","RO","PT","PL","NL","MT"));
        TrElementExpressions trElementExpressions = new TrElementExpressions();
        trElementExpressions.setRequestedText(UUID.randomUUID().toString());
        List<TrElementExpressions> trElementExpressionsList = new ArrayList<>();
        trElementExpressionsList.add(trElementExpressions);
        TrElements trElements = new TrElements();
        List<TrElements> trElementsList = new ArrayList<>();
        trElements.setElementType("GS");
        trElements.setExtClass("3");
        trElements.setTrElementExpressions(trElementExpressionsList);
        trElementsList.add(trElements);
        cdTRequest.setTrElements(trElementsList);
        String requestBodyJson = Data.serializeTrademark(cdTRequest);
        euroNiceAPI.postTranslationRequest(apiUrl, requestBodyJson);
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
