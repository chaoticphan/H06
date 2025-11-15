package h06;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        // TODO H6.6 Spielwiese
    }

    /**
     * @return an example TokenDirectory that maps the placeholders used in {@link Main#exampleMessageReceiver}
     * to example values
     */
    @DoNotTouch
    private static TokenDictionary exampleTokenDirectory() {
        TokenDictionary dictionary = new TokenDictionary();
        dictionary.putToken("name", "Max Mustermann");
        dictionary.putToken("date", "26/06/2025");
        dictionary.putToken("animal", "Hund");
        dictionary.putToken("university", "TU Darmstadt");

        return dictionary;
    }

    /**
     * @return an example MessageReceiver that provides messages containing common placeholders such as name and date
     */
    @DoNotTouch
    private static MessageReceiver exampleMessageReceiver() {
        MessageReceiver receiver = new MessageReceiver();
        receiver.addMessage("Hello <name>, how are you doing");
        receiver.addMessage("<date> was a wild day");
        receiver.addMessage("Ich habe das an der <university> gelernt");

        return receiver;
    }
}
