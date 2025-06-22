public class Main {
    public static void main(String[] args) {
       
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1024)
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11 Pro")
                .build();

       
        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(8)
                .setOperatingSystem("Ubuntu Linux")
                .build();

        gamingPC.displayConfig();
        officePC.displayConfig();
    }
}
