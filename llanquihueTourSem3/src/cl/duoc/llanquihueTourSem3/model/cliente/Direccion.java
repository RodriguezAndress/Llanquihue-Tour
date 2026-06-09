package cl.duoc.llanquihueTourSem3.model.cliente;

//Clase creada para registrar la dirección del cliente.
public class Direccion {
    private String calle;
    private String comuna;

    public Direccion(String calle, String comuna) {
        this.calle = calle;
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public String getComuna() {
        return comuna;
    }

    @Override
    public String toString() {
        return "Direccion: " +
                  calle +
                ", " + comuna;
    }
}
