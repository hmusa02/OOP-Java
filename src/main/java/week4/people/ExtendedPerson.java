package week4.people;

public class ExtendedPerson extends Person{
    private int age;
    private String country;

    public ExtendedPerson(String name, String address, int age, String country) {
        super(name, address);
        this.age = age;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
