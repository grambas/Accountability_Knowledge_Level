public class main {


    public static void main(String[] args) {

        /**
         * CREATION
         */

        // Creating CartItems
        CartItem cartItem1 = new CartItem();
        CartItem cartItem2 = new CartItem();

        // Creating Hardware types
        HardwareType h_type = new HardwareType("x type");

        // Creating notebook types
        NotebookType acer_type = new NotebookType("acer");
        NotebookType asus_type = new NotebookType("asus");

        // Creating Notebooks and assigning notebook type
        Notebook acer1 = new Notebook("Acer_1", acer_type);
        Notebook asus1 = new Notebook("Asus_1", new NotebookType("asus type"));

        // ADD ACER NOTEBOOK TYPE AS COMPTABILE
        h_type.add(acer_type);
        // Create Hardware (Ram) product and assign type
        Ram ram_x = new Ram("ram_x", h_type);

        //Add Acer laptop and Ram module  to CartItem
        //Expected result: Compatible
        cartItem1.addLaptop(acer1);
        cartItem1.addHardware(ram_x);

        //Add Acer laptop and Ram module  to CartItem
        //Expected result: Not Compatible
        cartItem2.addLaptop(asus1);
        cartItem2.addHardware(ram_x);

    }

}
