package org.example.Lektion5_Class_Object;

public class Person {

    public String name;
    public int age;
    public boolean isMarried;
    public boolean isProgramming;

    public Person(String name, int age, boolean isMarried, boolean isProgramming) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.isProgramming = isProgramming;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", isProgramming=" + isProgramming +
                '}';
    }

    public void startProgramming(){
        isProgramming= true;
    }

    public void eat(){
        System.out.println("Nu åter" + name);
    }

    public void isProgramming(){
        isProgramming= false;
    }

    public static void main(String[] args) {

        Person person1= new Person("Kalle", 50, true, false);

        System.out.println(person1.name);
    }


}
