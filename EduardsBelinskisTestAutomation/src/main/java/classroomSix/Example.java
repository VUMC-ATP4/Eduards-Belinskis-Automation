package classroomSix;

import com.github.javafaker.Faker;

public class Example {
    public static void main(String[] args) {

        Employee Employee1 = new Employee("Eduards", "Belinskis", 30);

        Faker faker = new Faker();
        String name = faker.name().firstName();
        String lastname = faker.name().lastName();
        int age = faker.number().numberBetween(1, 100);
        Employee employee2 = new Employee(name, lastname, age);
        Employee employee3 = new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(1, 100)  );
        System.out.println(employee2.toString());
        System.out.println(Employee1.toString());
        System.out.println(employee3.toString());

    }
}
