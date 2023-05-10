package ua.Hillel.hometask08;

public class PropLogger {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String BLACK_BRIGHT = "\033[0;90m";//info
    private static final String RED_BRIGHT = "\033[0;91m";//error
    private static final String GREEN_BRIGHT = "\033[0;92m";//warn
    private static final String YELLOW_BRIGHT = "\033[0;93m";//debug

    public static void info(String message) {
        printMessage(BLACK_BRIGHT, "INFO", message);
    }

    public static void debug(String message) {
        printMessage(YELLOW_BRIGHT, "DEBUG", message);
    }

    public static void warn(String message) {
        printMessage(GREEN_BRIGHT, "WARN", message);
    }

    public static void error(String message) {
        printMessage(RED_BRIGHT, "ERROR", message);

    }

    private static void printMessage(String color, String type,String message){
        System.out.println(color + "["+ type + "]:" + ANSI_RESET + message);
    }

}





