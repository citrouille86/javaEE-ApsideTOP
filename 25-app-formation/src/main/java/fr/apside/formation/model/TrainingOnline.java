package fr.apside.formation.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 * @author François Robert
 */
@Entity
@DiscriminatorValue("ONLINE")
public class TrainingOnline extends Training implements Serializable {

  private static final long serialVersionUID = -8663689332095694711L;

  private String trainingUrl;

  public TrainingOnline() {
    super(TrainingType.ONLINE);
  }

  public TrainingOnline(String name, String trainingUrl, Date startDate) {
    super(TrainingType.ONLINE, name, startDate);
    this.trainingUrl = trainingUrl;
  }

  public String getTrainingUrl() {
    return trainingUrl;
  }

  public void setTrainingUrl(String trainingUrl) {
    this.trainingUrl = trainingUrl;
  }
}
