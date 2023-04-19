package net.pokedex.pokemon;



public class Pokemon{
    protected String nombre;
    protected String tipo;
    protected int altura;
    protected int peso;
    protected String descripcion;

    public Pokemon( String nombre , String tipo , int altura , int peso , String descripcion){
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre , String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getPeso() {
        return this.peso;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        String msg = ("");
        if (nombre == null) {
            msg += ("Nombre : ? " + "\n");
        } else{
            msg += ("Nombre : " + nombre + "\n");
        }

        if (tipo == null) {
            msg += ("Tipo : ? " + "\n");
        } else{
            msg += ("Tipo : " + tipo + "\n");
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

        return msg;
    }

}