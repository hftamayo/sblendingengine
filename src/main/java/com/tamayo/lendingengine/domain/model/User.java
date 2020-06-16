package com.tamayo.lendingengine.domain.model;

import java.util.Objects;

//la clase es final
public final class User {
    private final String lastName;
    private final String firstName;
    private final int age;
    private final String ocupation;

    public User(String lastName, String firstName, int age, String ocupation) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.ocupation = ocupation;
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

    public String getOcupation() {
        return ocupation;
    }

    //reescribir los metodos toString, equals y hashCode para usar estructuras de datos
    // leer el libro effective java para los fundamentos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(ocupation, user.ocupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, age, ocupation);
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", ocupation='" + ocupation + '\'' +
                '}';
    }
}
