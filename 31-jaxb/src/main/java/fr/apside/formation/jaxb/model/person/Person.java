package fr.apside.formation.jaxb.model.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "Personne")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Person {

    /**
     * Identifiant
     */
    @XmlAttribute(name = "identifiant")
    private Long id;

    /**
     * Prénom
     */
    @XmlElement(name = "Prenom")
    private String name;

    /**
     * Nom de famille
     */
    @XmlElement(name = "Nom")
    private String surname;

    /**
     * Liste de numéro de téléphone (sous forme de liste de chaine)
     */
    private List<String> phoneNumberList;

    /**
     * Adresse de la personne
     */
    @XmlElement(name = "addresse_principale")
    private Address address;

    // adresse

    public Person() {
    }

    public Person(Long id, String name, String surname) {
        this();
        setId(id);
        setName(name);
        setSurname(surname);
    }

    public Person(Long id, String name, String surname, Address address) {
        this(id, name, surname);
        setAddress(address);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<String> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId()) &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurname(), person.getSurname()) &&
                Objects.equals(getPhoneNumberList(), person.getPhoneNumberList()) &&
                Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", phoneNumberList=" + phoneNumberList +
                '}';
    }
}
