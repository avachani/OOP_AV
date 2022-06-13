/**
 * Abhi Vachani
 * Oct 1 2021
 * Exchangeable Interface
 **/

public interface Exchangeable {
    
    // static doubles representing conversion rates betewen planets
    static double ED = 1.00;
    static double MM = 1.30;
    static double SS = 0.87;
    static double NN = 2.00;
    
    // Exchange method, modified signature according to what Prof. Korth said was acceptable
    public void exchange(Currency other, double amount);
    

        
    
    
}

