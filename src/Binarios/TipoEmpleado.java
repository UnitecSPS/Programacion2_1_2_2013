/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Binarios;

/**
 *
 * @author Gotcha
 */
public enum TipoEmpleado {
    OPERACIONES(0), GERENCIAL(0.03), DIRECTIVO(0.05);
    double tasa;
    
    private TipoEmpleado(double t){
        tasa = t;
    }
}
