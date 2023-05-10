package ua.Hillel.hometask08;

public class EnumLogger {
    private static final String AR = "\u001B[0m";
    private static final String BR = "\033[0;90m";//info
    private static final String RB = "\033[0;91m";//error
    private static final String GB = "\033[0;92m";//warn
    private static final String YB = "\033[0;93m";//debug

    public enum LogLevel {
        INFO,
        DEBUG,
        WARN,
        ERROR;
    }
    public void log(LogLevel level, String message){
        switch (level){
            case INFO -> System.out.println(BR + "[INFO]:" + AR + message);
            case WARN -> System.out.println(GB + "[WARN]:" + AR+ message);
            case DEBUG -> System.out.println(YB + "[DEBUG]:" + AR + message);
            case ERROR -> System.out.println(RB + "[ERROR]" + AR + message);
        }
    }
}
