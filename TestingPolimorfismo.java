public class TestingPolimorfismo {
    public static void main(String[] args) {
        FiguraGeometrica unaFigurageometrica = new FiguraGeometrica("Rombo");
        System.out.println();
        unaFigurageometrica.setArea(12.45);

        //Ejemplo de polimorfismo estetico: El programador indica cual metodo
        //usar segun los parametros que envie
        System.out.println(unaFigurageometrica.toString());
        System.out.println("Area de la figura:"+ unaFigurageometrica.toString(true));

        Circulo circulo1 = new Circulo("Circulo", 10.5);
        //Ejemplo de polimorfismo dinamico: java detecta que objeto es para llamar al metodo apropiado
        double a = circulo1.getArea();
        circulo1.setArea(a);
        System.out.println("info de circulo1:"+ circulo1.toString());
        
        Triangulo triangulo1 = new Triangulo("Triangulo ",45 ,45, 48); 
        triangulo1.setAltura(50);
        double d = triangulo1.getArea();
        triangulo1.setArea(d);
        double e = triangulo1.getPerimetro();
        triangulo1.setPerimetro(e);
        System.out.println("Informacion triangulo: " + triangulo1.toString());

        Triangulo tr2 = new Triangulo("triangulo ",15,20);
        tr2.setArea(e);
        System.out.println("info de triagulo II"+ tr2.toString());
}

}


