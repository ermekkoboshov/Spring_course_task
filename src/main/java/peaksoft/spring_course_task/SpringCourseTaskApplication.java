package peaksoft.spring_course_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.OutputStream;
import java.util.Scanner;


public class SpringCourseTaskApplication {

    public SpringCourseTaskApplication(String s) {
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Person person = (Person) context.getBean("myPerson", Person.class);
            System.out.println(person);
            Horse hors=context.getBean("myAnimal",Horse.class);
            System.out.println(hors);
            person.getAnimal().AnimalMinus();
            person.getAnimal().AnimalPlus();


        }
    }

