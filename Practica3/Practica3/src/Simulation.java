import java.util.ArrayList;
import java.util.Scanner;


class Simulation {
    private static final int MAX_CLIENTS = 100;
    private static final int MAX_CAJEROS = 10;
    private static final int TEMPS_ARRIBADA = 15;
    private static int tempsTotal = 0;

    public static void main() {
        //@Deepseek
        Scanner scanner = new Scanner(System.in);
        int numClients = MAX_CLIENTS;

        System.out.print("Introdueix el numero de clients (valor por defecte " + MAX_CLIENTS + "): ");
        if (scanner.hasNextInt()) {
            numClients = scanner.nextInt();
            if (numClients <= 0 || numClients > MAX_CLIENTS) {
                System.out.println("Número invàlid. Usant valor por defecte.");
                numClients = MAX_CLIENTS;
            }
        } else {
            System.out.println("Entrada no vàlida. Valor por defecte.");
        }
        scanner.close();

        System.out.println("Simulant amb  " + numClients + " clients...");
        //Fins aquí
        for (int numCaixers = 1; numCaixers <= MAX_CAJEROS; numCaixers++) {
            tempsTotal = 0;
            ListCua<Cliente> colaClientes = new ListCua<>();
            ArrayList<Integer> cajeros = new ArrayList<>(MAX_CAJEROS);

            for (int i = 0; i < MAX_CAJEROS; i++) {
                cajeros.add(0);
            }

            Cliente[] clientes = new Cliente[numClients];

            for (int i = 0; i < numClients; i++) {
                int tempsArribadaClient = i * TEMPS_ARRIBADA;
                clientes[i] = new Cliente(tempsArribadaClient, 0);
                colaClientes.inserir((clientes[i]));

                int caixer = 0;
                int tempsMinim = cajeros.getFirst();

                for (int j = 1; j < numCaixers; j++) {
                    if (cajeros.get(j) < tempsMinim) {
                        tempsMinim = cajeros.get(j);
                        caixer = j;
                    }
                }
                Cliente cliente = colaClientes.treure();
                cliente.setStartTime(Math.max(tempsMinim, cliente.getEntryTime()));
                cajeros.set(caixer, cliente.getExitTime());
                tempsTotal += cliente.getTotalTime();
            }
            int tempsMitja = tempsTotal / numClients;
            System.out.println("Nombre de caixers:" + numCaixers + " El temps mitja ser atesos: " + tempsMitja + " per a el número de clients:" + numClients);
        }
    }
}



