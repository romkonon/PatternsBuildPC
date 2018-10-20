public class App {
    public static void main(String[] args){
        Computer computer = new Computer.ComputerBuilder("test").setCpu(1).setMotherboard(1).build();
    }
}
