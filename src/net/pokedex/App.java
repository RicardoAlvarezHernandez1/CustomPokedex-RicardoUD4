package net.pokedex;

import java.util.Scanner;

import net.pokedex.listapokemon.Listapokemon;
import net.pokedex.pokemon.Pokemon;
import net.pokedex.pokemon.pokemonLegendario.Pokemonlegendario;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        String tipo = "";
        int peso;
        int altura;
        String descripcion;
        String localizacion = "";
        int numerito;
        Listapokemon listaAvistados = new Listapokemon();
        Listapokemon listaCapturados = new Listapokemon();
        boolean salida = false;
        String opcion = "";
        while (salida == false) {
            System.out.println("Muy buenas usuario , por favor , seleccione una opción de las que ofrece la pokedex : ");
            System.out.println("a. Añadir un pokemon avistado");
            System.out.println("b. Añadir avistamiento legendario");
            System.out.println("c. Pasara capturados");
            System.out.println("d. Mostrar lista de avistados");
            System.out.println("e. Mostrar lista de capturados");
            System.out.println("f. Cerrar la pokedex");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "a":
                    
                    
                    System.out.println("Por favor , inserte el nombre y el tipo del pokemon avistado : ");
                    System.out.println("Nombre : "); nombre = teclado.nextLine();
                    System.out.println("Tipo : "); tipo = teclado.nextLine();
                    
                    Pokemon pokemonNormal = new Pokemon(nombre, tipo);
                    listaAvistados.annadir(pokemonNormal);

                    System.out.println("\n" + "Pokemon añadido a avistados..." + "\n");

                    break;
                case "b":
                    
                    System.out.println("Por favor , inserte el nombre , el tipo y localización del pokemon legendario avistado : ");
                    System.out.println("Nombre : "); nombre = teclado.nextLine();
                    System.out.println("Tipo : "); tipo = teclado.nextLine();
                    System.out.println("Localización : "); localizacion = teclado.nextLine();
                    Pokemonlegendario pokemonLegendario = new Pokemonlegendario(nombre, tipo , localizacion);

                    listaAvistados.annadir(pokemonLegendario);

                    System.out.println("\n" + "Pokemon legendario añadido a avistados..." + "\n");

                    break;
                case "c":
                    
                    System.out.println("Por favor inserte el número del pokemon que ha capturado : " + "\n");
                    listaAvistados.desplegar();
                    numerito = teclado.nextInt();
                    Pokemon pokemonCapturado = listaAvistados.retornar(numerito);
                    System.out.println("Pokemon añadido a capturados");
                    listaCapturados.annadir(pokemonCapturado);
                    listaAvistados.eliminar(pokemonCapturado);
                    System.out.println("Por favor inserte los siguientes parámetros para finalizar la captura.");
                    System.out.println("Peso : ");
                    peso = teclado.nextInt();
                    pokemonCapturado.setPeso(peso);
                    System.out.println("Altura : ");
                    altura = teclado.nextInt();
                    pokemonCapturado.setAltura(altura);
                    teclado.nextLine();
                    System.out.println("Descripcion : " );
                    descripcion = teclado.nextLine();
                    pokemonCapturado.setDescripcion(descripcion);
                    break;
                case "d":
                    listaAvistados.desplegar();
                    break;
                case "e":
                    listaCapturados.desplegar();
                    break;
                case "f":
                    salida = true;
                    break;
                default:
                    break;
            }
        }
        
    }
}
