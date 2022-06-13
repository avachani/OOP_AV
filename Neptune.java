/**
 * Abhi Vachani
 * Oct 1 2021
 * Neptune Class
 **/

public class Neptune extends Currency implements Exchangeable{
    
    // Constructor
    public Neptune(double totalFunds){
        
        this.totalFunds = totalFunds;
        this.currencyName = "NeptuneNuggets";
        this.planet = "Neptune";
      
        
    }
    
    
    // Converting to EarthDollars from NeptuneNuggets
    public double toEarthDollars(double amount) { 
        return amount / Currency.NN;
        
    }
    
    // Converting to NeptuneNuggets from Earth Dollars
    public double fromEarthDollars(double amount) {
        return amount * Currency.NN;
        
       
        
        
    }
  
}
        
    
    
