

public class Cliente {
    private final int entryTime;
    int startTime;
    private int exitTime;
    public Cliente(int entryTime, int exitTime)
    {
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }
    public int getEntryTime(){ return entryTime; }
    public int getExitTime(){ return exitTime; }
    public int getTotalTime()
    {
        return exitTime - entryTime;
    }
    public void setStartTime (int startTime)
    {
        this.startTime = startTime;
        this.exitTime = startTime + 120;
    }

}


