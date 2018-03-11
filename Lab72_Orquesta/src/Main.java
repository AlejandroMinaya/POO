import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void menu()
    {
        System.out.println("==== MENU ====");
        System.out.println("0) Salir");
        System.out.println("1) Agregar Instrumento");
        System.out.println("2) Eliminar Instrumento");
        System.out.println("3) Enlistar instrumentos");
        System.out.println("4) Obtener costo de la orquesta");
        System.out.println("5) Checar lugar en la orquesta");
        System.out.println("6) Mostrar Saxofones Sopranos");
        System.out.println("7) Tocar un instrumento");
        System.out.println("8) Afinar un instrumento");
        System.out.print("Ingrese su opcion: ");
    }
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Orquesta orquesta = new Orquesta();

        int mainMenuOption = 0;
        do{
            try
            {
                menu();
                mainMenuOption = kb.nextInt();
                kb.nextLine();

                switch(mainMenuOption)
                {
                    case 0:
                        System.out.println("Hasta luego!");
                        return;
                    case 1:
                        Instrumento tmpAdd;
                        System.out.println("=== AGREGAR INSTRUMENTO ===");
                        System.out.println("1) Violin");
                        System.out.println("2) Saxofon");
                        System.out.print("Ingrese el tipo de instrumento que deseas agregar: ");
                        int tipoInstrumento = kb.nextInt();
                        kb.nextLine();
                        System.out.print("Ingrese el lugar que debe ocupar en la orquesta: ");
                        int lugarOrquesta = kb.nextInt();
                        kb.nextLine();
                        System.out.print("Ingrese el costo del instrumento: ");
                        double costoInstrumento = kb.nextDouble();
                        kb.nextLine();
                        if(tipoInstrumento == 2)
                        {
                            System.out.println("=== AGREGAR SAXOFON ===");
                            System.out.println("1) Tenor");
                            System.out.println("2) Soprano");
                            System.out.println("3) Baritono");

                            int tipoSaxofon = kb.nextInt() - 1;
                            kb.nextLine();
                            tmpAdd = new Saxofon(lugarOrquesta, costoInstrumento, tipoSaxofon);
                        }
                        else
                        {
                            tmpAdd = new Violin(lugarOrquesta, costoInstrumento);
                        }
                        orquesta.agregar(tmpAdd);
                        break;
                    case 2:
                        System.out.print("Ingrese el codigo del instrumento a eliminar: ");
                        orquesta.borrar(kb.nextLine());
                        break;
                    case 3:
                        System.out.println(orquesta.toString());
                        break;
                    case 4:
                        System.out.println("El costo total es de $" + orquesta.costoTotal());
                        break;
                    case 5:
                        System.out.print("Ingrese el lugar a checar de la orquesta: ");
                        boolean existe = orquesta.checarLugar(kb.nextInt());
                        kb.nextLine();
                        if(existe)
                        {
                            System.out.println("Existe un instrumento ocupando ese lugar.");
                        }
                        else
                        {
                            System.out.println("No existe un instrumento ocupando ese lugar.");
                        }
                        break;
                    case 6:
                        orquesta.saxofonesSopranos();
                        break;
                    case 7:
                        System.out.print("Ingrese el codigo del instrumento a tocar: ");
                        Instrumento tmpTocar = orquesta.findInstrumento(kb.nextLine());
                        if(tmpTocar != null)
                        {
                            tmpTocar.tocar();
                        }
                        else
                        {
                            System.out.println("Instrumento no encontrado");
                        }
                        break;
                    case 8:
                        System.out.print("Ingrese el codigo del instrumento a afinar: ");
                        Instrumento tmpAfinar = orquesta.findInstrumento(kb.nextLine());
                        if(tmpAfinar != null)
                        {
                            tmpAfinar.afinar();
                        }
                        else
                        {
                            System.out.println("Instrumento no encontrado");
                        }
                        break;
                }

            }catch(InputMismatchException e)
            {
                System.out.println("Surgio un error. Intentelo de nuevo por favor.");
            }
        }while(mainMenuOption != 0);


        kb.close();
    }
}
