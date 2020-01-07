package com.rc.dp.pattern.create.builder;

/**
 * @ClassName Person
 * @Description TODO
 * @Author liux
 * @Date 19-11-25 上午12:12
 * @Version 1.0
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    private Person() {
    }

    public static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder weight(double weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder score(int score) {
            person.score = score;
            return this;
        }

        public PersonBuilder loc(Location location) {
            person.loc = location;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}

class Location {
    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}