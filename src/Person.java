import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String adress;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    public boolean hasAge() {
        return age >=0;
    }
    public boolean hasAddress() {
        return adress !=null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return adress;
    }

    public String setAddress(String address) {
        this.adress = address;
        return this.adress;
    }
    public void happyBirthday() {
        if (hasAge()){
            age++;
        }
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(adress);
    }

    @Override
    public String toString() { return "Person{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", address='" + adress + '\'' +
            '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && Objects.equals(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
