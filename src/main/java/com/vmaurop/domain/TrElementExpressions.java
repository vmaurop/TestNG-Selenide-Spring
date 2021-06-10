package com.vmaurop.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrElementExpressions {

    @JsonProperty("requestedText")
    private String requestedText;

    public String getRequestedText() {
        return requestedText;
    }

    public void setRequestedText(String requestedText) {
        this.requestedText = requestedText;
    }

}
