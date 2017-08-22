/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author andres
 */
public class UsuariosDTO {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String usuario;
    private String pass;
    private String tel;
    private String correo;
    private int nivel;

    public UsuariosDTO(String nombre, String aPaterno, String aMaterno, String usuario, String pass, String tel, String correo, int nivel) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.usuario = usuario;
        this.pass = pass;
        this.tel = tel;
        this.correo = correo;
        this.nivel = nivel;
    }

    public UsuariosDTO() {
        nombre = "";
        aPaterno = "";
        aMaterno = "";
        usuario = "";
        pass = "";
        tel = "";
        correo = "";
        nivel = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    
    
    
}
