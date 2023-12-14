package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ordenadores.Ordenador;
import ordenadores.OrdenarPorContagem;
import ordenadores.OrdenarPorContagemSimples;
import ordenadores.OrdenarQuick;

public class AppTest {

    private OrdenarPorContagem c1;
    private OrdenarPorContagemSimples c2;
    private OrdenarQuick q;

    @Before
    public void setUp() throws Exception {
        c1 = new OrdenarPorContagem();
        c2 = new OrdenarPorContagemSimples();
        q = new OrdenarQuick();
    }

    @Test
    public void testContagemSimples() {
        //PRECISIONA IMPLEMENTAR NA AULA
        Ordenador o = c2;
        int[] array0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[] arrayOrdenado0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertTrue(Arrays.equals(arrayOrdenado0, array0));
        int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };
        int[] arrayOrdenado = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertTrue(Arrays.equals(arrayOrdenado, o.ordene(array)));
        int[] array2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arrayOrdenado2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(arrayOrdenado2, o.ordene(array2)));
        int[] array3 = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] arrayOrdenado3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(arrayOrdenado3, o.ordene(array3)));
        int[] array4 = { 0 };
        int[] arrayOrdenado4 = { 0 };
        //assertTrue(Arrays.equals(arrayOrdenado4, o.ordene(array4)));
        //int[] array5 = { 5, 3, 2, 4, 7, 2, 0, 7 };
        //int[] arrayOrdenado5 = { 0, 2, 2, 3, 4, 5, 7, 7 };
        // assertTrue(Arrays.equals(arrayOrdenado5, o.ordene(array5)));
    }

    @Test
    public void testContagem() {
        //PRECISIONA IMPLEMENTAR NA AULA
        Ordenador o = c1;
        int[] array0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[] arrayOrdenado0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertTrue(Arrays.equals(arrayOrdenado0, array0));
        int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };
        int[] arrayOrdenado = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertTrue(Arrays.equals(arrayOrdenado, o.ordene(array)));
        int[] array2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arrayOrdenado2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(arrayOrdenado2, o.ordene(array2)));
        int[] array3 = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] arrayOrdenado3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(arrayOrdenado3, o.ordene(array3)));
        int[] array4 = { 0 };
        int[] arrayOrdenado4 = { 0 };
        assertTrue(Arrays.equals(arrayOrdenado4, o.ordene(array4)));
        int[] array5 = { 5, 3, 2, 4, 7, 2, 0, 7 };
        int[] arrayOrdenado5 = { 0, 2, 2, 3, 4, 5, 7, 7 };
        assertTrue(Arrays.equals(arrayOrdenado5, o.ordene(array5)));
    }

    @Test
    public void testQuick() {
        //PRECISIONA IMPLEMENTAR NA AULA
        Ordenador o = q;
        int[] array0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[] arrayOrdenado0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertTrue(Arrays.equals(arrayOrdenado0, array0));
        int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };
        int[] arrayOrdenado = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertTrue(Arrays.equals(arrayOrdenado, o.ordene(array)));
        int[] array2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arrayOrdenado2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(arrayOrdenado2, o.ordene(array2)));
        int[] array3 = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] arrayOrdenado3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertTrue(Arrays.equals(arrayOrdenado3, o.ordene(array3)));
        int[] array4 = { 0 };
        int[] arrayOrdenado4 = { 0 };
        assertTrue(Arrays.equals(arrayOrdenado4, o.ordene(array4)));
        int[] array5 = { 5, 3, 2, 4, 7, 2, 0, 7 };
        int[] arrayOrdenado5 = { 0, 2, 2, 3, 4, 5, 7, 7 };
        assertTrue(Arrays.equals(arrayOrdenado5, o.ordene(array5)));
    }

    @Test
    public void testParticiona() {
        //PRECISIONA IMPLEMENTAR NA AULA
        int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };
        int[] arrayNovo = { 0, 3, 2, 4, 1, 5, 7, 6 };
        int index = q.quickParticio(array, 0, array.length - 1);
        //assertTrue(Arrays.equals(arrayNovo, array));
        assertEquals(5, index);
    }

}
