import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta=new Car("Lada","",1.7,"желтый",
                2015,"Россия","седан","автомат","",5,
                "");
        Car audiA8=new Car("Audi","A8 L TDI quattro",3.0,"черный",
                2020,"","","","",8,
                "");
        Car bmwZ8=new Car("BMW","Z8",-3.0,"черный",2021,
                "Германия","","автомат","",7,
                "зимние");
        Car kiaSportage=new Car("KIA","Sportage",2.4,"красный",
                2018,"Южная Корея","","","",
                4,"");
        Car hundayAvante=new Car("Hunday","Avante",1.6,"",-2016,
                "Южная Корея","","","",3,"");

        /*System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());
        System.out.println(kiaSportage.toString());

         */
        System.out.println(hundayAvante.toString());
        hundayAvante.changeTyres("всесезонные");
        System.out.println(hundayAvante.getSeаsonTyres());

        /*System.out.println(hundayAvante.getCarNumberGIBDD());
        hundayAvante.carNumber("Ю",7,"иГ",76);
        System.out.println(hundayAvante.getCarNumberGIBDD());

         */

        System.out.println(hundayAvante.getCarNumberStringGIBDD());
        hundayAvante.carNumberTwo("а797шл967");
        System.out.println(hundayAvante.getCarNumberStringGIBDD());

        Car.Key hundayKey = hundayAvante.new Key(true,false);
        Car.Key kiaSportageKey = kiaSportage.new Key(true,true);
        Car.Insurance hundayInsurance= hundayAvante.new Insurance(350,5600.00,"ghj78546");

        System.out.println(hundayInsurance.getNumberInsurance());
        System.out.println(hundayInsurance.getValidityPeriod());

        System.out.println(kiaSportageKey.getBrandKey());

        hundayInsurance.checkDateInsurance();


    }
}