public abstract class Instrumento
{
    protected String codigo;
    protected int lugar;
    protected double costo;

    public Instrumento()
    {
        codigo = Orquesta.generateInstrumentoCodigo();
        lugar = -1;
        costo = 0;
    }

    public Instrumento(int lugar, double costo)
    {
        codigo = Orquesta.generateInstrumentoCodigo();
        this.lugar = lugar;
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public abstract void tocar();
    public abstract void afinar();

    @Override
    public String toString()
    {
        String classStr = "" + this.getClass();
        return " ======= INSTRUMENTO : " + classStr.substring(6).toUpperCase() + " ======= "
        + "\n Codigo: " + codigo
        + "\n Lugar: " + lugar
        + "\n Costo: $" + costo;

    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(!(obj instanceof Instrumento))
            return false;
        if(obj == this)
            return true;
        return ((Instrumento)obj).getCodigo().equals(codigo);
    }
}
