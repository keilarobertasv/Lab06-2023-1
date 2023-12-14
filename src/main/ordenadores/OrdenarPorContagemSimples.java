package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        if (array == null || array.length <= 1) {
            return array; 
        }

        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        int[] contagem = new int[maximo + 1];

        for (int elemento : array) {
            contagem[elemento]++;
        }

        int indice = 0;
        for (int i = 0; i < contagem.length; i++) {
            while (contagem[i] > 0) {
                array[indice++] = i;
                contagem[i]--;
            }
        }

        return array;
    }
}
