package com.vmaurop.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CdTRequest {

    @JsonProperty("satelliteEntityId")
    private int satelliteEntityId;

    @JsonProperty("dossierType")
    private int dossierType;

    @JsonProperty("firstLanguage")
    private String firstLanguage;

    @JsonProperty("secondLanguage")
    private String secondLanguage;

    @JsonProperty("referenceLanguage")
    private String referenceLanguage;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("targetLanguages")
    private List<String> targetLanguages;

    @JsonProperty("trElements")
    private List<TrElements> trElements;


    public int getSatelliteEntityId() {
        return satelliteEntityId;
    }

    public void setSatelliteEntityId(int satelliteEntityId) {
        this.satelliteEntityId = satelliteEntityId;
    }

    public int getDossierType() {
        return dossierType;
    }

    public void setDossierType(int dossierType) {
        this.dossierType = dossierType;
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public String getSecondLanguage() {
        return secondLanguage;
    }

    public void setSecondLanguage(String secondLanguage) {
        this.secondLanguage = secondLanguage;
    }

    public String getReferenceLanguage() {
        return referenceLanguage;
    }

    public void setReferenceLanguage(String referenceLanguage) {
        this.referenceLanguage = referenceLanguage;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<String> getTargetLanguages() {
        return targetLanguages;
    }

    public void setTargetLanguages(List<String> targetLanguages) {
        this.targetLanguages = targetLanguages;
    }

    public List<TrElements> getTrElements() {
        return trElements;
    }

    public void setTrElements(List<TrElements> trElements) {
        this.trElements = trElements;
    }
}
