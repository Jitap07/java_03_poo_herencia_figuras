public abstract class Figura
{
    // Se implementará en las clases que hereden de "Figura":
    abstract double calcularArea();
    
    // Accesible por cualquier clase que hereden de "Figura":
    void imprimirInformacion()
    {
        System.out.println("");
        System.out.println("Esta Información, viene desde la clase abstracta . . . ");
    }
}
