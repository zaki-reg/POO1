import java.util.ArrayList;

public class Memory {
	
    private static int capacity;
    private ArrayList<Process> loadedProcesses;

    public Memory(int ram) {
        Memory.capacity = ram;
        this.loadedProcesses = new ArrayList<>();
    }

    public void loadProcess(Process p) {
        if (!p.isLoaded()) {
            if (p.getMemoryRequired() <= capacity) {
                loadedProcesses.add(p);
                capacity -= p.getMemoryRequired();
                p.setLoaded(true);
                System.out.println("Process " + p.getId() + " is loaded.");
            } else {
                System.out.println("Not enough memory to load process " + p.getId());
            }
        } else {
            System.out.println("Process " + p.getId() + " is already loaded.");
        }
        displayMemoryStatus();
    }

    public void freeProcess(Process p) {
        if (p.isLoaded()) {
            loadedProcesses.remove(p);
            capacity += p.getMemoryRequired();
            p.setLoaded(false);
            System.out.println("Process " + p.getId() + " is freed.");
        } else {
            System.out.println("Process " + p.getId() + " is not loaded.");
        }
        displayMemoryStatus();
    }

    public void displayMemoryStatus() {
        System.out.println("Available Capacity: " + capacity + " MB");
        System.out.println("Processes loaded: " + loadedProcesses.size());
        for (Process p : loadedProcesses) {
            System.out.println(" - Process " + p.getId() + " (Loaded: " + p.isLoaded() + ")");
        }
        System.out.println("====================================");
    }
}
