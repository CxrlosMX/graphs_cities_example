/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos_menu;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author El Camaleon
 */
public class MapRepresentation {

    public static Graph getCities() {
        Graph graph = new Graph();
        Scanner sc = new Scanner(System.in);
        System.out.println("*-*-Bienvenido-*-*");
        System.out.println("¿Cuantos nodos desea ingresar?");
        int c = sc.nextInt();
        sc.nextLine();
        Node[] array = new Node[c];
        String nom;
        for (int i = 0; i < c; i++) {
            System.out.println("Introduce el nombre de la ciudad");
            nom = sc.nextLine();
            array[i] = new Node(nom);
        }
        //Ciclo
        boolean bandera = false;
        do {
            System.out.println("*-*-MENU-*-*");
            System.out.println("1.-Ingresar EDGE(Aristas)");
            System.out.println("2.-Salir");
            int d = sc.nextInt();

            switch (d) {
                case 1: {
                    System.out.println("Eligue que ciudad deseas ingresar la arista!!");
                    int a = 0;
                    for (Node i : array) {
                        System.out.println("[" + a + "]" + i);
                        a++;
                    }
                    int b = sc.nextInt();
                    System.out.println("Ingrese la distancia por favor");
                    int distancia = sc.nextInt();
                    System.out.println("Ingrese la ciudad que se une con la arista");
                    int arista = sc.nextInt();
                    for (int i = 0; i < 1; i++) {
                        array[b].addEdge(new Edge(array[b], array[arista], distancia));
                    }

                    break;
                }
                case 2: {
                    bandera = true;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "---***OPCION INVALIDA***---");
                    break;
                }
            }
        } while (bandera == false);
        for (Node j : array) {
            graph.addNode(j);
        }
        return graph;
    }

    public static void main(String[] args) {
        Graph graph = getCities();
        System.out.println(graph);
    }
}
