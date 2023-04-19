# Estructura de paquetes

## .vscode

En este paquete se encuentra un fichero tipo JSON con su respectiva configuración.

## bin

Contiene los archivos tipo binario del proyecto entero

## documentos 
 
Contienen los archivos adjuntos al README.md , que son el manual de usuario , la estructura de paquetes y la descripcion de los métodos.

## lib 

Es la carpeta en la que se almacenan las librerias que han utilizado

## src

Carpeta en la que se almacena el proyecto 

## Ruta hacia los proyectos

Dentro de src , entramos en net y nos podremos encontrar la carpeta pokedex que contiene las carpetas listapokemon y pokemon con sus respectivas clases , además de la App principal .


# Descripción de la clase "Listapokemon"



## Objetivo

Esta clase tiene como objetivo almacenar los métodos necesarios para poder manipular la lista de los pokemons.

## Métodos :

### annadir

Método void al que se le pasa un objeto Pokemon. El objeto se almacena en un array que ha sido previamente igualado en un bucle a un array nuevo en el que se realiza el incremento de espacios que puede almacenar. 

### eliminar

Método void al que se le pasa un objeto Pokemon . Si el objeto es igual a un objeto que ya estaba previamente guardado en el array , se sustituye por nulo , si no se incrementarán los elementos totales. Posteriormente se crea otro array nuevo en el que , en un bucle for , se igualará a el array posterior en el caso de que la posicion del array sea distinta de nulo.

### retornar

Método tipo Pokemon que obtiene como parámetro un número .
Este retornará la posicion indicada con el número en el array de pokemons.

### desplegar

Método tipo void , que pintará la lista a través de un bucle.

# Descripción de la clase "Pokemon"

## objetivo :

Esta clase tiene como objetivo , guardar los atributos de los objetos pokemon , implementando tambien sus métodos de acceso , y una sobreescritura del método toString con la cual podremos pintar la información del pokemon por la pantalla.

# Descripción de la clase "Pokemonlegendario"

## Objetivo :

Esta clase tiene el mismo objetivo que la clase Pokemon ya que esta hereda de la misma , pero añade un atributo más tipo String llamado "localización".


['volver](/Readme.md)