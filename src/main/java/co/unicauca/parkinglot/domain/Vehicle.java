
package co.unicauca.parkinglot.domain;

public class Vehicle {

    /**
     * Placa
     */
    private String plate;
    /**
     * Tipo: carro, moto, camion
     */
    private TypeEnum type;

    /**
     * Constructor parametrizado
     *
     * @param plate placa del vehiculo
     * @param tipo tipo de vehiculo
     */
    public Vehicle(String plate, TypeEnum type) {
        this.plate = plate;
        this.type = type;
    }

    public Vehicle() {
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "plate=" + plate + ", type=" + type + '}';
    }

}
