package exercise3;

public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingComputer =
                new Computer.Builder()
                        .setCpu("Intel i7")
                        .setRam(16)
                        .setStorage(512)
                        .build();

        Computer officeComputer =
                new Computer.Builder()
                        .setCpu("Intel i5")
                        .setRam(8)
                        .setStorage(256)
                        .build();

        System.out.println("Gaming Computer:");

        gamingComputer.displayDetails();

        System.out.println();

        System.out.println("Office Computer:");

        officeComputer.displayDetails();
    }
}
