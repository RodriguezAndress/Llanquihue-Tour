package cl.duoc.llanquihueTourSem3.model.empleados;

import cl.duoc.llanquihueTourSem3.exepciones.EspecialidadInvalidaException;
import cl.duoc.llanquihueTourSem3.exepciones.NombreInvalidoException;

/* En esat clase se recogen los datos de los empleados, solicitando
nombre y especialidad en la que trabajan, se usan también las exceptions para
evitar que vayan vacios los campor de nombre y especialidad, además que se pide que el nombre tenga
más de tres caracteres al igual que con la clase de cliente.
 */
public class Empleado {
    private String nombre;
    private String areaEspecialidad;

    public Empleado(String nombre, String areaEspecialidad) throws NombreInvalidoException, EspecialidadInvalidaException {

        if(nombre != null && nombre.length() <= 3){
            throw new NombreInvalidoException("El nombre del empleado debe tener más de tres caracteres.");
        }else if(areaEspecialidad.isEmpty()){
            throw new EspecialidadInvalidaException("El area de especialidad no puede estar vacía.");
        }

        this.nombre = nombre;
        this.areaEspecialidad = areaEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaEspecialidad() {
        return areaEspecialidad;
    }

    public void setAreaEspecialidad(String areaEspecialidad) {
        this.areaEspecialidad = areaEspecialidad;
    }

    @Override
    public String toString() {
        return "Colaborador: " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Especialidad: " + areaEspecialidad;
    }
}
