package com.solvd.askomar.university.entrantform;

import com.solvd.askomar.university.Entrant;
import com.solvd.askomar.university.Specialization;

import java.time.LocalDate;
import java.util.Objects;

/** transl. Заявка на магистратуру */
public class MasterEntrantForm extends EntrantForm {

  private Specialization bachelorsSpec;
  private LocalDate finishedDate;

  public MasterEntrantForm(
      Entrant entrant,
      Specialization specialization,
      Boolean paid,
      Specialization bachelorsSpec,
      LocalDate finishedDate) {
    super(entrant, specialization, paid);
    this.bachelorsSpec = bachelorsSpec;
    this.finishedDate = finishedDate;
  }

  public Specialization getBachelorsSpec() {
    return bachelorsSpec;
  }

  public void setBachelorsSpec(Specialization bachelorsSpec) {
    this.bachelorsSpec = bachelorsSpec;
  }

  public LocalDate getFinishedDate() {
    return finishedDate;
  }

  public void setFinishedDate(LocalDate finishedDate) {
    this.finishedDate = finishedDate;
  }

  // TODO refactor equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MasterEntrantForm that = (MasterEntrantForm) o;
    return Objects.equals(bachelorsSpec, that.bachelorsSpec)
        && Objects.equals(finishedDate, that.finishedDate);
  }

  // TODO refactor hashode counting
  @Override
  public int hashCode() {
    return Objects.hash(bachelorsSpec, finishedDate);
  }

  // FIXME add format to date output
  @Override
  public String toString() {
    return String.format(
        "Master's entrant form: \n\tEntrant: %s\n\tEducation specialisation -  %s,\n\tBachelor's specialisation: %s\n\tFinished at: %s\n\tPaid?: %b",
        this.getEntrant(),
        this.getSpecialization(),
        this.bachelorsSpec,
        this.finishedDate.toString(),
        this.paid());
  }
}
