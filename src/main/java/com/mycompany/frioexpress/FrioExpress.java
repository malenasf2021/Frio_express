/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.frioexpress;

import java.util.Scanner;
import modelo.Producto;
import controlador.ProductoControlador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class FrioExpress {

    static Scanner sc = new Scanner(System.in);
    private static ProductoControlador controladorProd = new ProductoControlador();

    public static void main(String[] args) {
        // Productos hardcodeados
        Producto p1 = new Producto(101, "Leche entera", "Lácteos", 4, 50, 10, 35, 30);
        Producto p2 = new Producto(102, "Yogur frutilla", "Lácteos", 5, 80, 15, 40, 20);
        Producto p3 = new Producto(103, "Carne vacuna", "Carnes", -2, 40, 5, 220, 15);
        Producto p4 = new Producto(104, "Helado vainilla", "Congelados", -18, 25, 5, 150, 45);
        Producto p5 = new Producto(105, "Queso mozzarella", "Lácteos", 6, 60, 12, 120, 35);

        // Agregarlos al controlador
        controladorProd.agregarProducto(p1);
        controladorProd.agregarProducto(p2);
        controladorProd.agregarProducto(p3);
        controladorProd.agregarProducto(p4);
        controladorProd.agregarProducto(p5);

        System.out.println("1. Agregar producto ");

        System.out.println("2. Alerta de productoss que rompieron la cadena de frio ");

        System.out.print("Opcion:  ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                ingresarProducto();
                break;
            case 2:
                alertaCadenadeFrio();
                break;
        }
    }

    private static void alertaCadenadeFrio() {
        List<Producto> colProductos = new ArrayList<>();
        colProductos = controladorProd.RompeCadenaFrio();
        for (Producto unProducto : colProductos) {
            System.out.println("Codigo: " + unProducto.getCodigo()
                    + ", Nombre: " + unProducto.getNombre()
                    + " Temperatura: " + unProducto.getTemperatura()
                    + " Minutoss fuera de frio: " + unProducto.getMinutos());

        }
    }

    private static void ingresarProducto() {
        try {
            System.out.println("Codigo del proucto: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            System.out.println("Nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.println("Categoria del proucto: ");
            String categoria = sc.nextLine();
            System.out.println("Stock del producto: ");
            float stock = sc.nextFloat();
            sc.nextLine();
            System.out.println("Stock minimo del producto: ");
            float stock_minimo = sc.nextFloat();
            System.out.println("Temperatura del producto: ");
            float temperatura = sc.nextInt();
            sc.nextLine();
            System.out.println("Precio minimo del producto: ");
            float precio = sc.nextInt();
            sc.nextLine();
            System.out.println("Minutos ded corte dde cadena e frio del producto: ");
            int minutos = sc.nextInt();
            sc.nextLine();
            Producto unProducto = new Producto(codigo, nombre, categoria, temperatura, stock, stock_minimo, precio, minutos);
            controladorProd.agregarProducto(unProducto);
        } catch (Exception e) {
            System.out.println("EERROR " + e);

        }

    }
}
