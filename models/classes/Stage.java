package UTSS.models.classes;

public class Stage {
    private String stageName;
    private int capacity;
    private String stageLocation;
    

    public Stage(String stageName, int capacity, String stageLocation) {
        this.stageName = stageName;
        this.capacity = capacity;
        this.stageLocation = stageLocation;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStageLocation() {
        return stageLocation;
    }

    public void setStageLocation(String stageLocation) {
        this.stageLocation = stageLocation;
    }

    public void getStageDetails(){
        System.out.println("nama stage : " + this.stageName);
        System.out.println("kapasitas " + this.capacity);
        System.out.println("lokasi : " + this.stageLocation);
    }

}
