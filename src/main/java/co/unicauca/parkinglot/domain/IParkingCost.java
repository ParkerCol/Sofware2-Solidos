
package co.unicauca.parkinglot.domain;


public abstract class IParkingCost {

    protected int tarifa;

    protected int redondear(int valor) {
        int residuo = valor % 100;
        if (residuo != 0) {
            valor += 100 - residuo;
        }
        return valor;
    }

    abstract public int calculateCost(int minutos);
}
