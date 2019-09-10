package lab7;

public class PetApp {
    public static void main(String[] args) {

        //create class instant (object)
        Pet pet1 = new Pet();

        pet1.setOwnerName("John");
        pet1.setPetName("Owen");
        pet1.setPatAge(2);

        System.out.println(pet1.getOwnerName());
        System.out.println(pet1.getPetName());
        System.out.println(pet1.getPatAge());


        Pet pet2 = new Pet();
        pet2.setPatAge(10);
        pet2.setPetName("Lulu");
        pet2.setOwnerName("John");

        System.out.println(pet2.getPatAge());
        System.out.println(pet2.getPetName());
        System.out.println(pet2.getOwnerName());

        Pet pet3 = new Pet("John","Lele",20);
        System.out.println(pet3.getPatAge());
        System.out.println(pet3.getPetName());
        System.out.println(pet3.getOwnerName());






    }//main
}//class
