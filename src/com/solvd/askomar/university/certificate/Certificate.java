package com.solvd.askomar.university.certificate;

import java.time.LocalDateTime;

public abstract class Certificate {

  private Integer id;
  private Integer mark;
  private LocalDateTime issuedAt;

  public Certificate(Integer id, Integer mark) {
    this.id = id;
    this.mark = mark;
    this.issuedAt = LocalDateTime.now();
  }

  public Certificate(Integer id, Integer mark, LocalDateTime issuedAt) {
    this.id = id;
    this.mark = mark;
    this.issuedAt = issuedAt;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getMark() {
    return this.mark;
  }

  public void setMark(Integer mark) {
    this.mark = mark;
  }

  public LocalDateTime getIssuedAt() {
    return issuedAt;
  }
}
