/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import uac.util.Arbin;
import uac.util.ArbolEnl;

/**
 *
 * @author davidcerchiaro
 */
public class RedSocial {

    private Arbin<Persona> raiz;
    private String list = "";

    /**
     * @param a El objeto "a" se añade al arbol y se organiza por el apellido
     */
    public void añadirP(Persona a) {
        if (this.raiz == null) {
            this.raiz = new ArbolEnl<>(a);
        } else {
            añadirP(a, this.raiz);
        }
    }

    private void añadirP(Persona a, Arbin<Persona> r) {
        if (a.getApellidos().compareTo(r.obtener().getApellidos()) < 0) {
            if (r.izq() == null) {
                r.enlIzq(new ArbolEnl<>(a));
            } else {
                añadirP(a, r.izq());
            }
        } else if (a.getApellidos().compareTo(r.obtener().getApellidos()) > 0) {
            if (r.der() == null) {
                r.enlDer(new ArbolEnl<>(a));
            } else {
                añadirP(a, r.der());
            }
        }
    }


    public String mostrar() {
        this.list = "";
        inorden(this.raiz);
        return list;
    }

    private void inorden(Arbin<Persona> r) {
        if (r != null) {
            inorden(r.izq());
            list += " " + r.obtener().toString() + "\n";
            inorden(r.der());

        }
    }

}
