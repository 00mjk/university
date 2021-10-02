package com.solvd.askomar.university;

import java.time.LocalDateTime;

// transl. Аттестат
public class Certificate {
    private Integer id;
    private Subject subject;
    private Integer mark;
    private LocalDateTime dateTime;

    public Certificate(Integer id, Subject subject, Integer mark) {
        this.id = id;
        this.subject = subject;
        this.mark = mark;
        this.dateTime = LocalDateTime.now();
    }

    public Certificate(Integer id, Subject subject, Integer mark, LocalDateTime dateTime) {
        this.id = id;
        this.subject = subject;
        this.mark = mark;
        this.dateTime = dateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getMark() {
        return this.mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
