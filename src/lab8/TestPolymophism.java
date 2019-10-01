package lab8;

public class TestPolymophism {
    public static void main(String[] args) {
        PersonEx person1,person2,person3;
        person1 = new PersonEx("Mark",1980);
        person2 = new PersonEx("Meteo","1981","California");
        person3 = new PersonEx("Danny","1986","NYC");
        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
}
