import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegisEmpleado {
    public static void main(String[] args) {
        ArrayList<Empleado>empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("Ingrese el id de empleado");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el nombre de empleado");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido de empleado");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese el departamento de empleado");
            String departamento = scanner.nextLine();

            System.out.println("Ingrese salario de empleado");
            Double salario = scanner.nextDouble();
            scanner.nextLine();

            Empleado empleado = new Empleado(id,nombre,apellido,departamento,salario);
            empleados.add(empleado);

            System.out.println("¿Desea ingresar otro empleado? (s/n/:");
            String respuesta = scanner.nextLine();
            if(respuesta.equalsIgnoreCase("n")){
                continuar = false;
            }
        }
        System.out.println("Empleados registrados");
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()){
            Empleado empleado = iterator.next();
            System.out.println(empleado);
        }
    }
}
