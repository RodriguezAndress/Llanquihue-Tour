package cl.duoc.llanquihueTourSem3.model.cliente;

import cl.duoc.llanquihueTourSem3.exepciones.NombreInvalidoException;

/**Clase captura solo el nombre del cliente, además usa la exception para confirmar
que el nombre no vaya vacío y que sea mayor a tres caracteres, obligando asi a usar nombre
conmpleto o agregar el apellido.**/
//Esta clase recibe como parametro la clase de direccion
public class Cliente {
    private String nombre;
    private Direccion direccion;

    public Cliente(String nombre, Direccion direccion) throws NombreInvalidoException {

        if(nombre != null && nombre.length() <= 3){
            throw new NombreInvalidoException("El nombre del cliente debe tener más de tres caracteres.");
        }
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Mostarcliente(){
        System.out.println("Cliente: ");
        System.out.println("Nombre: "+ nombre);
        System.out.println(direccion);
    }

}
