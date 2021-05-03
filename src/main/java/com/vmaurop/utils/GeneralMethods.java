package com.vmaurop.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class GeneralMethods {

    private GeneralMethods() {
        throw new IllegalArgumentException("GeneralMethods");
    }


    public static String readFileToString(String filePath) throws IOException {
        return FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
    }

}
