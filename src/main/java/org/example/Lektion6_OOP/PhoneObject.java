package org.example.Lektion6_OOP;

public class PhoneObject {


    public static void main(String[] args) {

        Phone myPhone = new Phone("Apple", "Iphone  SE");

        //myPhone.branch="Apple";

        //myPhone.model="Iphone SE";

        myPhone.call();

        System.out.println(myPhone.model);

        Phone phone2 = new Phone("Samsung", "S10");

        Phone phone3 = new Phone("Huawei", "P20");

        phone3.charge();

        phone2.call();

        phone2.charge();

    }
}
