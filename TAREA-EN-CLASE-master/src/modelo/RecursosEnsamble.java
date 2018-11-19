/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 * @author William Morales
 */
public class RecursosEnsamble extends DetalleOperacion implements LoadUbicationRaw{
    private int rawMaterialUbication;
    private int wareHouseSlotNum;
    private int assemblyBuffer; 

    public RecursosEnsamble(boolean assembly, boolean inspection, boolean cncEvent) {
        super(assembly, inspection, cncEvent);
    }
    public void loarUbicationRaw(){
        System.out.println( 
                wareHouseSlot()+
                palletNumbre()+
                product()+
                operation()
        );
    }
    /**
     * @return the rawMaterialUbication
     */
    public int getRawMaterialUbication() {
        return rawMaterialUbication;
    }

    /**
     * @param rawMaterialUbication the rawMaterialUbication to set
     */
    public void setRawMaterialUbication(int rawMaterialUbication) {
        this.rawMaterialUbication = rawMaterialUbication;
    }

    /**
     * @return the wareHouseSlotNum
     */
    public int getWareHouseSlotNum() {
        return wareHouseSlotNum;
    }

    /**
     * @param wareHouseSlotNum the wareHouseSlotNum to set
     */
    public void setWareHouseSlotNum(int wareHouseSlotNum) {
        this.wareHouseSlotNum = wareHouseSlotNum;
    }

    /**
     * @return the assemblyBuffer
     */
    public int getAssemblyBuffer() {
        return assemblyBuffer;
    }

    /**
     * @param assemblyBuffer the assemblyBuffer to set
     */
    public void setAssemblyBuffer(int assemblyBuffer) {
        this.assemblyBuffer = assemblyBuffer;
    }

    @Override
    public int wareHouseSlot() {
        return 0;
    }

    @Override
    public int palletNumbre() {
     return 0;
    }

    @Override
    public int product() {
     return 0;
    }

    @Override
    public int operation() {
     return 0;
    }


}
