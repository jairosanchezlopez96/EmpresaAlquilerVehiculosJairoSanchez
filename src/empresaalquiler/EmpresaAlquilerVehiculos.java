/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquiler;

/**
 *
 * @author jairo
 */
public class EmpresaAlquilerVehiculos {
    // Atributos de la empresa

    private String cif;
    private String nombre;
    private String paginaWeb;
    /* Atributos para controlar el total de clientes que tiene la
empresa y array de almacenamiento para los objetos Cliente */
    private int totalClientes;
    private Cliente[] clientes;
    /* Atributos para controlar el total de vehiculos disponibles en
alquiler que tiene la empresa y array de almacenamiento para los objetos
Vehiculo */
    private int totalVehiculos;
    private Vehiculo[] vehiculos;
    /* Atributos para controlar el histórico de alquileres: total de
alquileres realizados y array de almacenamiento para los objetos

8
VehiculoAlquilado */
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;
// se omiten los métodos ‘get’ y ‘set’ de la clase
/* Constructor parametrizado donde se establece que el total de clientes
será 50, igual que el total de vehiculos disponibles. El histórico de
vehiculos puede contener hasta 100 elementos */
    EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
// Incialmente no hay clientes creados en la empresa
        this.totalClientes = 0;
        this.clientes = new Cliente[50]; // apuntan a null
// Incialmente no hay vehiculos creados en la empresa
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50]; // apuntan a null
// Incialmente no hay histórico de alquileres en la empresa
        this.totalAlquileres = 0;
        this.alquileres = new VehiculoAlquilado[100]; // apuntan a null
    }
}
