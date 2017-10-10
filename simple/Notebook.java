import java.util.ArrayList;
import java.util.List;

public class Notebook {
    public String _name;
    public NotebookType _type;
    public List hardware = new ArrayList<Hardware>();



    public Notebook(String name, NotebookType type) {
        _name = name;
        _type = type;
    }


    public void addHardware(Hardware h) {
        if (_type.isCompatible(h._type)) {
            this.hardware.add(h);
            System.out.println("Compatible! Hardware added!");
        } else {
            System.out.println("Hardware is not compatible!");
        }

    }

}
