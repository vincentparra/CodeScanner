package com.rocs.code.scanner.app.analyzer.impl;

import com.rocs.code.scanner.data.model.Field;
import com.rocs.code.scanner.app.analyzer.AnalyzeCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AnalyzeCodeImpl implements AnalyzeCode {
    @Override
    public List<String> analyze(String fileName, Field field) {
        String lineString;
        List<String> codeString = new ArrayList<>();
        try {
            BufferedReader files = new BufferedReader(new FileReader(fileName));
            LineNumberReader lineNumberReader = new LineNumberReader(files);
            while ((lineString = lineNumberReader.readLine()) != null){
                if(lineString.contains("URL")){
                    codeString.add(lineString);
                }
                if(lineString.contains("USERNAME")){
                    codeString.add(lineString);
                }
                if(lineString.contains("PASSWORD")){
                    codeString.add(lineString);
                }
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return codeString;
    }
}