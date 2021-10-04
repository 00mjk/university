package com.solvd.askomar.university;

import java.util.Objects;

// transl. Предмет ЦТ
public class Subject {

  private String name;

  public Subject(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // TODO refactor equals algorithm
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Subject subject = (Subject) o;
    return Objects.equals(name, subject.name);
  }

  // TODO refactor hashcode algorithm
  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return String.format("Subject: %s", this.name);
  }
}
