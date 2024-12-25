import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
       

        Process p1 = new Process(100);
        Process p2 = new Process(100);
        Process p3 = new Process(150);
        Process p4 = new Process(250);
        Process p5 = new Process(2048);
        
        
        Memory.loadedProcesses = new ArrayList<>();

        Memory.loadProcess(p1);
        Memory.loadProcess(p2);
        Memory.freeProcess(p1);
        Memory.loadProcess(p3);
        Memory.loadProcess(p4);
        Memory.loadProcess(p5);
    }
}
