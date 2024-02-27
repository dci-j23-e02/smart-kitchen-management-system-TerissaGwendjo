package src;

public class Appliance {

    private Integer id;
    private String name;
    private String type;
    private String status;
    private Integer usageTime;

    // Constructors
    public Appliance() {
    }

    // Constructor without ID (for insertion purposes where ID is auto-generated)
    public Appliance(String name, String type, String status, int usageTime) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.usageTime = usageTime;
    }

    // Constructor with all fields (including ID)
    public Appliance(int id, String name, String type, String status, int usageTime) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.usageTime = usageTime;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(int usageTime) {
        this.usageTime = usageTime;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Appliance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", usageTime=" + usageTime +
                '}';
    }
}

