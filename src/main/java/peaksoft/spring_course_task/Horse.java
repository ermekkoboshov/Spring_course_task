package peaksoft.spring_course_task;

import java.util.Scanner;

public class Horse implements  Animal {

    private String name;
    private int age;
    private String color;



    public Horse() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "\n Horse{" +
                "\n name='" + name + '\'' +
                "\n age=" + age +
                "\n color='" + color + '\'' +

                '}';



    }


    @Override
    public void AnimalPlus() {
        System.out.println("\n---Мен жылкыны жакшы кором" +
                "\n---Жылкы улак тартканга жакшы");

    }

    @Override
    public void AnimalMinus() {
        System.out.println("\n---Жылкынын жаман жагы \n---Уркок болот");
    }
}
