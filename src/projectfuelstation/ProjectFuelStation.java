package projectfuelstation;

import Class.Fuel;
import javax.swing.JOptionPane;

public class ProjectFuelStation {

    public static void main(String[] args) {
        Fuel fuelObj = new Fuel();
        long priceCorriente = fuelObj.getPricePerGallonCorriente();
        long priceExtra = fuelObj.getPricePerGallonExtra();
        
        if (priceCorriente == 0) {
            fuelObj.setPricePerGallonCorriente(Long.parseLong(JOptionPane.showInputDialog("Ingrese el valor del galon de la gsolina corriente")));
        }
        if(priceExtra == 0){
            fuelObj.setPricePerGallonExtra(Long.parseLong(JOptionPane.showInputDialog("Ingrese el valor del galon de la gsolina corriente")));
        }
        
        System.out.println(
                fuelObj.getIdCorriente()
                + " " +
                fuelObj.getTypeFuelCorriente()
                + " " +
                fuelObj.getPricePerGallonCorriente()
        );
        System.out.println("\n");
        System.out.println(
                fuelObj.getIdExtra()
                + " " +
                fuelObj.getTypeFuelExtra()
                + " " +
                fuelObj.getPricePerGallonExtra()
        );
    }

}
