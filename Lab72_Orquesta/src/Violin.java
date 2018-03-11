public class Violin extends Instrumento
{
    private int numCuerdas = 4;

    public Violin()
    {
        super();
    }

    public Violin(int lugar, double costo)
    {
        super(lugar, costo);
    }

    public int getNumCuerdas()
    {
        return numCuerdas;
    }

    public void setNumCuerdas(int numCuerdas)
    {
        this.numCuerdas = numCuerdas;
    }

    public void tocar()
    {
        System.out.println("Tocando violin...");
    }

    public void afinar()
    {
        System.out.println("Afinando violin...");
    }

    @Override
    public String toString()
    {
        return super.toString()
        + "\n No. de Cuerdas: " + numCuerdas
        + "\n =============================\n";
    }


}
