/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Sandra Martinez
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Sandra", 50000));
        empleados.add(new EmpleadoTemporal("Oscar", 120, 2000));
        empleados.add(new EmpleadoPlanta("Leandro", 60000));
        empleados.add(new EmpleadoTemporal("María", 80, 2500));

        for (Empleado e : empleados) {
            e.mostrarSueldo();

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
            System.out.println("--------------------");
        }
    }
}