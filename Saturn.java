/**
 * Abhi Vachani
 * Oct 1 2021
 * Saturn Class
 **/


public class Saturn extends Currency implements Exchangeable {
    
    // Constructor
    public Saturn(double totalFunds){
        
        this.totalFunds = totalFunds;
        this.currencyName = "SaturnSilver";
        this.planet = "Saturn";   
        
    }
    
    
    
    // Converting to EarthDollars from Saturn Silver
    public double toEarthDollars(double amount) { 
        
        return amount / Currency.SS;
        
    }
    
    // Converting to Saturn Silver from Earth Dollars
    public double fromEarthDollars(double amount) {
        
        return amount * Currency.SS;
        
        
    }
    
    
    
    
    
}