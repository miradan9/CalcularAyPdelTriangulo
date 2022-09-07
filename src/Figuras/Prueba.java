package Figuras;
//Valeria Danae Aguayo Miranda
public class Prueba {
    public static void main(String[] args) {
        //Figura f1=new Figura() {
        Triangulo t1=new Triangulo(5,8,5,5,5);
        Triangulo t2=new Triangulo(8,12,6,7,4);

        System.out.println("El área del triángulo 1 es: " +t1.getArea());
        System.out.println("EL perímetro del triángulo 1 es: " +t1.getPerimetro());
        System.out.println("El área del triángulo 2 es: "+t2.getArea());
        System.out.println("El perímetro del triángulo 2 es: " +t2.getPerimetro());
    }
}
