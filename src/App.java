public class App
{
    public static void main(String[] args) throws Exception
    {
        Circulo circulo = new Circulo(12);
        circulo.imprimirInformacion();
        System.out.println("El área del Circulo es: " + circulo.calcularArea());
        
        Rectangulo rectangulo = new Rectangulo(10,12);
        rectangulo.imprimirInformacion();
        System.out.println("El área del Rectangulo es: " + rectangulo.calcularArea());
    }
}
