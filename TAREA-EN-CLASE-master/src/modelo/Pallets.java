/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
* @author William Morales
 */
public class Pallets extends Productos{
    private char [] palletTyoe;

    public Pallets(char rawMaterial, char rawM_Accesories, char productFinished) {
        super(rawMaterial, rawM_Accesories, productFinished);
    }

    /**
     * @return the palletTyoe
     */
    public char[] getPalletTyoe() {
        return palletTyoe;
    }

    /**
     * @param palletTyoe the palletTyoe to set
     */
    public void setPalletTyoe(char[] palletTyoe) {
        this.palletTyoe = palletTyoe;
    }

    
    
}
