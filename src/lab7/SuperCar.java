package lab7;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryforigin;


    public SuperCar (){}
    public SuperCar (String carbrand,String carcolor,String carenginesize,String maxspeed,String countryforigin){
        this.carbrand = carbrand;
        this.carcolor = carcolor;
        this.carenginesize = carenginesize;
        this.maxspeed = maxspeed;
        this.countryforigin = countryforigin;
    }

    public String getCarbrand(){
        return this.carbrand;
    }
    public void setCarbrand(String newcarbrand){
        this.carbrand = newcarbrand;
    }
    public String getCarcolor(){
        return this.carcolor;
    }
    public void setCarcolor(String newcarcolor){
        this.carcolor = newcarcolor;
    }
    public String getCarenginesize(){
        return this.carenginesize;
    }
    public void setCarenginesize(String newcarenginesize){
        this.carenginesize = newcarenginesize;
    }
    public String getMaxspeed(){
        return this.maxspeed;
    }
    public void setMaxspeed(String newmaxspeed){
        this.maxspeed = newmaxspeed;
    }
    public String getCountryforigin(){
        return this.countryforigin;
    }
    public void setCountryforigin(String newcountryforigin){
        this.countryforigin = newcountryforigin;
    }

    public void getsupercarinfo(){
        System.out.print(carbrand+carcolor+carenginesize+maxspeed+countryforigin);
    }








}//class
