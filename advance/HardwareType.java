import java.util.ArrayList;
import java.util.List;

public class HardwareType {
    public List compatible_notebooks = new ArrayList<NotebookType>();
    public String name;

    public HardwareType(String name) {
        this.name = name;
    }

    public void add(NotebookType type) {
        compatible_notebooks.add(type);
    }

    public boolean isCompatible(NotebookType type) {
        return compatible_notebooks.contains(type);
    }
}
