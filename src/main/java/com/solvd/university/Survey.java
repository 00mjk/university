package com.solvd.university;

import java.util.Map;

/**
 * @param <T> Any object (person) than can be asked
 */
public class Survey<T extends Askable> {

    private String question;
    private String answer;

    /**
     * String means answer of person
     */
    private Map<T, String> results;

    public Survey(String question, String answer, Map<T, String> results) {
        this.question = question;
        this.answer = answer;
        this.results = results;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Map<T, String> getResults() {
        return results;
    }

    public void setResults(Map<T, String> results) {
        this.results = results;
    }
}
