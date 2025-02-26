
import java.util.Scanner;

public class Eleccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Costos que va a tener el  voto según el medio de influencia
        int costoInternet = 700000;
        int costoRadio = 200000;
        int costoTelevision = 600000;

        // Contadores de los votos que se esta recibiendo para cada candidato
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        // Contadores de votos por medio de influencia de cada candidato
        int votosInternet = 0;
        int votosRadio = 0;
        int votosTelevision = 0;

        // Costos de cada una de las campañas para cada candidato
        int costoCampaniaCandidato1 = 0;
        int costoCampaniaCandidato2 = 0;
        int costoCampaniaCandidato3 = 0;

        // Total de los votos conseguidos por los candidatos
        int totalVotos = 0;

        // Menú de opciones para realizar la eleccion del candidato por el cual se tiene preferencia
        int opcion;
        do {
            System.out.println("\n--- Menú de Elecciones del municipio Premier ---");
            System.out.println("\n 1. Votar por un candidatoal que desee apoyar");
            System.out.println("\n 2. Calcular el costo de la campaña de un candidato");
            System.out.println("\n 3. Vaciar todas las urnas de las elecciones");
            System.out.println("\n 4. Conocer el número total de votos para los candidatos en las elecciones ");
            System.out.println("\n 5. Porcentaje de votos obtenidos por cada candidato");
            System.out.println("\n 6. Costo promedio de campaña en las elecciones");
            System.out.println("\n 7. Se quiere salir y anular voto");
            System.out.print("Seleccione la opción que desea ejecutar: ");
            opcion = scanner.nextInt();

            // Menu de opciones para votar por el candidato de su preferencia
            switch (opcion) {
                case 1:
                    System.out.println("\n--- Votar por un candidato de su preferencia ---");
                    System.out.println("\n 1. Candidato numero 1");
                    System.out.println("\n 2. Candidato numero 2");
                    System.out.println("\n 3. Candidato numero 3");
                    System.out.print("\n Seleccione un candidato de su preferencia : ");
                    int candidato = scanner.nextInt();

                    // Menu de opciones para conocer el medio de influencia por el cual se da el voto
                    System.out.println("\n--- Medio de influencia del voto al candidato  ---");
                    System.out.println("1. Influencia por internet");
                    System.out.println("2. Influencia por radio");
                    System.out.println("3. Influencia por televisión");
                    System.out.print("Seleccione el medio de influencia del candidato: ");
                    int medio = scanner.nextInt();

                    switch (candidato) {
                        case 1:
                            votosCandidato1++;
                            break;
                        case 2:
                            votosCandidato2++;
                            break;
                        case 3:
                            votosCandidato3++;
                            break;
                        default:
                            System.out.println("Candidato no válido.");
                            break;
                    }

                    switch (medio) {
                        case 1:
                            votosInternet++;
                            break;
                        case 2:
                            votosRadio++;
                            break;
                        case 3:
                            votosTelevision++;
                            break;
                        default:
                            System.out.println("Medio no válido.");
                            break;
                    }

                    totalVotos++;
                    System.out.println("Voto registrado exitosamente.");
                    break;
                //Menu para conocer el costo de la campaña de cada uno de los candidatos
                case 2:
                    System.out.println("\n--- Calcular costo de campaña de un candidato ya sea el 1, 2 o el candidato 3 ---");
                    System.out.println("1. Candidato 1");
                    System.out.println("2. Candidato 2");
                    System.out.println("3. Candidato 3");
                    System.out.print("Seleccione un candidato: ");
                    int candidatoCosto = scanner.nextInt();

                    int costoCampania = 0;
                    switch (candidatoCosto) {
                        case 1:
                            costoCampania = votosCandidato1 * (votosInternet * costoInternet + votosRadio * costoRadio + votosTelevision * costoTelevision) / totalVotos;
                            break;
                        case 2:
                            costoCampania = votosCandidato2 * (votosInternet * costoInternet + votosRadio * costoRadio + votosTelevision * costoTelevision) / totalVotos;
                            break;
                        case 3:
                            costoCampania = votosCandidato3 * (votosInternet * costoInternet + votosRadio * costoRadio + votosTelevision * costoTelevision) / totalVotos;
                            break;
                        default:
                            System.out.println("Candidato no válido.");
                            break;
                    }

                    System.out.println("El costo de campaña del candidato " + candidatoCosto + " es: $" + costoCampania);
                    break;

                case 3:
                    votosCandidato1 = 0;
                    votosCandidato2 = 0;
                    votosCandidato3 = 0;
                    votosInternet = 0;
                    votosRadio = 0;
                    votosTelevision = 0;
                    totalVotos = 0;
                    System.out.println("Las Urnas han sido vaciadas exitosamente.");
                    break;

                case 4:
                    System.out.println("El número total de votos es: " + totalVotos);
                    break;

                case 5:
                    System.out.println("\n--- Porcentaje de votos obtenidos por cada candidato ---");
                    if (totalVotos > 0) {
                        double porcentajeCandidato1 = (votosCandidato1 * 100.0) / totalVotos;
                        double porcentajeCandidato2 = (votosCandidato2 * 100.0) / totalVotos;
                        double porcentajeCandidato3 = (votosCandidato3 * 100.0) / totalVotos;

                        System.out.println("Candidato 1: " + porcentajeCandidato1 + "%");
                        System.out.println("Candidato 2: " + porcentajeCandidato2 + "%");
                        System.out.println("Candidato 3: " + porcentajeCandidato3 + "%");
                    } else {
                        System.out.println("No hay votos registrados.");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Costo promedio de campaña en las elecciones ---");
                    if (totalVotos > 0) {
                        int costoTotalCampania = (votosInternet * costoInternet) + (votosRadio * costoRadio) + (votosTelevision * costoTelevision);
                        double costoPromedio = costoTotalCampania / (double) totalVotos;
                        System.out.println("El costo promedio de campaña es: $" + costoPromedio);
                    } else {
                        System.out.println("No hay votos registrados.");
                    }
                    break;

                case 7:
                    System.out.println("DE TODAS MANERAS SE SELECCIONARA COMO ALACALDE AL CANDIDATO CON EL MAYOR NUMERO DE VOTOS");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}