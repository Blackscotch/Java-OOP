package hw1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Person {
    public static Set<Person> personSet = new LinkedHashSet<Person>();
    private final String name;
    private final String surname;
    private final String sex;
    private Person father;
    private Person mother;
    private Person child;
    private Person brother;
    private Person sister;

    public Person(String name, String surname, String sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        personSet.add(this);
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public Person getChild() {
        return child;
    }

    public Person getBrother() {
        return brother;
    }

    public Person getSister() {
        return sister;
    }

    public void setFather(Person person) {
        this.father = person;
    }

    public void setMother(Person person) {
        this.mother = person;
    }

    public void setChild(Person person) {
        this.child = person;
    }

    public void setBrother(Person person) {
        this.brother = person;
    }

    public void setSister(Person person) {
        this.sister = person;
    }

    public String getInfo(){
        return String.format("Имя: %s, Фамилия: %s пол: %s", name, surname, sex);
    }
}
