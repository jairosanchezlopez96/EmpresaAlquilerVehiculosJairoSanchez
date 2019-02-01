/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaalquiler;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 *
 * @author jairo
 */
public class VehiculoAlquilado {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate diaAlquiler;
    private Month mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate diaAlquiler, Month mesAlquiler, int añoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", a\u00f1oAlquiler=" + añoAlquiler + ", totalDiasAlquiler=" + totalDiasAlquiler + '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(LocalDate diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public Month getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(Month mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAñoAlquiler() {
        return añoAlquiler;
    }

    public void setAñoAlquiler(int añoAlquiler) {
        this.añoAlquiler = añoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

}