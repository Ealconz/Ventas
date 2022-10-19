/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import dominio.Orden;
import dominio.Producto;
import java.util.Scanner;
/**
 *
 * @author elias
 */

public class VentasTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio Ventas");
        System.out.println("");
        System.out.println("==========================");
        System.out.println("");
        Orden orden = new Orden();
        Producto p1 = new Producto(10,"Zanahorias",9.99);
        Producto p2 = new Producto(253,"Macarrones",449.99);
        Producto p3 = new Producto(666,"Choclo",1.99);
        Producto p4 = new Producto(13,"Milanesa",99.99);
        System.out.println("Introduzca la id del producto:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Añada el nombre del producto: ");
        String nombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Añada el precio del producto: ");
        Double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca la id del segundo producto");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el nombre del segundo producto: ");
        String nombre2 = sc.nextLine();
        sc.nextLine();
        System.out.println("Añada el precio del segundo producto: ");
        Double precio2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("");
        Producto p5 = new Producto(id,nombre,precio);
        Producto p6 = new Producto(id2,nombre2,precio2);
        orden.agregarProducto(p1);
        orden.agregarProducto(p2);
        orden.agregarProducto(p3);
        orden.agregarProducto(p4);
        orden.agregarProducto(p5);
        orden.agregarProducto(p6);
        System.out.println("Productos: ");
        System.out.println("=========================================================================");
        orden.mostrarOrden();
        System.out.println("=========================================================================");
        System.out.println("");
        System.out.println("El precio total de todos los produztos es: ");
        orden.calcularTotal();
    }
}
