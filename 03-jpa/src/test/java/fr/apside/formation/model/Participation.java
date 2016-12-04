package fr.apside.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * @author François Robert
 */

public class Participation implements Serializable{

  private static final long serialVersionUID = 6082551497084979589L;

  private Training training;

  private Person participant;

  private Date registration;

  public Participation() {
  }

  public Participation(Training training, Person participant) {
    this.training = training;
    this.participant = participant;
  }

  @PrePersist
  public void settingRegistrationDate() {
    setRegistration(new Date());
  }

  public Training getTraining() {
    return training;
  }

  public void setTraining(Training training) {
    this.training = training;
  }

  public Person getParticipant() {
    return participant;
  }

  public void setParticipant(Person participant) {
    this.participant = participant;
  }

  public Date getRegistration() {
    return registration;
  }

  public void setRegistration(Date registration) {
    this.registration = registration;
  }
}
