package ra.map;

public class Person {
//    @Override
//    public int compareTo(Person o) {
//        return this.age-o.getAge();
//    }

    int age;
     String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : "+name+ "| Age: "+age;
    }
}
