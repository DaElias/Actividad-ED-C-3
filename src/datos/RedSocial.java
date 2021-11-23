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

    public void eliminar(String pal) {
        if (buscarABB(pal)) {
            this.raiz = eliminar(raiz, pal);
        }
    }

    private Arbin<Persona> eliminar(Arbin<Persona> r, String pal) {
        if (r.obtener().equals(pal)) {
            return borrar(r);
        } else {
            if (pal.compareTo(r.obtener().getApellidos()) < 0) {
                r.enlIzq(eliminar(r.izq(), pal));
            } else {
                r.enlDer(eliminar(r.der(), pal));
            }
            return r;

        }
    }

    private Arbin<Persona> borrar(Arbin<Persona> r) {
        if (r.izq() == null && r.der() == null) {
            return null;
        } else if (r.izq() == null) {
            return r.der();
        } else if (r.der() == null) {
            return r.izq();
        } else {
            Persona may = mayorABB(r.izq());
            r.cambiar(may);
            r.enlIzq(eliminar(r.izq(), may.getApellidos()));
            return r;
        }
    }

    public boolean buscarABB(String pal) {
        if (raiz == null) {
            return false;
        } else {
            return buscarABB(raiz, pal);
        }
    }

    private boolean buscarABB(Arbin<Persona> r, String pal) {
        if (r.obtener().equals(pal)) {
            return true;
        } else {
            if (pal.compareTo(r.obtener().getApellidos()) < 0) {
                if (r.izq() == null) {
                    return false;
                } else {
                    return buscarABB(r.izq(), pal);
                }
            } else {
                if (r.der() == null) {
                    return false;
                } else {
                    return buscarABB(r.der(), pal);
                }

            }
        }
    }

        public Persona mayorABB() {
        if (raiz != null) {
            return mayorABB(raiz);
        } else {
            return null;
        }
    }

    private Persona mayorABB(Arbin<Persona> r) {
        if (r.der() == null) {
            return r.obtener();
        } else {
            return mayorABB(r.der());
        }
    }

    
    
}
