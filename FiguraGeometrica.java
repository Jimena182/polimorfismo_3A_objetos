public class FiguraGeometrica {
    private String nombre;
    private double area;
    private double perimetro;

    public FiguraGeometrica( String nombre ){
        this.nombre = nombre;
    }
    
    public FiguraGeometrica(double area) {
        this.area = area;
    }

    //polimorfismo estetico o parametrico
    //sobrecarga de metodos
    public FiguraGeometrica( String nombre, double area){
        this.nombre = nombre;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
        
    //polimorfismo dinamico (sobre-escritura de metodos)ç
     //sobre-escribit el metodo toString que se hereda de object
     //El metodo debe cumplir con el tuipo de dato de los parametros del heredado
    
    @Override
    public String toString() {
        return "Figurageometrica [nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro+"]";
}
    public String toString(boolean dato){
        if(dato == true){
            return String.valueOf(this.area);
        }
            return String.valueOf(this.perimetro);

    }
}