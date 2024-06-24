public class Main {
    public static void main(String[] args) {
        VendingMachine machine1 = new AutoMachine();
        VendingMachine machine2 = new PersonMachine();

        machine1.getCoke();
        machine2.getCoke();
    }
}

interface VendingMachine {
    void getCoke();
}

class AutoMachine implements VendingMachine {
    @Override
    public void getCoke() {
        System.out.println("Vending Coke automatically");
    }
}

class PersonMachine implements VendingMachine {
    @Override
    public void getCoke() {
        System.out.println("Small person giving you a coke");
    }
}
