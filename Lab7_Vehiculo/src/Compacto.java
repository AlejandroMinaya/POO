public class Compacto extends Vehiculo
{
    private boolean electrico;

    public Compacto()
    {
        super();
        electrico = false;
    }

    public Compacto(String modelo, String fabricante, double capacidad, double rendimiento, double precio, boolean electrico)
    {
        super(modelo, fabricante, capacidad, rendimiento, precio);
        this.electrico = electrico;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public double rendimientoTotal()
    {
        if(electrico)
        {
            return capacidad * (1/rendimiento);
        }

        return super.rendimientoTotal();
    }

    @Override
    public String toString() {
        return "Compacto{" +
                "electrico=" + electrico +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", capacidad=" + capacidad +
                ", rendimiento=" + rendimiento +
                ", precio=" + precio +
                '}';
    }
}
