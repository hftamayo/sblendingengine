package com.tamayo.lendingengine.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

//la clase es final
@Entity
public final class User {
    @Id
    private long id;
    private String lastName;
    private String firstName;
    private int age;
    private String occupation;

    public User() {
    }

    public User(long id, String lastName, String firstName, int age, String occupation) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.occupation = occupation;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    //reescribir los metodos toString, equals y hashCode para usar estructuras de datos
    // leer el libro effective java para los fundamentos

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(occupation, user.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, age, occupation);
    }

}
