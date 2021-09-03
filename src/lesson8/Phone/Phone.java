package lesson8.Phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }


    public void receiveCall(String name) {
        System.out.println("Звонит " + number);
    }

    public void receiveCall(String number, String name) {
        System.out.println("\nЗвонит " + name + " " + number);
    }

    public String getNumber() {
        return this.number;
    }

    public void display() {
        System.out.printf("\nНомер: %s\nМодель: %s\nВес: %d", this.number, this.model, this.weight);
    }

    public void sendMessage(String... numbers) {
        System.out.print("Номер телефона: ");
        for (String s : numbers) {

            System.out.print(s + " ");
        }
    }


}
