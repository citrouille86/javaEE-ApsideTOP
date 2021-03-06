package fr.apside.formation.services;

import fr.apside.formation.model.Category;
import fr.apside.formation.model.Person;
import fr.apside.formation.model.Training;
import fr.apside.formation.model.TrainingAgency;
import fr.apside.formation.model.TrainingOnline;
import fr.apside.formation.model.TrainingType;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.HashSet;

/**
 * @author François Robert
 */
@Stateless
public class TrainingService {

  @PersistenceContext
  private EntityManager entityManager;

  @EJB
  private CategoryService categoryService;

  /**
   * Création d'une formation
   * si ce n'est pas une formation en agence ou en ligne, null est renvoyé
   * si le formateur n'existe pas dans la base, null est renvoyé
   * @param trainingType type de la formation
   * @param name nom
   * @param mainCategoryName Nom de la catégorie principale
   * @return formation
   */
  public Training createNewTraining(TrainingType trainingType, String name, String mainCategoryName) {
    Training training;
    switch (trainingType) {
      case AGENCY:
        training = new TrainingAgency();
        break;
      case ONLINE:
        training = new TrainingOnline();
        break;
      default:
        return null;
    }
    if (training != null) {
      training.setName(name);
      Category mainCategory = categoryService.findByName(mainCategoryName);
      if (mainCategory == null) {
        mainCategory = categoryService.create(mainCategoryName);
      }
      training.setCategorySet(new HashSet<>());
      training.getCategorySet().add(mainCategory);
      training.setStartDate(new Date());
      entityManager.persist(training);
    }
    return training;
  }
}
