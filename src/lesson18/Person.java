package lesson18;

import java.util.Objects;

public class Person implements Comparable {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        Person person = (Person) o;
        if (this.lastName.equals(person.getLastName())){
            return this.firstName.compareTo(person.getFirstName());
        }
        return.this.lastName.compareTo(person.getLastName());
    }
}

