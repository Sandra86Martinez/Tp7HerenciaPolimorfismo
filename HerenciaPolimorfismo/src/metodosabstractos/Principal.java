/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosabstractos;

/**
 *
 * @author Sandra Martinez
 */
public class Principal {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(3);
        figuras[1] = new Rectangulo(4.0, 5.0);
 
        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}