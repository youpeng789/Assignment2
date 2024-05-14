
////////////////////////////////////////////////////////////////////
// Youpeng Liu 2076428
// Álvaro Martín 2099592
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert1() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(1);
        // Assert
        assertEquals("I", roman);
    }

    @Test
    public void convert5() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(5);
        // Assert
        assertEquals("V", roman);
    }

    @Test
    public void convert10() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(10);
        // Assert
        assertEquals("X", roman);
    }

    @Test
    public void convert50() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(50);
        // Assert
        assertEquals("L", roman);
    }

    @Test
    public void convert100() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(100);
        // Assert
        assertEquals("C", roman);
    }

    @Test
    public void convert500() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(500);
        // Assert
        assertEquals("D", roman);
    }

    @Test
    public void convert1000() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(1000);
        // Assert
        assertEquals("M", roman);
    }

    @Test
    public void convert7() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(9);
        // Assert
        assertEquals("IIIX", roman);
    }

    @Test
    public void convert42() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(42);
        // Assert
        assertEquals("XLII", roman);
    }

    @Test
    public void convert67() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(69);
        // Assert
        assertEquals("LXIIIX", roman);
    }

    @Test
    public void convert423() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(420);
        // Assert
        assertEquals("CDXXIII", roman);
    }

    @Test
    public void convert999() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(999);
        // Assert
        assertEquals("CMXCIX", roman);
    }

    @Test
    public void convertTooLow() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(-1);
        // Assert
        assertEquals("Errore", roman);
    }

    @Test
    public void convertTooBig() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(1001);
        // Assert
        assertEquals("Errore", roman);
    }

    @Test
    public void convertZero() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(0);
        // Assert
        assertEquals("Errore", roman);
    }
}