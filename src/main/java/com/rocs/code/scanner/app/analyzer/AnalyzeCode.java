package com.rocs.code.scanner.app.analyzer;
import com.rocs.code.scanner.data.model.Field;

import java.util.List;

public interface AnalyzeCode {
    List<String> analyze(String fileName, Field field);
}