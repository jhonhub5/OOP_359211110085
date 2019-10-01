package lab8;

public class PersonEx {
    String name;
    int bornYear;

    public PersonEx (String name,int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }

    public PersonEx(String meteo, String s, String california) {

    }

    public void introduce (){
        System.out.println("My name is"+ name +",");
        System.out.println("I was born in"+bornYear+".");


    }

}
