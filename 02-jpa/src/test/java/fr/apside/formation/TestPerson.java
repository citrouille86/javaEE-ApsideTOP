package fr.apside.formation;

import fr.apside.formation.model.Address;
import fr.apside.formation.model.Person;
import fr.apside.formation.test.JpaTest;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * @author François Robert
 */

public class TestPerson extends JpaTest {

  private static EntityManagerFactory entityManagerFactory;
  private static EntityManager entityManager;

  @Test
  public void personTest() {
    /*
    Person person = new Person("login", "surname", "firstname");
    person = persist(person);
    Address address = new Address("line", "zipcode", "city");
    address.setPerson(person);
    persist(address);
    Assert.assertEquals(new Long(1), person.getId());
    person = new Person("login", "surname", "firstname");
    person = persist(person);
    */
  }



}
