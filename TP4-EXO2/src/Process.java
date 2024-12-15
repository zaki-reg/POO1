
public class Process {
	private static int idCounter = 1;
	private int id;
	private int memoryRequired;
	private boolean isLoaded;
	
	public Process(int memory) {
		this.memoryRequired = memory;
		this.isLoaded = false;
		this.id = idCounter++;
	}
	
    public int getId() {
        return id;
    }

    public int getMemoryRequired() {
        return memoryRequired;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setMemoryRequired(int memoryRequired) {
        this.memoryRequired = memoryRequired;
    }

    public void setLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }
	

}
