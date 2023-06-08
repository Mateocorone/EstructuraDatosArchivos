import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class OrganizadorMedicinas {
    public OrganizadorMedicinas(){}

    public static void imprimir()
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Medicina> medicinas = new ArrayList<>();

        while (true) {
            System.out.print("Ingrese el nombre de la medicina (o 'salir' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equals("salir")) {
                break;
            }

            System.out.print("Ingrese la cantidad de la medicina: ");
            int cantidad = scanner.nextInt();

            System.out.print("Ingrese el precio de la medicina: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la fecha de caducidad de la medicina (dd/mm/yyyy): ");
            String fechaCaducidadString = scanner.next();
            Date fechaCaducidad = new Date(fechaCaducidadString);

            boolean encontrada = false;

            for (Medicina medicina : medicinas) {
                if (medicina.getNombre().equals(nombre)) {
                    medicina.setCantidad(medicina.getCantidad() + cantidad);
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                Medicina medicina = new Medicina(nombre, cantidad, precio, fechaCaducidad);
                medicinas.add(medicina);
            }

            scanner.nextLine();
        }

        System.out.println("Código\tNombre\tCantidad\tPrecio\tTotal\tFecha de caducidad");

        for (Medicina medicina : medicinas) {
            System.out.println(medicina.getCodigo() + "\t" + medicina.getNombre() + "\t" + medicina.getCantidad() + "\t" + medicina.getPrecio() + "\t" + medicina.getTotal() + "\t" + medicina.getFechaCaducidad());
        }
    }
}