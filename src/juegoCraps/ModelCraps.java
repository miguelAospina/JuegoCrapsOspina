package juegoCraps;

import java.util.Random;

/**
 * Class dado generate a Random value between 1 and 6
 * @author Miguel Ospina
 * @version 1.0.0 date 04/12/2021
 */

public class ModelCraps {
    private int cara;

    /**
     * Method that generate a random value to cara
     * @return number between (1,6)
     */

    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
