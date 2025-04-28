import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(4, 5);
        assertEquals(20, resultado);
    }
}
