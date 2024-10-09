/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.HashMap;
import java.util.Scanner;

public class javaapplication3 {
    private static HashMap<String, Double> productos = new HashMap<>();

    private static void eliminarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();
        if (productos.remove(nombre) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
     private static void modificarPrecio(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = scanner.nextDouble();
            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio modificado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
private static void anadirProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        productos.put(nombre, precio);
        System.out.println("Producto añadido.");
    }

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n Opciones ");
            System.out.println("1. Anadir producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Exit");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    anadirProducto(scanner);
                    break;
                case 2:
                    modificarPrecio(scanner);
                    break;
                case 3:
                    eliminarProducto(scanner);
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Exit..");
                    break;
                default:
                    System.out.println("Opcion no valida, Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}