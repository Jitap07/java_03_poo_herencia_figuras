public class Rectangulo extends Figura
{
    // VARIABLES:
    double Base, Altura;
    
    // CONSTRUCTOR:
    public Rectangulo(double base, double altura)
    {
        this.Base = base;
        this.Altura = altura;
    }

    @Override
    double calcularArea()
    {
        return (Base * Altura)/ 2;
    }
    
}
