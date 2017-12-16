/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

/**
 *
 * @author Gonzalo
 */

public class LoVivido {
//Esta clase solo servira para llamar a los metodos mediante un objeto que creamos
public static void main(String[] args) {
CalcularTiempo obx = new CalcularTiempo();
obx.recibirNombreEdad(obx.nombre, obx.edad);
obx.calcularTiempo(obx.meses, obx.dias, obx.horas);
}
   

}
