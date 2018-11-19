/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.DetalleOperacion;
import modelo.Pallets;
import modelo.Productos;
import modelo.RecursosEnsamble;

/**
 
 * @author William Morales
 */
public class ClaseMain {
    public static void main(String[] args) {
        Productos p = new Pallets('2', '1', '3');
        p.operationDetaills();
        p.relatePallets();
        
        
        
        DetalleOperacion dp = new DetalleOperacion(true, true, true);
        dp.setOpConfig();
        
        
        RecursosEnsamble re = new RecursosEnsamble(true, true, true);
        re.loarUbicationRaw();
        
    }
}
