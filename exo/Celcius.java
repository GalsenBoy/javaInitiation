package exo;

public class Celcius {

    /**
     * @function
     * @paras {integer} celciusValue
     * @return La valeur en Fahrenheit
     *         La fonction convertit la valeur de Celcius en Fahrenheit
     */
    static double celciusTemp(int celciusValue) {
        return ((1.8 * celciusValue) + 32);
    }

    public static void main(String[] args) {
        System.out.println(celciusTemp(12));
    }
}
