/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlventas.modelos;

/**
 *
 * @author chrisloops
 */
public class Caja {
    private int id;
    private Local local;

    public Caja(){
    }
    
    public Caja(int id, Local local) {
        this.id = id;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    
}
