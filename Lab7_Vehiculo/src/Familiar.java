public class Familiar extends Vehiculo
{
    private boolean dvd;

    public Familiar()
    {
        super();
        dvd = false;
    }

    public Familiar(String modelo, String fabricante, double capacidad, double rendimiento, double precio, boolean dvd)
    {
        super(modelo, fabricante, capacidad, rendimiento, precio);
        this.dvd = dvd;

    }

    public boolean isDvd()
    {
        return dvd;
    }

    public void setDvd(boolean dvd)
    {
        this.dvd = dvd;
    }

    @Override
    public String toString() {
        return "Familiar{" +
                "dvd=" + dvd +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", capacidad=" + capacidad +
                ", rendimiento=" + rendimiento +
                ", precio=" + precio +
                '}';
    }
}
