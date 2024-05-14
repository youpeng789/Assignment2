
////////////////////////////////////////////////////////////////////
// Youpeng Liu 2076428
// Álvaro Martín 2099592
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    
    @Test
    public void printI() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append("  _____ ");
        expected[1].append(" |_   _|");
        expected[2].append("   | |  ");
        expected[3].append("   | |  ");
        expected[4].append("  _| |_ ");
        expected[5].append(" |_____|");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("I");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void printV() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append(" __      __");
        expected[1].append(" \\ \\    / /");
        expected[2].append("  \\ \\  / / ");
        expected[3].append("   \\ \\/ /  ");
        expected[4].append("    \\  /   ");
        expected[5].append("     \\/    ");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("V");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void printX() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append(" __   __");
        expected[1].append(" \\ \\ / /");
        expected[2].append("  \\ V / ");
        expected[3].append("   > <  ");
        expected[4].append("  / . \\ ");
        expected[5].append(" /_/ \\_\\");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("X");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    public void printL() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append("  _      ");
        expected[1].append(" | |     ");
        expected[2].append(" | |     ");
        expected[3].append(" | |     ");
        expected[4].append(" | |____ ");
        expected[5].append(" |______|");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("L");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void printC() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append("   _____ ");
        expected[1].append("  / ____|");
        expected[2].append(" | |     ");
        expected[3].append(" | |     ");
        expected[4].append(" | |____ ");
        expected[5].append("  \\_____|");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("C");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void printD() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append("  _____  ");
        expected[1].append(" |  __ \\ ");
        expected[2].append(" | |  | |");
        expected[3].append(" | |  | |");
        expected[4].append(" | |__| |");
        expected[5].append(" |_____/ ");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("D");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void printM() {
        // Arrange

        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append("  __  __ ");
        expected[1].append(" |  \\/  |");
        expected[2].append(" | \\  / |");
        expected[3].append(" | |\\/| |");
        expected[4].append(" | |  | |");
        expected[5].append(" |_|  |_|");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("M");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void printIV() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append("  _____  __      __");
        expected[1].append(" |_   _| \\ \\    / /");
        expected[2].append("   | |    \\ \\  / / ");
        expected[3].append("   | |     \\ \\/ /  ");
        expected[4].append("  _| |_     \\  /   ");
        expected[5].append(" |_____|     \\/    ");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("IV");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void printLXIX() {
        // Arrange
        StringBuilder[] expected = new StringBuilder[6];
        RomanPrinter.initS(expected);
        expected[0].append("  _       __   __  _____  __   __");
        expected[1].append(" | |      \\ \\ / / |_   _| \\ \\ / /");
        expected[2].append(" | |       \\ V /    | |    \\ V / ");
        expected[3].append(" | |        > <     | |     > <  ");
        expected[4].append(" | |____   / . \\   _| |_   / . \\ ");
        expected[5].append(" |______| /_/ \\_\\ |_____| /_/ \\_\\");
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt("LXIX");
        // Assert
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i].toString(), printed[i].toString());
        }
    }

    @Test
    public void notRomanNumber() {
        // Arrange
        String notRomanNumber = "AIV";
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt(notRomanNumber);
        // Assert
        assertEquals("Errore", printed[0].toString());
    }

    @Test
    public void emptyNumber() {
        // Arrange
        String emptyNumber = "";
        StringBuilder[] printed = new StringBuilder[6];
        // Act
        printed = RomanPrinter.printAsciiArt(emptyNumber);
        // Assert
        assertEquals("", printed[0].toString());
    }
}
