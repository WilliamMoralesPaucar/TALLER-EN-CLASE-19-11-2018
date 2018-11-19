/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 * @author William Morales
 */
public class Productos {
    private char rawMaterial;
    private char rawM_Accesories;
    private char productFinished;

    public Productos(char rawMaterial, char rawM_Accesories, char productFinished) {
        this.rawMaterial = rawMaterial;
        this.rawM_Accesories = rawM_Accesories;
        this.productFinished = productFinished;
    }
    public void operationDetaills(){
        System.out.println(""
                + "RAW MATERIAS: "+getRawMaterial()
                + "RAW ACCESPRRIOS: "+getClass()
                + "PRODUCT FINISHED"+getProductFinished());
    }
    public void relatePallets(){
        System.out.println("PALETES RELACIONADOS");
    }
    /**
     * @return the rawMaterial
     */
    public char getRawMaterial() {
        return rawMaterial;
    }

    /**
     * @param rawMaterial the rawMaterial to set
     */
    public void setRawMaterial(char rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    /**
     * @return the rawM_Accesories
     */
    public char getRawM_Accesories() {
        return rawM_Accesories;
    }

    /**
     * @param rawM_Accesories the rawM_Accesories to set
     */
    public void setRawM_Accesories(char rawM_Accesories) {
        this.rawM_Accesories = rawM_Accesories;
    }

    /**
     * @return the productFinished
     */
    public char getProductFinished() {
        return productFinished;
    }

    /**
     * @param productFinished the productFinished to set
     */
    public void setProductFinished(char productFinished) {
        this.productFinished = productFinished;
    }
    
}
