/**
 * Abhi Vachani
 * Oct 1 2021
 * Mars Class
 **/
public class Mars extends Currency implements Exchangeable{
    
    
    // Constructor
    public Mars(double totalFunds){
        
        this.totalFunds = totalFunds;
        this.currencyName = "MarsMoney";
        this.planet = "Mars";
    
        
    }
    
    
    // Converting to EarthDollars from Mars Money
    public double toEarthDollars(double amount) { 
        return amount / Currency.MM;
        
        
    }
    
    // Converting to Mars Money from Earth Dollars
    public double fromEarthDollars(double amount) {
        return amount * Currency.MM;
        
        
        
    }
    
   
}
