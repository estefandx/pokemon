package org.PokemonBattle;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 100);
        PokemonFuego charmander = new PokemonFuego("Charmander", 120);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 110);

        pikachu.mostrarSalud();
        charmander.mostrarSalud();
        charmander.generarCalor();
        pikachu.atacar(charmander, 20); // Pikachu ataca a Charmander (un Pokemon de fuego)
        charmander.atacar(squirtle, 15); // Charmander ataca a Squirtle (un Pokemon de agua)
        pikachu.mostrarSalud();
        charmander.mostrarSalud();
        pikachu.curarse(10);
        charmander.curarse(15);
        squirtle.curarse(20);

    }
}
