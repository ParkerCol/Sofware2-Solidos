package co.unicauca.parkinglot.domain;


public class CarParkingCost extends IParkingCost {

    /**
     *
     * Se calcula la tarifa de los Carros
     *
     * @param minutos
     * @return 
     */
    @Override
    public int calculateCost(int minutos) {
        tarifa = 4000;
        if (minutos < 60) {
            return 2000;
        }
        else
        {
            tarifa += (minutos - 60) * (50/1.5);
            tarifa = redondear(tarifa);
        }

        return tarifa;
    }
}
