import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void menu()
    {
        System.out.println("=== MENU ===");
        System.out.println("0) Salir");
        System.out.println("1) Agregar elemento");
        System.out.println("2) Sacar elemento");
        System.out.println("3) Ver tope del elemento");
        System.out.print("Opcion: ");
    }
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        int userOption = 0;
        do
        {
            try
            {
                menu();
                userOption = kb.nextInt();
                kb.nextLine();

                switch(userOption)
                {
                    case 0:
                        System.out.println("Gracias por su tiempo! Hasta luego.");
                        return;
                    case 1:
                        System.out.print("Ingrese su nuevo elemento: ");
                        stack.push(kb.nextLine());
                        break;
                    case 2:
                        System.out.println("Se elimino el elemento " + stack.pop());
                        break;
                    case 3:
                        System.out.println("Al tope esta el elemento " + stack.top());
                        break;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Lo siento, la opcion no fue leida correctamente. Intentelo de nuevo");
            }
            catch (EmptyStackException e)
            {
                System.out.println("Lo siento, el stack no tiene elementos. Intente agregar elementos.");
            }
            catch (FullStackException e)
            {
                System.out.println("Lo siento, el stack esta lleno. Intente eliminar elementos.");
            }

        }while(userOption != 0);


    }
}
