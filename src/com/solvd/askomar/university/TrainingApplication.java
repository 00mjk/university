package com.solvd.askomar.university;

// transl. Заявка на обучение
public class TrainingApplication {
    public static Integer trAppAmount = 0;
    private Integer id;
    private Entrant entrant;
    private Specialization specialization;
    private Boolean isPaid;

    public TrainingApplication(Entrant entrant, Specialization specialization, Boolean isPaid) {
        this.entrant = entrant;
        this.specialization = specialization;
        this.isPaid = isPaid;
        trAppAmount++;

    }
}
