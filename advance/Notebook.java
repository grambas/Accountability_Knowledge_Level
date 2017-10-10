import java.util.ArrayList;
import java.util.List;

public class Notebook {
    public String name;
    public NotebookType type;


    public Notebook(String name, NotebookType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public NotebookType getType() {
        return type;
    }
}
