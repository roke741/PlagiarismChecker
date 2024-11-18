package com.roke.plagiarismchecker;
import com.roke.plagiarismchecker.service.SourcesText;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Jhordie
 */
public class PlagiarismChecker {
    private Map<String, String> database;

    public PlagiarismChecker() {
        database = new HashMap<>();
        String[] fuentes = SourcesText.getSourcesText();
        loadFiles(fuentes);
    }
    
    public boolean loadFiles(String[] paths) {
        for (String path: paths){
            String content = readFileContent(path);
            database.put(path, content);
        }
        return true;
    }

    public ResultChecker verifyPlagiarism(String text) {
        for (Map.Entry<String, String> entry: database.entrySet()) {
            if (containsPlagiarism(entry.getValue(), text)) {
                return new ResultChecker(true, entry.getKey());
            }
        }
        return new ResultChecker(false, null);
    }
    
    private boolean containsPlagiarism(String content, String text) {
        return content.contains(text);
    }
    
    public String readFileContent(String path) {
        return path;
    }
}
