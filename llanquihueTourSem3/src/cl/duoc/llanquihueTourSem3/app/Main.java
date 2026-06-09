package cl.duoc.llanquihueTourSem3.app;

import cl.duoc.llanquihueTourSem3.model.cliente.Cliente;
import cl.duoc.llanquihueTourSem3.model.cliente.Direccion;
import cl.duoc.llanquihueTourSem3.model.empleados.Empleado;
import cl.duoc.llanquihueTourSem3.model.operadores.Operador;

public class Main {
    public static void main (String [] args){
        Direccion direccion = new Direccion("Moneda 31", "Santiago");
        try {
            Cliente cliente = new Cliente("Juan Landaeta", direccion);
            cliente.Mostarcliente();

            System.out.println("\n");

            Empleado empleado = new Empleado("Elisa Parra", "Buceo");
            System.out.println(empleado.toString());

            System.out.println("\n");

            Operador operador = new Operador("ChocoCream","Postres");
            System.out.println(operador.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}