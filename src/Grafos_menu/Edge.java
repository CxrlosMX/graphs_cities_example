/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos_menu;

/**
 *
 * @author El Camaleon
 */
public class Edge {
    private Node origin;
    private Node destination;
    private double distance;
 
    public Edge(Node origin, Node destination, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }
 
    public Node getOrigin() {
        return origin;
    }
 
    public void setOrigin(Node origin) {
        this.origin = origin;
    }
 
    public Node getDestination() {
        return destination;
    }
 
    public void setDestination(Node destination) {
        this.destination = destination;
    }
 
    public double getDistance() {
        return distance;
    }
 
    public void setDistance(double distance) {
        this.distance = distance;
    }
 
    @Override
    public String toString() {
        return "\n Edge [origin=" + origin.getCity() + ", destination=" + destination.getCity() + ", distance="
                + distance + "]";
    }
 
}


