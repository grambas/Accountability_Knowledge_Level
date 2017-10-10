import java.util.ArrayList;
import java.util.List;

public class CartItem {
    public Notebook notebook;
    public List hardware = new ArrayList<Hardware>();

    public CartItem() {

    }

    public void addLaptop(Notebook n) {
        this.notebook = n;
    }

    public void addHardware(Hardware h) {
        if (h.type.isCompatible(notebook.type)) {
            this.hardware.add(h);
            System.out.println("Compatible! Hardware added!");
        } else {
            System.out.println("Hardware is not compatible!");
        }

    }
}
