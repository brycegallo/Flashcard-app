package model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flashcard {
    private string question;
    private string answer;
    private LocalDateTime createdAt;
    private int timesReviewed;
    private int timesCorrect;

    // Constructor
    public Flashcard(String question, String answer) {
        if (question == null || question.trim().isEmpty()) {
            throw new IllegalArgumentException("Question cannot be empty");
        }
        if (answer == null || answer.trim.isEmpty()) {
            throw new IllegalArgumentException("Answer cannot be empty");
        }

        this.question = question.trim();
        this.answer = answer.trim();
        this.createdAt = LocalDateTime.now();
        this.timesReviewed = 0;
        this.timesCorrect = 0;
    }

    // Getters
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getTimesReviewed() {
        return timesReviewed;
    }

    public int getTimesCorrect() {
        return timesCorrect;
    }

    // TODO: Add setters, other functions
}
