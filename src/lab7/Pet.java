package lab7;

public class Pet {
    private String ownerName;
    private String petName;
    private int patAge;


    //constructor
    public Pet(){}

    public Pet(String ownerName,String petName,int patAge){
        this.ownerName = ownerName;
        this.petName = petName;
        this.patAge = patAge;

    }



    //gettrer and setter methods
    public String getOwnerName(){
        return this.ownerName ;
    }
    public void setOwnerName(String newOwnerName){
        this.ownerName = newOwnerName;
    }
    public String getPetName(){
        return this.petName;
    }
    public void setPetName(String newPetName){
        this.petName = petName;
    }
    public int getPatAge(){
        return this.patAge;
    }
    public void setPatAge(int patAge){
        this.patAge = patAge;
    }







}//class
