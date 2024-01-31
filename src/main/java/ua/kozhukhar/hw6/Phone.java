package ua.kozhukhar.hw6;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Методы для доступа к переменным полям
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


        // Конструктор класса на вход три параметра
    public Phone(String number, String model, double weight){
            this.number = number;
            this.model = model;
            this.weight = weight;
        }
        //Конструтор класса на вход на два параметра
    public Phone(String number, String model) {
            this.number = number;
            this.model = model;

        }
        // Конструктор без параметров (по умолчанию)
    public Phone() {

            this.number = "";
            this.model = "";
            this.weight = 0.0;
        }
    // Метод для получения звонка
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Метод для получения номера телефона
   // public String getNumber() {
        //return number;
    //}

    public static void main(String[] args) {
        // Создание экземпляров Phone
        Phone phone1 = new Phone("111-222-33-44", "iPhone 15", 0.4);
        Phone phone2 = new Phone("775-65-47", "Nokia3110");
        Phone defaultPhone = new Phone();

        // Заполнение полей для phone2
        phone2.setNumber("775-65-47");
        phone2.setModel("Nokia3110");

        // Заполнение полей для defaultPhone
        defaultPhone.setNumber("defaultNumber");
        defaultPhone.setModel("defaultModel");
        defaultPhone.setWeight(0.4);  // Пример установки веса

        // Вызов методов для каждого объекта
ra        System.out.println("Phone 1:");
        phone1.receiveCall("David");
        System.out.println("Phone Number: " + phone1.getNumber());

        System.out.println("\nPhone 2:");
        phone2.receiveCall("Anna");
        System.out.println("Phone Number: " + phone2.getNumber());

        System.out.println("\nDefault Phone:");
        defaultPhone.receiveCall("Andrew");
        System.out.println("Phone Number: " + defaultPhone.getNumber());
    }
}





