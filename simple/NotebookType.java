import java.util.ArrayList;
import java.util.List;

public class NotebookType {
    public String _name;
    public List _compatible_hardware = new ArrayList<HardwareType>();


    public NotebookType(String name) {
        _name = name;
    }

    public void add(HardwareType obj) {
        _compatible_hardware.add(obj);
    }
    public boolean isCompatible(HardwareType h){
        if (_compatible_hardware.contains(h))
            return true;

        return false;
    }

}
