package h06;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A smartphone with an electric battery
 */
public class Smartphone {

    @DoNotTouch
    private final TokenDictionary tokenDictionary;
    @DoNotTouch
    private final MessageReceiver messageReceiver;

    /**
     * Creates a new Smartphone
     *
     * @param tokenDictionary a dictionary to translate tokens
     * @param messageReceiver a receiver to receive messages from
     */
    @DoNotTouch
    public Smartphone(TokenDictionary tokenDictionary, MessageReceiver messageReceiver) {
        this.tokenDictionary = tokenDictionary;
        this.messageReceiver = messageReceiver;
    }

    /**
     * replaces a token within a message
     * with a string specified in the {@link Smartphone#tokenDictionary}
     *
     * @param template a string which contains a token
     * @return the message generated from the template
     */
    @StudentImplementationRequired("H6.4.2")
    public String replaceToken(String template) {
        // TODO H6.4.2
        return crash("H6.4.2");
    }

}
