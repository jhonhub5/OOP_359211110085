package lab8;

public class Sheriff extends PersonEx {
    String workState;
    public Sheriff (String name, int bornYear){
        super(name,bornYear);
        this.workState = workState;


    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff and work in"+
                workState+".");
    }
}

