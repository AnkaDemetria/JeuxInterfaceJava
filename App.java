
import com.game.*;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        
        Jeu[] mesJeux = { 
            new Monopoly(),
            new TribialPoursuite(), 
            new TribialPoursuite(), 
            new TribialPoursuite(), 
            new TribialPoursuite()
        };

        
        CodeDeLaRoute codeDeLaRoute = new CodeDeLaRoute();

        mesJeux[0].game("Super Jeu Monopoly");
        // mesJeux[0].players("6");
        // mesJeux[0].win("100000 euros");
        
        // trivialPoursuit.game("TrivialPursuit");
        // trivialPoursuit1.game("TrivialPursuit");
        // trivialPoursuit2.game("TrivialPursuit");
        // trivialPoursuit3.game("TrivialPursuit");
        // trivialPoursuit.quiz("Superbe quiz");
        // trivialPoursuit.win("Bravo !");

        String message = "Dommage";
        String messageuh = "Ceci est un examen";
        codeDeLaRoute.win(message);
        codeDeLaRoute.quiz(messageuh);
    }
}