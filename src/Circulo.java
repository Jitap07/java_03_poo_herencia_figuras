public class Circulo extends Figura
{
    // VARIABLES:
    double Radio;
    
    // CONSTRUCTOR:
    public Circulo(double radio)
    {
        this.Radio = radio;
    }

    @Override
    double calcularArea()
    {
        return Math.PI * Radio * Radio;
    }
    
}
