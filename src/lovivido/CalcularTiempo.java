/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
//He utilizado el refactor con su opcion de rename para poner nombres mas intuitivos a los atributos
public class CalcularTiempo {
String nombre;
String edad;

int meses;
int dias;
int horas;
int años;

//Recibira el nombre y la edad de la persona
    public void recibirNombreEdad(String nombre, String edad){
    nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
    edad = JOptionPane.showInputDialog ("Escriba su edad: ");
    años = Integer.parseInt (edad);
    }
    
    /**
     * Ahora vamos a calcular el tiempo que ha vivido
     * y a devolverlo en meses, dias y horas
     */
    public void calcularTiempo(int meses, int dias, int horas){
    meses = (años*12);
    dias = (años*365);
    horas = (dias*24);
 
    JOptionPane.showMessageDialog(null,  "Meses: "  +meses,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Días: " +dias,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Horas: " +horas,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
    
    System.exit (0); 
    }

}
