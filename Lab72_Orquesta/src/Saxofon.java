public class Saxofon extends Instrumento
{
    private static String tipos[] = {"tenor", "soprano", "baritono"};
    private int tipo;

    public Saxofon()
    {
        super();
        tipo = 0; //DEFAULT BAJO
    }

    public Saxofon(int lugar, double costo, int tipo)
    {
        super(lugar, costo);
        this.tipo = tipo;
    }

    public int getTipo()
    {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }

    public void tocar()
    {
        System.out.println("Se esta tocando el saxofon " + tipos[tipo]);
    }

    public void afinar()
    {
        System.out.println("Se esta afinando el saxofon " + tipos[tipo]);
    }

    @Override
    public String toString()
    {
        return super.toString()
        + "\n Tipo: " + tipos[tipo].substring(0,1).toUpperCase() + tipos[tipo].substring(1)
        + "\n =============================\n";
    }
}
