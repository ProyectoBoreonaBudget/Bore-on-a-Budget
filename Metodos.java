/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosemestral;

import java.util.Scanner;

/**
 *
 * @author Matías
 */
public class Metodos {
    // método menu, contiene las distintas categorías y los métodos que se usan para cada una de estas.
    public void menu() {
        Scanner lectura = new Scanner(System.in);
        int opc;
        double din;
        System.out.println("Ingrese dinero disponible");
        din = lectura.nextDouble();
        do {
            do {
                System.out.println("1.- IR AL CINE");
                System.out.println("2.- SALIDA A COMER ");
                System.out.println("3.- ASISTR A EVENTO DEPORTIVO");
                System.out.println("4.- VISITAR EL TEATRO");
                System.out.println("5.- SALIR");
                System.out.println("Ingrese una opción: ");
                opc = lectura.nextInt();
            } while (opc < 1 || opc > 6);
            switch (opc) {
                case 1:

                    cinePlanet(din);
                    cineHoyts(din);

                    break;
                case 2:
                    sushiGohan(din);

                    break;
                case 3:
                    partidoTemuco(din);
                    break;
                case 4:
                    visitaConcierto1(din);
                    visitaConcierto2(din);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gracias !");
            }
        } while (opc != 5);
    }
    // método que compara valor ingresado con el valor de la entrada al cine y muestra un mensaje según sea el caso.
    public void cinePlanet(double n) {
        double cPlanet = 4000;
        if (n >= cPlanet) {
            System.out.println("Tu saldo es suficiente para visitar CINEPLANET");
            System.out.println("Dirección: Avenida Alemania 671 ");
        } else {
            System.out.println("Tu saldo no es suficiente para visitar CINEPLANET");
        }
    }
    // método que compara el valor ingresado con el valor de la entrada de otro cine y muestra un mensaje según sea el caso.
    public void cineHoyts(double n) {
        double cHoyts = 3500;
        if (n >= cHoyts) {
            System.out.println("Tu saldo es suficiente para visitar CINE HOYTS");
            System.out.println("Dirección: Manuel Montt 777");
        } else {
            System.out.println("Tu saldo no es suficiente para visitar CINE HOYTS");
        }
    }
    //método que compara el valor ingresado con el valor de la pieza mas barata de sushi y muestra un mensaje según sea el caso.
    public void sushiGohan(double n) {
        double vPieza = 3190;
        if (n >= vPieza) {
            System.out.println("Tu saldo es suficiente para degustar del sushi de GOHAN");
            System.out.println("Dirección: España 390 y Vicuña Mackenna 581");
        } else {
            System.out.println("Tu saldo no es suficiente para visitar GOHAN");
        }
    }
    //método que compara el valor ingresado con el valor de la entrada mas barata al estadio y muestra un mensaje según sea el caso.
    public void partidoTemuco(double n) {
        double vEntrada = 3000;
        if (n >= vEntrada) {
            System.out.println("Tu saldo es suficiente para asisir al parido de  DEPORTES TEMUCO");
            System.out.println("Dirección: Avenida Pablo Neruda 01110 ");
        } else {
            System.out.println("Tu saldo no es suficiente para asistir al partido de DEPORTES TEMUCO");
        }
    }
    //método que compara valor ingresado con el valor de una entrada a un concierto y muestra un mensaje según sea el caso.
    public void visitaConcierto1(double n) {
        double cMayo = 4000;
        if (n >= cMayo) {
            System.out.println("Su saldo es suficiente para asistir al concierto GRANDES MAESTROS RUSOS");
            System.out.println("Dirección: Avenida Pablo Neruda 01380");
            System.out.println("Fecha: 06 Mayo");
            System.out.println("Horario: 20:00 horas");
        } else {
            System.out.println("Tu saldo no es suficiente para asistir al concierto GRANDES MAESTROS RUSOS");
        }
   
    }
    //método que compara el valor ingresado con el valor de una entrada a otro concierto y muestra un mensaje  según sea el caso.
    public void visitaConcierto2(double n){
        double cJunio = 4000;
        if(n >= cJunio){
              System.out.println("Su saldo es suficiente para asistr al concierto SEXTETO MAYOR DE TANGO");
              System.out.println("Dirección: Avenida Pablo Neruda 01380");
              System.out.println("Fecha 12 Mayo:");
              System.out.println("Horario: 20:00 horas");      
          }else{
            System.out.println("Tu saldo no es suficiente para asistir al concierto SEXTETO MAYOR DE TANGO");
        }
    }
}
