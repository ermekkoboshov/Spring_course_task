package peaksoft.spring_course_task;

import jdk.jfr.Enabled;


public class Person {
    private String name;
    private int age;
    private Animal animal;




    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {

        return

                "\n-Person{" +
                "\n-name='" + name + '\'' +
                ",\n-age=" + age +

                '}';

    }
}
