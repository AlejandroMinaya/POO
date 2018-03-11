import java.util.ArrayList;
import java.util.Iterator;
import java.lang.StringBuilder;
public class Orquesta
{
    private static int lastCodigo = 0;
    public static String generateInstrumentoCodigo()
    {
        lastCodigo++;
        return "I" + (lastCodigo-1);
    }

    private ArrayList<Instrumento> instrumento;

    public Orquesta()
    {
        instrumento = new ArrayList<Instrumento>();

    }

    public Instrumento findInstrumento(String codigo)
    {
        Iterator<Instrumento> instrumentoIterator = instrumento.listIterator();
        Instrumento tmp;
        while(instrumentoIterator.hasNext())
        {
            tmp = instrumentoIterator.next();
            if(tmp.getCodigo().equalsIgnoreCase(codigo))
            {
                return tmp;
            }

        }
        return null;
    }


    public void agregar(Instrumento i)
    {
        instrumento.add(i);
    }

    public void borrar(String codigo)
    {
        Instrumento instrToDel = findInstrumento(codigo);
        if(instrToDel != null)
        {
            instrumento.remove(instrToDel);
            System.out.println("Instrumento borrado con exito!");
            return;
        }
        System.out.println("Instrumento no encontrado");

    }

    public double costoTotal()
    {
        double total = 0;
        for(Instrumento i : instrumento)
        {
            total += i.getCosto();
        }
        return total;
    }

    public void saxofonesSopranos()
    {
        Iterator<Instrumento> instrumentoIterator = instrumento.listIterator();
        Instrumento saxo;
        while(instrumentoIterator.hasNext())
        {
            saxo = instrumentoIterator.next();
            if(saxo instanceof Saxofon && ((Saxofon)saxo).getTipo() == 1)
            {
                System.out.println(saxo.toString());
            }

        }
    }

    public boolean checarLugar(int lugar)
    {
        Iterator<Instrumento> instrumentoIterator = instrumento.listIterator();
        Instrumento tmp;
        while(instrumentoIterator.hasNext())
        {
            tmp = instrumentoIterator.next();
            if(tmp.getLugar() == lugar)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder("\n");
        if(instrumento.size() > 0)
        {
            Iterator<Instrumento> instrumentoIterator = instrumento.listIterator();
            System.out.println("======================== ORQUESTA ========================");
            while(instrumentoIterator.hasNext())
            {
                str.append(instrumentoIterator.next().toString());
            }
        }
        else
        {
            str.append("No hay instrumentos disponibles.");
        }
        return str.toString();
    }
}
