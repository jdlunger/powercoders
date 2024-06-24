class Main {
    public static void main(String[] args) {
        SodaFetcher fetcher1 = new SodaFetcher(new AutoMachine());
        SodaFetcher fetcher2 = new SodaFetcher(new PersonMachine());

        fetcher1.fetchSoda(5);
        fetcher2.fetchSoda(5);
        fetcher2.fetchSoda(1);
    }
}

class SodaFetcher {
    IVendingMachine machine;

    SodaFetcher(IVendingMachine machine) {
        this.machine = machine;
    }

    void fetchSoda(int money) {
        if (money > 3) {
            System.out.println("Got enough money; fetching soda.");
            machine.getCoke();
        } else {
            System.out.println("Not enough money; not fetching soda.");
        }
    }
}

interface IVendingMachine {
    void getCoke();
}

class AutoMachine implements IVendingMachine {
    @Override
    public void getCoke() {
        System.out.println("> Vending Coke automatically.");
    }
}

class PersonMachine implements IVendingMachine {
    @Override
    public void getCoke() {
        System.out.println("> Small person giving you a Coke.");
    }
}
