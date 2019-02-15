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
public class Empleado extends Persona{
    
    private String usuario;
    private String contrasena;
    private Rol rol;
    private Caja caja;
    private Local local;
    private boolean estado;

    public Empleado(String usuario, String contrasena, Rol rol, Caja caja, Local local, boolean estado, int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.caja = caja;
        this.local = local;
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
