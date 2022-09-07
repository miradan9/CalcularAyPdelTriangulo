package Figuras;
//Valeria Danae Aguayo Miranda
public class Triangulo extends Figura{
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private int lado3;
    public Triangulo(int base, int altura, int lado1, int lado2, int lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
            double a=base *altura;
            area = (a / 2);
    }

    @Override
    public void calcularPerimetro() {
                perimetro = lado1 + lado2 + lado3;
            }
    }

