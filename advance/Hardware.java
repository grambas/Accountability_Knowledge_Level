public abstract class Hardware {
    public String name;
    public HardwareType type;


    public Hardware(String name, HardwareType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public HardwareType getType() {
        return type;
    }
}
