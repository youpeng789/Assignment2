////////////////////////////////////////////////////////////////////
// Youpeng Liu 2076428
// Álvaro Martín 2099592
////////////////////////////////////////////////////////////////////

/** implementare la funzione printAsciiArt */
/** Gestire un input non valido (diverso da un numero romano) */
public class RomanPrinter {
    
    /**Ad ogni posizione [n][] corrisponde una lettera in ASCIIART
     * I = 0; V = 1; X = 2; L = 3; C = 4; D = 5; M = 6;
     */


    private static final String[][] Lettere = {
            { "  _____ ", " |_   _|", "   | |  ", "   | |  ", "  _| |_ ", " |_____|" },
            { " __      __", " \\ \\    / /", "  \\ \\  / / ", "   \\ \\/ /  ", "    \\  /   ", "     \\/    " },
            { " __   __", " \\ \\ / /", "  \\ V / ", "   > <  ", "  / . \\ ", " /_/ \\_\\" },
            { "  _      ", " | |     ", " | |     ", " | |     ", " | |____ ", " |______|" },
            { "   _____ ", "  / ____|", " | |     ", " | |     ", " | |____ ", "  \\_____|" },
            { "  _____  ", " |  __ \\ ", " | |  | |", " | |  | |", " | |__| |", " |_____/ " },
            { "  __  __ ", " |  \\/  |", " | \\  / |", " | |\\/| |", " | |  | |", " |_|  |_|" } };

    /**
     * Inizializza un array StringBuilder
     */
    public static void initS(StringBuilder[] x) {
        for (int i = 0; i < 6; i++) {
            x[i] = new StringBuilder();
        }
    }

    /**
     * Aggiunge righe di una lettera ad un array StringBuilder
     */
    public static void addRighe(int nLettera, StringBuilder[] x) {
        for (int i = 0; i < 6; i++) {
            x[i].append(Lettere[nLettera][i]);
        }
    }

    /**
     * Inserisce la @lettera corretta all'interno di un array StringBuilder
     */
    public static void checkLetter(char lettera, StringBuilder[] risultato) {
        if (lettera == 'I') {
            addRighe(0, risultato);
        } else if (lettera == 'V') {
            addRighe(1, risultato);
        } else if (lettera == 'X') {
            addRighe(2, risultato);
        } else if (lettera == 'L') {
            addRighe(3, risultato);
        } else if (lettera == 'C') {
            addRighe(4, risultato);
        } else if (lettera == 'D') {
            addRighe(5, risultato);
        } else if (lettera == 'M') {
            addRighe(6, risultato);
        }
    }

    public static StringBuilder[] printAsciiArt(String numeroRomano) {
        StringBuilder[] risultato = new StringBuilder[6];
        RomanPrinter.initS(risultato);
        int lenRomano = numeroRomano.length();
        if (lenRomano > 0) {
            String simboli = "IVXLCMD";
            boolean validNumber = false;
            try {
                for (int i = 0; i < lenRomano; i++) {
                    validNumber = false;
                    for (int j = 0; j < 7; j++) {
                        if (numeroRomano.charAt(i) == simboli.charAt(j)) {
                            validNumber = true;
                        }
                    }
                    if (!validNumber) {
                        throw new Exception("Numero non Romano");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
                StringBuilder[] x = new StringBuilder[1];
                x[0] = new StringBuilder();
                x[0].append("Errore");
                return x;
            }
            char lettera = '0';
            for (int i = 0; i < lenRomano; i++) {
                lettera = numeroRomano.charAt(i);
                checkLetter(lettera, risultato);
            }
            return risultato;
        } else {
            System.out.println("Inserire un numero romano");
            return risultato;
        }
    }
}