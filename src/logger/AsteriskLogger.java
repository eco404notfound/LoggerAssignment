package logger;

public class AsteriskLogger implements loginter {

    
    public void log(String message) {
       
        System.out.println("***" + message + "***");
    }

    
    public void error(String message) {
      
        System.out.println("**********************");
        System.out.println("*** ERROR: " + message + " ***");
        System.out.println("**********************");
    }
}