package Class;

public class Fuel {
    private int[] id = {0, 1};
    private String[] typeFuel = {"Corriente", "Extra"};
    private long[] pricePerGallon = new long[2];
    
    public Fuel(){
        
    }

    public int getIdCorriente() {
        return id[0];
    }
    
    public int getIdExtra() {
        return id[1];
    }

    public String getTypeFuelCorriente() {
        return typeFuel[0];
    }
    
    public String getTypeFuelExtra() {
        return typeFuel[1];
    }

    public long getPricePerGallonCorriente() {
        return pricePerGallon[0];
    }
    
    public long getPricePerGallonExtra() {
        return pricePerGallon[1];
    }

    public void setPricePerGallonCorriente(long pricePerGallon) {
        this.pricePerGallon[0] = pricePerGallon;
    }
    
    public void setPricePerGallonExtra(long pricePerGallon) {
        this.pricePerGallon[1] = pricePerGallon;
    }
    
}
