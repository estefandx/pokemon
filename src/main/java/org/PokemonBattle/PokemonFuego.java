package org.PokemonBattle;

public class PokemonFuego extends Pokemon {
    private static final int DEBILIDAD_AGUA = 10;


    public PokemonFuego(String nombre, int puntosDeVida) {
        super(nombre, "Fuego", puntosDeVida);
    }

    @Override
    protected void recibirDanio(int danio) {
        // Los Pokemon de fuego reciben menos daño de ataques de agua debido a su resistencia
        int danioRecibido = danio + DEBILIDAD_AGUA;
        super.recibirDanio(danioRecibido);
    }

    public void generarCalor() {
        System.out.println(nombre + " está generando calor y aumentando sus estadísticas de ataque y defensa.");

    }


}