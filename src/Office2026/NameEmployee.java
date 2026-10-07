package Office2026;

public class NameEmployee {

    private String name;
    private String position;

    public NameEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return position + " " + name;
    }

}


