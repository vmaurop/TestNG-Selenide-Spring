package com.vmaurop.utils;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class Files {

    private Files() {
        throw new IllegalArgumentException("GeneralMethods");
    }


    /**
     * Read file to string
     * @param filePath
     * @return
     * @throws IOException
     */
    public static String readFileToString(String filePath) throws IOException {
        return FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
    }

    /**
     * Convert a pdf into a string
     * @param path
     * @return
     * @throws IOException
     */
    public static String convertPDFToString(String path) throws IOException {
        PDDocument document = PDDocument.load(new File(path));
        PDFTextStripper pdfStripper = new PDFTextStripper();
        return pdfStripper.getText(document).replace("\r\n", "");
    }

}
