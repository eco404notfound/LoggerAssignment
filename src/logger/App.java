

package logger;

public class App {
    public static void main(String[] args) {
     
        loginter asteriskLogger = new AsteriskLogger();

        loginter spacedLogger = new SpacedLogger();

       
        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        System.out.println("\nTesting SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}
