/**
 * Abhi Vachani
 * Oct 1 2021
 * Prof. Korth Data Structures
 * HW 1 OOP Review
 * Currency Conversion Between 3 Planets
 * Note: 
 * Spoke to Tobias Matejovsky (Recitation Leader) about implementation of Exchange Method in Currency Class
 */


// Currency Abstract Class

public abstract class Currency implements Exchangeable {
    
    
    // Main 
    public static void main(String[] args) {
        
        
        Currency mars = new Mars(100.00);
        Currency neptune = new Neptune(100.00);
        Currency saturn = new Saturn(100.00);
        
        System.out.println("<-- Exchanges -->");
        
        mars.exchange(saturn, 25.0);
        neptune.exchange(saturn, 10.0);
        saturn.exchange(mars, 122.0);
        saturn.exchange(mars, 121.0);
        
        
    }
    
    // Data Members
    protected String currencyName;
    protected String planet;
    protected double totalFunds;
    
    
  
        
    
    
    // Abstract Methods to convert to and from earthDollars
    public abstract double toEarthDollars(double amount);
    public abstract double fromEarthDollars(double amount);
    
    
    
    /** 
     * Implementation of exchange in Currency class because 
     * it is applicable for Mars, Neptune, and Saturn
    **/
    public void exchange(Currency other, double amount) {
        
        // Checks if balance is not sufficient to transfer
        if (amount > totalFunds) {
            System.out.println("Uh Oh - " + planet + " only has an available balance of $" + Math.round(totalFunds * 100.0) / 100.0 + ", which is less than $" + amount + "!");
            System.out.println();
        }
        
        
        else {
            
            
            // Converting between planets, using to/from EarthDollars
            double earth = toEarthDollars(amount);
            
            double otherAmount = other.fromEarthDollars(earth);
            
           
            totalFunds = totalFunds - amount;
            
            other.totalFunds += otherAmount;
            
            
            System.out.println("Converting from " + currencyName + " to " + other.currencyName + " and initiating transfer ... ");
            
            // Rounding
            double roundAmount = Math.round(amount * 100.0) / 100.0;
            double roundTotalFunds = Math.round(totalFunds * 100.0) / 100.0;
            double roundOtherTotalFunds = Math.round(other.totalFunds * 100.0) / 100.0;
            double roundOtherAmount = Math.round(other.fromEarthDollars(earth) * 100.0) / 100.0;
            double roundEarth = Math.round(toEarthDollars(amount) * 100.0) / 100.0;
            
            // Printing results
            System.out.println("$" + roundAmount + " " + currencyName + " = $" + roundEarth + " EarthDollars" +  " = $" + roundOtherAmount + " " + other.currencyName);
            System.out.println(planet + " has a total of $" + roundTotalFunds + " " + currencyName);
            System.out.println(other.planet + " has a total of $" + roundOtherTotalFunds + " " + other.currencyName);
            System.out.println();
        
        }
        
        
        
      
        
        
    }
    
    
}
