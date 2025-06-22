public class Computer {
    
    private String CPU;
    private int RAM;

   
    private int storage;
    private String graphicsCard;
    private String operatingSystem;

    
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    public static class Builder {
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String OS) {
            this.operatingSystem = OS;
            return this;
        }

        
        public Computer build() {
            return new Computer(this);
        }
    }

    public void displayConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("OS: " + operatingSystem);
        System.out.println("----------------------------");
    }
}
