package com.vmaurop.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vmaurop.domain.Request;

import java.io.IOException;
import java.security.SecureRandom;

public final class Data {

    private static final int LENGTH = 6;

    private Data() {
        throw new IllegalArgumentException("Data class");
    }


    public static String generateRandomString() {
        return new SecureRandom().ints('a', 'z' + 1)
                .limit(LENGTH)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static int getRandomNumberUsingInts(int min, int max) {
        SecureRandom random = new SecureRandom();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    public static String serializeRequest(Request request) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(request);
    }

    public static Request deserializeRequest(String jsonRequest) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonRequest, Request.class);
    }


}
