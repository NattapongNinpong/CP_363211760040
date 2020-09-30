package Exercise;

public class SuperCar {
    private String car_brand;
    private String car_color;
    private String car_engine_size;
    private int max_speed;
    private String country_of_origin;

    public SuperCar(){}



    public String getCar_brand(){
        return car_brand;
    }
    public void setCar_brand(String b){
        car_brand = b;
    }
    public String getCar_color(){
        return car_color;
    }
    public void setCar_color(String c){
        car_color = c;
    }
    public String getCar_engine_size(){
        return car_engine_size;
    }
    public void setCar_engine_size(String a){
        car_engine_size = a;
    }
    public int getMax_speed(){
        return max_speed;
    }
    public void setMax_speed(int m) {
        max_speed = m;
    }
    public String getCountry_of_origin(){
        return country_of_origin;
    }
    public void setCountry_of_origin(String o){
        country_of_origin = o;
    }

    public SuperCar(String b,String c,String a,int m,String o){
        car_brand = b;
        car_color = c;
        car_engine_size = a;
        max_speed = m;
        country_of_origin = o;
    }



}
