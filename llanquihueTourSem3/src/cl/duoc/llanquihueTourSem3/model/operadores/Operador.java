package cl.duoc.llanquihueTourSem3.model.operadores;

import cl.duoc.llanquihueTourSem3.exepciones.NombreInvalidoException;
import cl.duoc.llanquihueTourSem3.exepciones.ServicioInvalidoException;

/*
La clase operador se usa para las empersas que prestan servicios a LLanquihue Tour
por lo que recibe un nombre y tipo de servicio donde ninguno de estos campos puede ir vacío,
esto se hace usando el .isEmpty en los if.
 */

public class Operador {
    private String nombre;
    private String tipoServicio;

    public Operador(String nombre, String tipoServicio) throws NombreInvalidoException, ServicioInvalidoException {
        if(nombre.isEmpty()){
            throw new NombreInvalidoException("El nombre del operador no puede ir vacío.");
        }
        if(tipoServicio.isEmpty()){
            throw new ServicioInvalidoException("El tipo de servicio no puede estar vacío.");
        }

        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    /*
    Se usa el toString para mostrar los valores de la clase operador
    También se le da estilo para que se imprima de acuerdo a lo solicitado.
     */

    @Override
    public String toString() {
        return "Operador: " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Tipo de Servicio: " + tipoServicio;
    }
}
