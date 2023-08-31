package org.PokemonBattle;

public class PokemonAgua extends Pokemon {
    private static final int RESISTENTE_FUEGO = 60;

    public PokemonAgua(String nombre, int puntosDeVida) {
        super(nombre, "Agua", puntosDeVida);
    }

    @Override
    protected void recibirDanio(int danio) {
        // Los Pokemon de agua reciben menos daño de ataques de fuego debido a su resistencia
        int danioRecibido = danio - RESISTENTE_FUEGO;
        super.recibirDanio(danioRecibido);
    }

    public void nadar() {
        System.out.println(nombre + " está nadando en el agua.");
    }

}
