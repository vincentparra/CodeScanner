package com.rocs.code.scanner;

import com.rocs.code.scanner.app.path.FindFilePath;
import com.rocs.code.scanner.app.path.impl.FindFilePathImpl;
import com.rocs.code.scanner.data.model.Field;
import com.rocs.code.scanner.app.analyzer.AnalyzeCode;
import com.rocs.code.scanner.app.analyzer.impl.AnalyzeCodeImpl;
import java.nio.file.Path;
import java.util.List;


public class CodeScanner {
    public static void main(String[] args) {
        AnalyzeCode codescanner = new AnalyzeCodeImpl();
        FindFilePath filePath = new FindFilePathImpl();
        List<Path> paths = filePath.findPath();
        for(Path path:paths){
            Field field = new Field();
            String fileName = String.valueOf(path);
            List<String> code = codescanner.analyze(fileName,field);
            for (String s:code){
                System.out.println(s);
            }

        }
    }
}