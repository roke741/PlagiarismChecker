package com.roke.plagiarismchecker;
import com.roke.plagiarismchecker.dao.controllers.FuenteController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Jhordie
 */
public class PlagiarismChecker {
    private Map<String, String> database;

    public PlagiarismChecker() {
        database = new HashMap<>();
        FuenteController fuente = new FuenteController();
        String[] fuentes = fuente.cargarFuentes();
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

    private static String buildSearchTerm(String userInput) {
        List<String> words = Arrays.asList(userInput.split("\\s+"));

        String searchTerm = words.stream().map(word -> word.trim())
                .filter(word -> !word.isEmpty())
                .collect(Collectors.joining(" & "));

        return searchTerm;
    }
}
