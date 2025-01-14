package artemis.ui;

public class Messages {
    /**
     * Banner for Artemis
     */
    public static void printBanner() {
        String logo = "  __ _ _ __| |_ ___ _ __ ___ (_)___" + System.lineSeparator() +
                " / _` | '__| __/ _ \\ '_ ` _ \\| / __|" + System.lineSeparator() +
                "| (_| | |  | ||  __/ | | | | | \\__ \\" + System.lineSeparator() +
                " \\__,_|_|   \\__\\___|_| |_| |_|_|___/" + System.lineSeparator();
        System.out.println("======================================" + System.lineSeparator());
        System.out.println(logo);
    }

    /**
     * Goodbye message
     */
    public static void printGoodbye() {
        System.out.println("======================================");
        System.out.println("goodbye! hope to see you again soon!");
        System.out.println("======================================");

    }

    /**
     * Prints the help message
     *
     * @param username The string of the username given
     */
    public static void printHelp(String username) {
        System.out.printf("welcome to your personal list, %s!%s", username, System.lineSeparator());
        System.out.println("usage: help");
        System.out.println("       todo [item]");
        System.out.println("       deadline [item] /by [due date]");
        System.out.println("       event [item] /from [start] /to [end]");
        System.out.println("       list");
        System.out.println("       mark/unmark [index]");
        System.out.println("       delete [index]");
        System.out.println("       find [keyword]");
        System.out.println("       save");
        System.out.println("       bye");
    }

}
