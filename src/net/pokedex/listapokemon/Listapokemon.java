package net.pokedex.listapokemon;

import net.pokedex.pokemon.Pokemon;

public class Listapokemon{
    
    private Pokemon[]listaPokemon;
    int tamaño = 0;
    
    
    public Listapokemon(){
        this.listaPokemon = new Pokemon[1];
    }

    public void annadir(Pokemon pokemon) {

        Pokemon[] nuevaListaPokemon = new Pokemon[this.tamaño + 1];

        for (int i = 0; i < this.listaPokemon.length; i++) {
            nuevaListaPokemon[i] = this.listaPokemon[i];
        }

        nuevaListaPokemon[this.tamaño] = pokemon;
        this.listaPokemon = nuevaListaPokemon;
        this.tamaño++;
    }

    public void eliminar(Pokemon pokemon){
        
        int elementosTotales = 0;
        for (int i = 0; i < this.listaPokemon.length; i++) {
            if (this.listaPokemon[i].equals(pokemon)){
                this.listaPokemon[i] = null;
            } else {
                elementosTotales++;
            }
        }

        Pokemon[] nuevaListaPokemon = new Pokemon[elementosTotales];
        int nuevoIndice = 0;

        for (int i = 0; i < this.listaPokemon.length; i++) {
            if (this.listaPokemon[i] != null){
                nuevaListaPokemon[nuevoIndice] = this.listaPokemon[i];
                nuevoIndice++;
            }
            
        }

        this.listaPokemon = nuevaListaPokemon;
        this.tamaño = elementosTotales;
    }

    public Pokemon retornar(int numPokemon){

        return(listaPokemon[numPokemon - 1]);

    }


    

    public void desplegar(){
        int numeracion = 1;
        for (Pokemon pokemon : this.listaPokemon){
            System.out.println(numeracion + " - " + pokemon);
            numeracion++;
        }
    }

    

    


}
