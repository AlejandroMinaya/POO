import java.util.ArrayList;
import java.util.Iterator;
public class Agencia
{
    private ArrayList<Vehiculo> vehiculos;
    public Agencia()
    {
        vehiculos = new ArrayList<Vehiculo>();
    }

    public void agregarCarro(Vehiculo newVehiculo)
    {
        vehiculos.add(newVehiculo);
    }

    public void borraCarro(String modelo)
    {
        Iterator<Vehiculo> vehiculosIterator = vehiculos.listIterator();
        Vehiculo tmpVehiculo;
        while(vehiculosIterator.hasNext())
        {
            tmpVehiculo = vehiculosIterator.next();
            if(tmpVehiculo.getModelo().equals(modelo))
            {
                vehiculos.remove(tmpVehiculo);
                System.out.println("Vehiculo borrado con exito.");
                return;
            }
            System.out.println("Vehiculo no encontrado.");
        }
    }

    public void existencia(String modelo)
    {
        Iterator<Vehiculo> vehiculoIterator = vehiculos.listIterator();
        Vehiculo tmpVehiculo;
        while(vehiculoIterator.hasNext())
        {
            tmpVehiculo = vehiculoIterator.next();
            if(tmpVehiculo.getModelo().equals(modelo)) {
                System.out.println("El modelo " + modelo + " esta disponible");
                return;
            }
        }
        System.out.println("El modelo " + modelo + " no esta en existencia.");
    }

    public void carrosAdquiribles(double presupuesto)
    {
        Iterator<Vehiculo> vehiculoIterator = vehiculos.listIterator();
        Vehiculo tmpVehiculo;
        System.out.println("Vehiculos Disponibles: ");
        while(vehiculoIterator.hasNext())
        {
            tmpVehiculo = vehiculoIterator.next();
            if(tmpVehiculo.getPrecio() <= presupuesto)
            {
                System.out.println(tmpVehiculo.toString());
            }
        }
    }

    public void mejorRendimiento()
    {
        Iterator<Vehiculo> vehiculoIterator = vehiculos.listIterator();
        Vehiculo vehiculoMejorRendimiento = vehiculoIterator.next();
        Vehiculo tmpVehiculo;
        System.out.println("Vehiculo con mejor rendimiento");
        while(vehiculoIterator.hasNext())
        {
            tmpVehiculo = vehiculoIterator.next();
            if(tmpVehiculo.rendimientoTotal() > vehiculoMejorRendimiento.rendimientoTotal())
            {
                vehiculoMejorRendimiento = tmpVehiculo;
            }
        }
        System.out.println(vehiculoMejorRendimiento.toString());
    }

    public void muestraPickups()
    {
        Iterator<Vehiculo> vehiculoIterator = vehiculos.listIterator();
        System.out.println("Pickups");
        Vehiculo tmpVehiculo;
        while(vehiculoIterator.hasNext())
        {
            tmpVehiculo = vehiculoIterator.next();
            if(tmpVehiculo instanceof Pickup)
            {
                System.out.println(tmpVehiculo.toString());
            }
        }
    }

    @Override
    public String toString()
    {
        Iterator<Vehiculo> vehiculoIterator = vehiculos.listIterator();
        String listaVehiuclos = "Lista Vehiculas\n";
        while(vehiculoIterator.hasNext())
        {
            listaVehiuclos += "\n" + vehiculoIterator.next().toString();
        }

        return listaVehiuclos;
    }
}
