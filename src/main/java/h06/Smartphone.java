package h06;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A smartphone with an electric battery
 */
public class Smartphone implements ElectricallyPowered {

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
        int firstIdx = template.indexOf('<');
        int secondIdx = template.indexOf('>');
        String token = template.substring(firstIdx , secondIdx+1);
        String replacement = tokenDictionary.lookup(token);
        return template.replace(token, replacement);
    }

    @Override
    public void use(int duration) {
        for(int i = 1; i<=duration; i++){
            String currMessage = messageReceiver.nextMessage();
            System.out.println(replaceToken(currMessage));
        }
    }

    @Override
    public PlugType getSupportedPlugType() {
        return PlugType.USB;
    }
}
