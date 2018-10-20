public class Computer {
    private String name;

    private int motherboard;
    private int cpu;

    public String getName() {
        return name;
    }

    public int getMotherboard() {
        return motherboard;
    }

    public int getCpu() {
        return cpu;
    }

    private Computer(ComputerBuilder builder){
        this.name=builder.name;
        this.motherboard=builder.motherboard;
        this.cpu=builder.cpu;
    }

    public static class ComputerBuilder{
        String name;

        private int motherboard;
        private int cpu;

        public ComputerBuilder(String name){
            this.name=name;
        }

        public ComputerBuilder setMotherboard(int motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public ComputerBuilder setCpu(int cpu) {
            this.cpu = cpu;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}