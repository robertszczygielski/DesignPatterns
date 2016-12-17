package org.loggers.interfaces;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
public interface LoggerChain {
    enum LogScope {
        ERROR(1, "Error: "),
        WARNING(2, "Warning: "),
        INFO(3, "Info: "),
        ;
        private int value;
        private String type;

        LogScope(int value, String type) {
            this.value = value;
            this.type = type;
        }

        public int getValue() {
            return value;
        }

        public String getType() {
            return type;
        }
    }

    void setLog(LogScope error, String myLog);
    String getLog();
}
