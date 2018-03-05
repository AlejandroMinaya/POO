public class Vehiculo
{
    protected String modelo;
    protected String fabricante;
    protected double capacidad;
    protected double rendimiento;
    protected double precio;

    public Vehiculo()
    {
       modelo = "";
       fabricante = "";
       capacidad = 0;
       rendimiento = 0;
       precio = 0;
    }

    public Vehiculo(String modelo, String fabricante, double capacidad, double rendimiento, double precio)
    {
       this.modelo = modelo;
       this.fabricante = fabricante;
       this.capacidad = capacidad;
       this.rendimiento = rendimiento;
       this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double rendimientoTotal()
    {
        return capacidad * rendimiento;
    }

    @Override
    public String toString()
    {
        String object = "Vehiculo\n";
        object += "--------------\n";
        object += "Modelo: " + modelo;

        return object;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(!(obj instanceof Vehiculo))
            return false;
        Vehiculo tmp = (Vehiculo)obj;
        return modelo.equals(tmp.getModelo());
    }
}
