package com.vmaurop.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TrElements {

    @JsonProperty("elementType")
    private String elementType;

    @JsonProperty("extClass")
    private String extClass;

    @JsonProperty("trElementExpressions")
    private List<TrElementExpressions> trElementExpressions;

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getExtClass() {
        return extClass;
    }

    public void setExtClass(String extClass) {
        this.extClass = extClass;
    }

    public List<TrElementExpressions> getTrElementExpressions() {
        return trElementExpressions;
    }

    public void setTrElementExpressions(List<TrElementExpressions> trElementExpressions) {
        this.trElementExpressions = trElementExpressions;
    }
}
