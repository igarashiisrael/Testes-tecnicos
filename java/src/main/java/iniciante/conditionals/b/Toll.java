package iniciante.conditionals.b;

public class Toll {
    public double calculateTollPayment(Vehicle vehicle) {
        // TODO
        if (vehicle.isOfficial() == true || vehicle.getNumberOfWheels() <= 2) {
            return 0;
        } else if (vehicle.getNumberOfWheels() <= 6) {
            return vehicle.getNumberOfWheels() * 1.30;
        } else if (vehicle.getNumberOfWheels() > 7){
            return 10.0;
        } else {
            return -1.00;
        }
    }
}

/*
Toll é um pedágio.

# Problema:

Dado um veículo, retorne o valor à ser pago no pedágio.
Regras:
- Veículos com 2 rodas não pagam pedágio.
- Veículos de 4 rodas pagam R$5,20.
- Veículos de 6 ou mais rodas pagam R$2,60 a cada 2 rodas, limitado à R$10,00.
- Veículo oficiais não pagam pedágio, independente da quantidade de rodas.


# Dicas:

Analise a classe Vehicle. Os atributos da classe irão auxiliar
nas tomadas de decisão.

# Exemplos
Um  veículo não-oficial com 4 rodas retorna 5.20.
*/