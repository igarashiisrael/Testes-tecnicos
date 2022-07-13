package iniciante.loops.a;

import java.util.List;

public class IncreasingLoop {
    public Integer sumItems(List<Integer> items) {
        // TODO
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            do {sum += items.get(i);
            return sum; } while (i<=10);
            }

        return -1;
    }
}

/*
# Problema:

Retorne a soma de todos os números maiores que '10' da lista 'items'.

# Dicas:

Será preciso realizar um loop sobre a lista, utilizando a notação
for (int i = 0; i < items.size(); i++) { ... }
ou
for (int i : items) { ... }

# Exemplos
Items [0, 5, 10, 15, 20] retorna 45, pois é a soma de 10, 15 e 20.
 */