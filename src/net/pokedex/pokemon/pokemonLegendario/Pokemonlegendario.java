package net.pokedex.pokemon.pokemonLegendario;

import net.pokedex.pokemon.Pokemon;

public class Pokemonlegendario extends Pokemon{

    private String localizacion;

    public Pokemonlegendario(String nombre, String tipo, int altura, int peso, String descripcion) {
        super(nombre, tipo, altura, peso, descripcion);
        
        
    }
    
    public Pokemonlegendario(String nombre, String tipo , String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    @Override
    public String toString(){
        String msg = ("");
        if (nombre == null) {
            msg += ("Nombre : ? " + "\n");
        } else{
            msg += ("Nombre : " + nombre.toUpperCase() + "\n");
        }

        if (tipo == null) {
            msg += ("Tipo : ? " + "\n");
        } else{
            msg += ("Tipo : " + tipo.toUpperCase() + "\n");
        }

        if (altura <= 0) {
            msg += ("Altura : ? " + "\n");
        } else {
            msg += ("Altura : " + altura + "\n");
        }

        if (peso <= 0) {
            msg += ("Peso : ? " + "\n");
        } else {
            msg += ("Peso : " + peso + "\n");
        }

        if (descripcion == null){
            msg += ("Descripción : ? " + "\n");
        }else{
            msg += ("Descripción : " + descripcion + "\n");
        }

        if (localizacion == null) {
            msg += ("Localización : ? " + "\n");
        } else {
            msg += ("Localización : " + localizacion + "\n");
        }

        return msg;
    }

}

