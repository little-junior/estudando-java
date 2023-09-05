public class LogLevels {

    public static String message(String logLine) {
        String logLineNoWhiteSpace = logLine.trim();
        String[] splitedMessage = logLineNoWhiteSpace.split(":");
        String wantedMessage = splitedMessage[1];

        throw new UnsupportedOperationException(wantedMessage);
    }

    public static String logLevel(String logLine) {
        String logLineLevel = "";

        if (logLine.contains("[ERROR]")){
            logLineLevel = "error";
        }

        if (logLine.contains("[INFO]")){
            logLineLevel = "info";
        }

        if (logLine.contains("[WARNING]")){
            logLineLevel = "warning";
        }
        throw new UnsupportedOperationException(logLineLevel);
    }

    public static String reformat(String logLine) {
        String logLineNoWhiteSpace = logLine.trim();
        String[] splitedMessage = logLineNoWhiteSpace.split(":");
        String wantedMessage = splitedMessage[1];
        String logLineLevel = "";

        if (logLine.contains("[ERROR]")){
            logLineLevel = "(error)";
        }

        if (logLine.contains("[INFO]")){
            logLineLevel = "(info)";
        }

        if (logLine.contains("[WARNING]")){
            logLineLevel = "(warning)";
        }
        throw new UnsupportedOperationException(wantedMessage + logLineLevel);
    }

    public static void main(String[] args) {
        String frase = "Timezone not set";
        String frasezoada = "[WARNING]:   \tTimezone not set  \r\n";

        String[] splitedMessage = frasezoada.split(":");
        String wantedMessage = splitedMessage[1];
        String wantedMessageFormatted = wantedMessage.trim();

        System.out.println(wantedMessageFormatted);
        System.out.println(frase);
        System.out.println(wantedMessageFormatted.equals(frase));
    }
}
