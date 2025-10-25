/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrescrito;

import java.util.ArrayList;

/**
 *
 * @author Sandra Martinez
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Mike"));
        animales.add(new Gato("Rafael"));
        animales.add(new Vaca("Mora"));

        for (Animal a : animales) {
            a.hacerSonido();
            a.describirAnimal();
            System.out.println("--------------------");
        }
    }
}