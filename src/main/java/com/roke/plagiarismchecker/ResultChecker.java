package com.roke.plagiarismchecker;

/**
 *
 * @author Jhordie
 */
public class ResultChecker {
    private boolean isPlagiarized;
    private String matchingText;

    public ResultChecker(boolean isPlagiarized, String matchingText) {
        this.isPlagiarized = isPlagiarized;
        this.matchingText = matchingText;
    }
    
    public boolean isPlagiarized(){
        return isPlagiarized;
    }
    
    public String getMatchingText(){
        return matchingText;
    }

    @Override
    public String toString() {
        if (isPlagiarized){
            //return 
            return "Plagio detectado: " + matchingText;
        } else {
            return "No se detecto plagio.";
        }
    }
}
