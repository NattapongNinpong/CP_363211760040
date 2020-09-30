package Exercise;

public class MySuperCar {
    public static void main(String[] args) {
        SuperCar car1 = new SuperCar();
        car1.setCar_brand("Lamborghini Veneno ");
        car1.setCar_color("ดำ");
        car1.setCar_engine_size("6.5 L V12");
        car1.setMax_speed(220);
        car1.setCountry_of_origin("Danish automotive");

        displayDataOjaectArrayList(car1);

        SuperCar car2 = new SuperCar();
        car2.setCar_brand("Lamborghini Veneno ");
        car2.setCar_color("แดง");
        car2.setCar_engine_size("6.5 L V12");
        car2.setMax_speed(220);
        car2.setCountry_of_origin("จDanish automotive");

        displayDataOjaectArrayList(car2);

        SuperCar car3 = new SuperCar();
        car3.setCar_brand("Lamborghini Veneno");
        car3.setCar_color("ขาว");
        car3.setCar_engine_size("6.5 L V12");
        car3.setMax_speed(200);
        car3.setCountry_of_origin("Danish automotive");

        displayDataOjaectArrayList(car3);

        SuperCar car4 = new SuperCar();
        car4.setCar_brand("Lamborghini Veneno");
        car4.setCar_color("น้ำเงิน");
        car4.setCar_engine_size("6.5 L V12");
        car4.setMax_speed(200);
        car4.setCountry_of_origin("Danish automotive");

        displayDataOjaectArrayList(car4);

        SuperCar car5 = new SuperCar();
        car5.setCar_brand("Lamborghini Veneno");
        car5.setCar_color("เขียว");
        car5.setCar_engine_size("6.5 L V12");
        car5.setMax_speed(200);
        car5.setCountry_of_origin("Danish automotive");

        displayDataOjaectArrayList(car5);
    }

    private static void displayDataOjaectArrayList(SuperCar car) {
        System.out.println(car.getCar_brand());
        System.out.println(car.getCar_color());
        System.out.println(car.getCar_engine_size());
        System.out.println(car.getMax_speed());
        System.out.println(car.getCountry_of_origin());
    }
}
