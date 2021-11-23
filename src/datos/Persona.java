/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author davidcerchiaro
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private String sexo;
    private String nacionalidad;
    private String infoPersonal;
    private int edad;

    public Persona(String nombre, String apellidos, String sexo, String nacionalidad, String estudios, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.infoPersonal = estudios;
        this.edad = edad;
    }

 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the infoPersonal
     */
    public String getEstudios() {
        return infoPersonal;
    }

    /**
     * @param estudios the infoPersonal to set
     */
    public void setEstudios(String estudios) {
        this.infoPersonal = estudios;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
