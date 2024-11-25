/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cerchio;

/**
 *
 * @author moham
 */
public class Cerchio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class Cerchio {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}

