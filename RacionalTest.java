import static org.junit.Assert.*;
import org.junit.Test;

public class RacionalTest {

 
    public void testConstrutor() {
        Racional r = new Racional(1, 2);
        assertEquals("1/2", r.toString());
    }


    public void testConstrutorDenominadorZero() {
        new Racional(1, 0);
    }

   
    public void testSomar() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 3);
        Racional resultado = r1.somar(r2);
        assertEquals("5/6", resultado.toString());
    }

    
    public void testSubtrair() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 3);
        Racional resultado = r1.subtrair(r2);
        assertEquals("1/6", resultado.toString());
    }


    public void testMultiplicar() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 3);
        Racional resultado = r1.multiplicar(r2);
        assertEquals("1/6", resultado.toString());
    }

    
    public void testDividir() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 3);
        Racional resultado = r1.dividir(r2);
        assertEquals("3/2", resultado.toString());
    }

 
    public void testDividirPorZero() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(0, 1);
        r1.dividir(r2);
    }

    
    public void testValorReal() {
        Racional r = new Racional(1, 2);
        assertEquals(0.5, r.valorReal(), 0.0001);
    }

    
    public void testIgualA() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(2, 4);
        assertTrue(r1.igual_a(r2));
    }

  
    public void testMenorQue() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(2, 3);
        assertTrue(r1.menor_que(r2));
    }
}
