package com.solvd.askomar.university;

// transl. Аттестат
public class Certificate {
    private Integer id;
    private Subject subject;
    private Integer mark;

    public Certificate(Integer id, Subject subject, Integer mark) {
        this.id = id;
        this.subject = subject;
        this.mark = mark;
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
}
