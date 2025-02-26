import java.util.Scanner;
// Ejercicio desarrollado por Sergio Daniel Castellanos Rodrigue
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op, opcion, cantidad = 0, m20 = 0, m50 = 0, m100 = 0, m200 = 0, m500 = 0;
        int cantidad20, cantidad50, cantidad100, cantidad200, cantidad500;
        
        do {
            System.out.println("1. Agregar monedas.");
            System.out.println("2. Contar Monedas.");
            System.out.println("3. Totalizar");
            System.out.println("4. Romper Alcancía.");
            System.out.println("5. Salir.");
            System.out.print("Ingrese la opción deseada: ");
            op = teclado.nextInt();
            
            switch (op) {
                case 1: // agregar monedas
                    System.out.println("1. $20");
                    System.out.println("2. $50");
                    System.out.println("3. $100");
                    System.out.println("4. $200");
                    System.out.println("5. $500");
                    System.out.print("Selecciona la denominación a ingresar: ");
                    opcion = teclado.nextInt();
                    
                    switch (opcion) {
                        case 1:
                            System.out.print("Digita la cantidad a ingresar: ");
                            cantidad20 = teclado.nextInt();
                            m20 += cantidad20;
                            break;
                        case 2:
                            System.out.print("Digita la cantidad a ingresar: ");
                            cantidad50 = teclado.nextInt();
                            m50 += cantidad50;
                            break;
                        case 3:
                            System.out.print("Digita la cantidad a ingresar: ");
                            cantidad100 = teclado.nextInt();
                            m100 += cantidad100;
                            break;
                        case 4:
                            System.out.print("Digita la cantidad a ingresar: ");
                            cantidad200 = teclado.nextInt();
                            m200 += cantidad200;
                            break;
                        case 5:
                            System.out.print("Digita la cantidad a ingresar: ");
                            cantidad500 = teclado.nextInt();
                            m500 += cantidad500;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                    
                case 2: // contar por denominación
                    System.out.println("$20: " + m20);
                    System.out.println("$50: " + m50);
                    System.out.println("$100: " + m100);
                    System.out.println("$200: " + m200);
                    System.out.println("$500: " + m500);
                    break;
                    
                case 3: // totalizar
                    System.out.println("Tienes un total de $" + ((m20 * 20) + (m50 * 50) + (m100 * 100) + (m200 * 200) + (m500 * 500)));
                    break;
                    
                case 4: // romper alcancía
                    System.out.println("Alcancía rota :(");
                    // No se reinician las variables, por lo que las monedas siguen contabilizadas
                    break;
                    
                case 5: // salir
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }
        } while (op != 5);
    }
}
// Ejercicio desarrollado por Sergio Daniel Castellanos Rodrigue