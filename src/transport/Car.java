package transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {

    private String brand;
    private String model;
    double engineVolume;
    private String color;
    private String country;
    private int year;
    private String bodyType;
    private String transmission;
    private String registrationNumber;
    private int numberOfSeats;
    private String seаsonTyres;

    private StringBuilder carNumberGIBDD;
    private String carNumberStringGIBDD;

    public class Insurance {

        private LocalDate validityPeriod =LocalDate.now();
        private double cost;
        private String numberInsurance;

        public Insurance(int numberDay, double cost, String numberInsurance) {
            if (numberDay <= 0) {
                this.validityPeriod = LocalDate.now();
            } else {
                this.validityPeriod = validityPeriod.plusDays(numberDay);
            }
            if (cost < 0) {
                this.cost = 10000.00;
                System.out.println("че с ценой сестренка?");
            } else {
                this.cost = cost;
            }
            Pattern pattern = Pattern.compile("^[A-Za-z]{3}[0-9]{6}$");
            Matcher matcher = pattern.matcher(numberInsurance);
            if (matcher.matches() == true) {
                this.numberInsurance = numberInsurance;
            } else {
                this.numberInsurance = "xxx000000";
                System.out.println("Проверьте номер страхового полиса");
            }
        }

        public void checkDateInsurance(){
            int b=LocalDate.now().lengthOfYear()-validityPeriod.getDayOfYear();
            if (validityPeriod.isBefore(LocalDate.now())){
                System.out.println("Страховка просрочена!!!!!");
            } else {
                int buffer=validityPeriod.getDayOfYear()-LocalDate.now().getDayOfYear();
                System.out.printf("Страховка закончится " + validityPeriod);
            }
        }


        public LocalDate getValidityPeriod() {
            return this.validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }
    }

    public class Key {

        private boolean remoteEngineStart;
        private boolean keylessAccess;


        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            if (remoteEngineStart != true || remoteEngineStart != false) {
                this.remoteEngineStart = false;
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess != true || keylessAccess != false) {
                this.keylessAccess = false;
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getBrandKey() {
            return Car.this.brand;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }


    public Car(String brand, String model, double engineVolume, String color, int year,
               String country, String bodyType, String transmission,
               String registrationNumber, int numberOfSeats, String seаsonTyres) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country == "") {
            this.bodyType = "default";
        } else {
            this.bodyType = country;
        }
        if (bodyType == null || bodyType == "") {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (transmission == null || transmission == "") {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null || registrationNumber == "") {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (seаsonTyres == null || seаsonTyres == "") {
            this.seаsonTyres = "летние";
        } else {
            this.seаsonTyres = seаsonTyres;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission == "") {
            this.transmission = "механика 5ти ступенчатая";
        } else {
            this.transmission = this.transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber == "") {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = model;
        }
    }

    public String getSeаsonTyres() {
        return seаsonTyres;
    }

    public void setSeаsonTyres(String seаsonTyres) {
        if (seаsonTyres == null || seаsonTyres == "") {
            this.seаsonTyres = "летние";
        } else {
            this.seаsonTyres = seаsonTyres;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model + "\nобъем двигателя " + engineVolume +
                ", цвет " + transmission + ", год выпуска " + year +
                ", страна производства " + bodyType + ", тип кузова " + bodyType + ", трансмиссия " + transmission +
                ", регистрационный номер " + registrationNumber + ",\n количество мест " + numberOfSeats +
                ", тип шин " + seаsonTyres;
    }

    public void changeTyres(String tyres) {
        if (tyres == null || tyres == "") {
            setSeаsonTyres("летние");
        } else {
            setSeаsonTyres(tyres);
        }
    }

    //  метод создан на основн SB с дополнительными проверками, получился более гибкий чем с
    //паттернами(еще слабо разобрался), не все проверки еще добавил но тем не меннее ))
    public void carNumber(String one, int two, String three, int four) {
        StringBuilder buffer = new StringBuilder();
        if (one == null || one == "" || one.length() > 1) {
            one = "х";
        } else one = one.toLowerCase();
        buffer.append(one);

        if (two <= 0 || two > 999) {
            buffer.append("000");
        } else if (two < 10) {
            buffer.append("00" + two);
        } else if (two < 100) {
            buffer.append("0" + two);
        } else {
            buffer.append(two);
        }
        if (three == null || three == "" || three.length() != 2) {
            three = "хх";
        } else three = three.toLowerCase();
        buffer.append(three);

        if (four <= 0 || four > 199) {
            buffer.append("000");
        } else if (four < 10) {
            buffer.append("00" + four);

        } else if (four < 100) {
            buffer.append("0" + four);
        } else {
            buffer.append(four);
        }
        carNumberGIBDD = buffer;
    }

    // метод исрользует шаблон для проверки номера
    // можно задействовать Scanner
    public void carNumberTwo(String carNumber) {
        Pattern pattern = Pattern.compile("^[а-я]{1}[0-9]{3}[а-я]{2}[0-9]{3}$");
        Matcher matcher = pattern.matcher(carNumber);
        if (matcher.matches() == true) {
            carNumberStringGIBDD = carNumber;
        } else {
            carNumberStringGIBDD = "х000хх000";
        }
    }

    public StringBuilder getCarNumberGIBDD() {
        return carNumberGIBDD;
    }

    public String getCarNumberStringGIBDD() {
        return carNumberStringGIBDD;
    }
}
