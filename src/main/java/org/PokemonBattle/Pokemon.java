package org.PokemonBattle;

public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected int puntosDeVida;

    public Pokemon(String nombre, String tipo, int puntosDeVida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosDeVida = puntosDeVida;
    }

    public void atacar(Pokemon objetivo, int danio) {
        System.out.println(nombre + " ataca a " + objetivo.nombre + " y le hace " + danio + " puntos de daño.");
        objetivo.recibirDanio(danio);
    }

    public void curarse(int cantidadCuracion) {
        puntosDeVida += cantidadCuracion;
        System.out.println(nombre + " se ha curado y ahora tiene " + puntosDeVida + " puntos de vida.");
    }

    protected void recibirDanio(int danio) {
        puntosDeVida -= danio;
        if (puntosDeVida <= 0) {
            System.out.println(nombre + " se ha debilitado.");
        }
    }

    public void mostrarSalud() {
        System.out.println(nombre + " tiene " + puntosDeVida + " puntos de vida.");
    }
}