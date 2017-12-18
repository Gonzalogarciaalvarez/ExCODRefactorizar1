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
/**
 * En la main solo llamaremos a los metodos mediante un objeto que creamos
 * @param args 
 */
public static void main(String[] args) {
CalcularTiempo obx = new CalcularTiempo();
obx.recibirNombreEdad(obx.nombre, obx.edad);
obx.calcularTiempo(obx.meses, obx.dias, obx.horas);
}
   

}
