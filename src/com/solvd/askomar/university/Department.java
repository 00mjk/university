package com.solvd.askomar.university;

import java.util.Arrays;
import java.util.Objects;

public class Department {

  private String name;
  private Specialization[] specializations;

  public Department(String name, Specialization[] specializations) {
    this.name = name;
    this.specializations = specializations;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Specialization[] getSpecializations() {
    return specializations;
  }

  public void setSpecializations(Specialization[] specializations) {
    this.specializations = specializations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Department that = (Department) o;
    return Objects.equals(name, that.name) && Arrays.equals(specializations, that.specializations);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(name);
    result = 31 * result + Arrays.hashCode(specializations);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Department{");
    sb.append("name='").append(name).append('\'');
    sb.append(", specializations=").append(Arrays.toString(specializations));
    sb.append('}');
    return sb.toString();
  }
}
