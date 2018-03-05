import java.util.Scanner;
public class Main
{

    public static void menu()
    {
        System.out.println("Agencia de Vehiculos");
        System.out.println("0) Salir");
        System.out.println("1) Agregar carro");
        System.out.println("2) Eliminar carro");
        System.out.println("3) Obtener existencia");
        System.out.println("4) Vehiculos dentro presupuesto");
        System.out.println("5) Vehiculo de mejor rendimiento");
        System.out.println("6) Mostrar Pickups");
        System.out.println("7) Mostrar Vehiculos");
        System.out.print("Ingrese su opcion: ");
    }
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Agencia agencia = new Agencia();

        int option = 0;
        do
        {
            menu();
            option = kb.nextInt();
            kb.nextLine();

            switch (option)
            {
                case 0:
                    return;
                case 1:
                    System.out.println("TIPO DE VEHICULO");
                    System.out.println("1) Compacto");
                    System.out.println("2) Familiar");
                    System.out.println("3) Pickup");
                    System.out.print("Ingrese su opcion: ");

                    int tipo = kb.nextInt();
                    kb.nextLine();

                    String modelo;
                    String fabricante;
                    double capacidad;
                    double rendimiento;
                    double precio;

                    System.out.print("Modelo? ");
                    modelo = kb.nextLine();
                    System.out.print("Fabricante? ");
                    fabricante = kb.nextLine();
                    System.out.print("Capacidad? ");
                    capacidad = kb.nextDouble();
                    kb.nextLine();
                    System.out.print("Precio? ");
                    precio = kb.nextDouble();
                    kb.nextLine();

                    switch(tipo)
                    {
                        case 1:
                            String electricoStr;
                            boolean electrico = false;
                            System.out.print("Electrico (Y/y/N/n)? ");
                            electricoStr = kb.nextLine();
                            if(electricoStr.toUpperCase().equals("Y"))
                            {
                                electrico = true;
                                System.out.print("Rendimiento (Kwh/100 km)? ");
                            }
                            else
                            {
                                System.out.print("Rendimiento (Km/lt)? ");
                            }
                            rendimiento = kb.nextDouble();
                            kb.nextLine();


                            Compacto tmpCompacto = new Compacto(modelo, fabricante, capacidad, rendimiento, precio, electrico);
                            agencia.agregarCarro(tmpCompacto);
                            break;
                        case 2:
                            String dvdStr = "";
                            boolean dvd = false;
                            System.out.print("Rendimiento (Km/lt)? ");
                            rendimiento = kb.nextDouble();
                            kb.nextLine();
                            System.out.print("DVD (Y/y/N/n)? ");
                            dvdStr = kb.nextLine();
                            if(dvdStr.toUpperCase().equals("Y"))
                            {
                                dvd = true;
                            }
                            Familiar tmpFamiliar = new Familiar(modelo, fabricante, capacidad, rendimiento, precio, dvd);
                            agencia.agregarCarro(tmpFamiliar);
                            break;
                        case 3:
                            double ancho;
                            double alto;
                            double largo;
                            double capacidadCarga;

                            System.out.print("Rendimiento (Km/lt)? ");
                            rendimiento = kb.nextDouble();
                            kb.nextLine();

                            System.out.print("Ancho? ");
                            ancho = kb.nextDouble();
                            kb.nextLine();
                            System.out.print("Alto? ");
                            alto = kb.nextDouble();
                            kb.nextLine();
                            System.out.print("Largo? ");
                            largo = kb.nextDouble();
                            kb.nextLine();

                            System.out.print("Capacidad carga? ");
                            capacidadCarga = kb.nextInt();

                            Pickup tmpPickup = new Pickup(modelo, fabricante, capacidad, rendimiento, precio, ancho, largo, alto, capacidadCarga);
                            agencia.agregarCarro(tmpPickup);
                            break;
                    }
                    System.out.println("Vehiculo creado");
                    break;
                case 2:
                    System.out.print("Ingrese el modelo que desea eliminar: ");
                    modelo = kb.nextLine();
                    agencia.borraCarro(modelo);
                    break;
                case 3:
                    System.out.print("Ingrese el modelo que desea encontrar: ");
                    modelo = kb.nextLine();
                    agencia.existencia(modelo);
                    break;
                case 4:
                    System.out.print("Ingrese su presupuesto? ");
                    double presupuesto = kb.nextDouble();
                    agencia.carrosAdquiribles(presupuesto);
                    break;
                case 5:
                    agencia.mejorRendimiento();
                    break;
                case 6:
                    agencia.muestraPickups();
                    break;
                case 7:
                    System.out.println(agencia.toString());
                    break;


            }
        }
        while(option != 0);

        kb.close();

    }
}
