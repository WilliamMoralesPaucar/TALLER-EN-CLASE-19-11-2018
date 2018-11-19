/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
* @author William Morales
 */
public class DetalleOperacion implements SelectOperation{
    private boolean assembly;
    private boolean inspection;
    private boolean cncEvent;

    public DetalleOperacion(boolean assembly, boolean inspection, boolean cncEvent) {
        this.assembly = assembly;
        this.inspection = inspection;
        this.cncEvent = cncEvent;
    }
    /**
     * @return the assembly
     */
    public boolean isAssembly() {
        return assembly;
    }

    /**
     * @param assembly the assembly to set
     */
    public void setAssembly(boolean assembly) {
        this.assembly = assembly;
    }

    /**
     * @return the inspection
     */
    public boolean isInspection() {
        return inspection;
    }

    /**
     * @param inspection the inspection to set
     */
    public void setInspection(boolean inspection) {
        this.inspection = inspection;
    }

    /**
     * @return the cncEvent
     */
    public boolean isCncEvent() {
        return cncEvent;
    }

    public void selectOpConfig(){
        System.out.println("Sleect Op Config");
    }

    @Override
    public char jobRobot() {
       char retorno = 'R';
        return retorno;
    }

    @Override
    public char jobCMC() {
        char r = 'J';
        return r;
    }

    @Override
    public char josInspection() {
        char j = 'J';
        return j;
    }
    
    public void setOpConfig(){
        System.out.println(
            jobCMC() +
            jobRobot() +
            josInspection()
        );
    }    
}
