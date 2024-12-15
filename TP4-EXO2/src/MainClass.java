public class MainClass {
    public static void main(String[] args) {
        Memory memory = new Memory(1000);

        Process p1 = new Process(100);
        Process p2 = new Process(100);
        Process p3 = new Process(150);
        Process p4 = new Process(250);
        Process p5 = new Process(2048);

        memory.loadProcess(p1);
        memory.loadProcess(p2);
        memory.freeProcess(p1);
        memory.loadProcess(p3);
        memory.loadProcess(p4);
        memory.loadProcess(p5);
    }
}
