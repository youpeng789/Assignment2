////////////////////////////////////////////////////////////////////
// Youpeng Liu 2076428
// Álvaro Martín 2099592
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/** Creare la classe IntegerToRoman e definire la funzione convert*/
/** implementare la funzione convert */
/** Gestire un input non valido (<1 e >1000) */
public class IntegerToRoman {
    private static final int[] ArrayNum = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] ArraySimb = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
            "I" };
    public static String convert(int numero) {
        try {
            if (numero < 1) {
                throw new Exception("Numero troppo piccolo < 1");
            }
            if (numero > 1000) {
                throw new Exception("Numero troppo grande > 1000");
            }
        } catch (Exception e) {
            System.out.println(e);
            return "Errore";
        }
        StringBuilder risult = new StringBuilder();
        for (int i = 0; i < ArrayNum.length; i++) {
            while (numero >= ArrayNum[i]) {
                risult.append(ArraySimb[i]);
                numero -= ArrayNum[i];
            }
        }
        return risult.toString();
    }
}