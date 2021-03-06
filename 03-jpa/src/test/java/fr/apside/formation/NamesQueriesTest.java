package fr.apside.formation;

import fr.apside.formation.model.Person;
import fr.apside.formation.test.JpaTest;
import org.junit.Test;

import java.util.List;

/**
 * @author François Robert
 */
public class NamesQueriesTest extends JpaTest {

  @Test
  public void testPersonList() {
    /*
    addingPersons();
    List<Person> personList = getPersonOrderByLogin();
    assertNotNull(personList);
    assertEquals(5, personList.size());
    Person zephir = getPersonByLogin("zephir");
    assertNotNull(zephir);
    assertEquals("zephir", zephir.getLogin());
    Person toto = getPersonByLogin("toto");
    assertNull(toto);
    */
  }

  @Test
  public void testParticipationQuery() {
    /*
    addingPersons();
    Training training1 = persist(new TrainingAgency("formation1", "room51", new Date()));
    Training training2 = persist(new TrainingAgency("formation2", "salle-I", new Date()));
    getPersonOrderByLogin().stream().forEach(person -> persist(new Participation(training1, person)));
    getPersonOrderByLogin().stream().filter(person -> person.getLogin().startsWith("a")).forEach(person -> persist(new Participation(training2, person)));
    List<Person> personInFormation2 = getPersonInTraining("formation2");
    assertNull(personInFormation2);
    assertEquals(2, personInFormation2.size());
    */
  }

  private List<Person> getPersonInTraining(String trainingName) {
    return null;
  }

  private Person getPersonByLogin(String login) {
    return null;
  }

  private void addingPersons() {
    persist(new Person("abc", "surname", "firstname"));
    persist(new Person("zephir", "surname", "firstname"));
    persist(new Person("test", "surname", "firstname"));
    persist(new Person("abbot", "surname", "firstname"));
    persist(new Person("tony", "surname", "firstname"));
  }

  /**
   * @return liste des personne ordonnée
   */
  private List<Person> getPersonOrderByLogin() {
    return null;
  }

}
