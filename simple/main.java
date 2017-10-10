public class main {


    public static void main(String[] args) {

        /**
         * CREATION
         */

        // Creating Cart
        Cart cart = new Cart();

        // Creating Hardware types
        HardwareType h_type = new HardwareType("x type ram");

        // Creating Hardware
        Hardware ram_x = new Hardware("Kingston ram", h_type);

        // Creating notebook types
        NotebookType acer_type = new NotebookType("acer");


        // Creating Notebooks and assigning notebook type
        Notebook acer = new Notebook("Acer_1", acer_type);
        Notebook asus = new Notebook("Asus_1", new NotebookType("asus type"));

        // Assign h_type to acer notebooks
        acer._type.add(h_type);

        // Add acer hardware to acer notebook. Exptected result: success
        acer.addHardware(ram_x);

        // Add acer hardware to asus notebook. Exptected result: fail
        asus.addHardware(ram_x);



    }

}
