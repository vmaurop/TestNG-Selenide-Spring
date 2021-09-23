package com.vmaurop.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

    @JsonProperty("satelliteEntityId")
    private int satelliteEntityId;

    @JsonProperty("dossierType")
    private int dossierType;

    @JsonProperty("firstLanguage")
    private String firstLanguage;

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
}
