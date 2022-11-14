public class Main {
    public static void main(String[] args) {
        Car ladaGranta=new Car("Lada","",1.7,"желтый",2015,"Россия");
        Car audiA8=new Car("Audi","A8 L TDI quattro",3.0,"черный",2020,"");
        Car bmwZ8=new Car("BMW","Z8",-3.0,"черный",2021,"Германия");
        Car kiaSportage=new Car("KIA","Sportage",2.4,"красный",2018,"Южная Корея");
        Car hundayAvante=new Car("Hunday","Avante",1.6,"",-2016,"Южная Корея");

        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());
        System.out.println(kiaSportage.toString());
        System.out.println(hundayAvante.toString());

    }
}