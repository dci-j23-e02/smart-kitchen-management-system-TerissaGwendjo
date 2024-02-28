package src;

public class Appliance {

    private Integer id;
    private String name;
    private String type;
    private String status;
    private Integer usage_time;

    // Constructors
    public Appliance() {
    }

    // Constructor without ID (for insertion purposes where ID is auto-generated)
    public Appliance(String name, String type, String status, int usage_time) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.usage_time = usage_time;
    }

    // Constructor with all fields (including ID)
    public Appliance(int id, String name, String type, String status, int usage_time) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.usage_time = usage_time;
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

    public int getUsage_time() {
        return usage_time;
    }

    public void setUsage_time(int usage_time) {
        this.usage_time = usage_time;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Appliance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", usage_time=" + usage_time +
                '}';
    }
}

