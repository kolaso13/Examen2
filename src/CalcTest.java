import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CalcTest {


    @Test
    @DisplayName("Test del metodo1")
    public void test1() {
        // Preparación
        Calc c = new Calc();
        // Ejecución
        int result = c.deStringANumero("UnO");
        // Confirmación
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Test del metodo2")
    public void test2() {
        // Preparación
        Calc c = new Calc();
        // Ejecución
        List<Integer> result = c.f3(" UnO     dOs     CuaTrO     TreS");
        //Confirmación
        List<Integer> valoresEsperados = new ArrayList<Integer>(Arrays.asList(1,2,4,3));
        assertEquals(valoresEsperados, result);
    }

    @Test
    @DisplayName("Test del metodo3")
    public void test3() {
        // Preparación
        Calc c = new Calc();
        int[] array = new int[3];
        array[0]=6;
        array[1]=2;
        array[2]=1;
        double[] res = new double[3];
        res[0]=40;
        res[1]=13.33;
        res[2]=6.66;
        // Ejecución
		double[] result = c.regla3Array(array);
        // Confirmación
        assertEquals(res, result);
    }
}
