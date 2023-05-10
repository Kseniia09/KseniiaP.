package ua.Hillel.hometask08;

public class EnumLogger {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String BLACK_BRIGHT = "\033[0;90m";//info
    private static final String RED_BRIGHT = "\033[0;91m";//error
    private static final String GREEN_BRIGHT = "\033[0;92m";//warn
    private static final String YELLOW_BRIGHT = "\033[0;93m";//debug

    public enum LogLevel {
        INFO,
        DEBUG,
        WARN,
        ERROR;
    }
    public void log(LogLevel level, String message){
        switch (level){
            case INFO -> System.out.println(BLACK_BRIGHT + "[INFO]:" + ANSI_RESET + message);
            case WARN -> System.out.println(GREEN_BRIGHT + "[WARN]:" + ANSI_RESET + message);
            case DEBUG -> System.out.println(YELLOW_BRIGHT + "[DEBUG]:" + ANSI_RESET + message);
            case ERROR -> System.out.println(RED_BRIGHT + "[ERROR]" + ANSI_RESET + message);
        }
    }
}
