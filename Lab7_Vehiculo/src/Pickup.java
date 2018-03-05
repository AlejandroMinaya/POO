public class Pickup extends Vehiculo
{
    private double ancho;
    private double largo;
    private double alto;
    private double capacidadCarga;

    public Pickup()
    {
        super();
        ancho = 0;
        largo = 0;
        alto = 0;
        capacidadCarga = 0;
    }

    public Pickup(String modelo, String fabricante, double capacidad, double rendimiento, double precio, double ancho, double largo, double alto, double capacidadCarga)
    {
        super(modelo, fabricante, capacidad, rendimiento, precio);
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.capacidadCarga = capacidadCarga;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double volumen()
    {
        return ancho * largo * alto;
    }

    public double rendimientoTotal(double cargaActual)
    {
        double rendimiento = rendimientoTotal();
        if(cargaActual > capacidadCarga)
        {
            rendimiento *= 0.7;
        }
        return rendimiento;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", alto=" + alto +
                ", volumen=" + volumen() +
                ", capacidadCarga=" + capacidadCarga +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", capacidad=" + capacidad +
                ", rendimiento=" + rendimiento +
                ", precio=" + precio +
                '}';
    }
}
