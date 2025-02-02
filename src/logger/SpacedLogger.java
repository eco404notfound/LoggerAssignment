package logger;

public class SpacedLogger implements loginter {

    public void log(String message) {
        
        String spacedMessage = addSpaces(message);
        System.out.println(spacedMessage);
    }

    public void error(String message) {
       
        String spacedMessage = addSpaces(message);
        System.out.println("ERROR: " + spacedMessage);
    }

   
    private String addSpaces(String message) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            result += message.charAt(i) + " "; 
        }
        return result.trim(); 
    }
}
