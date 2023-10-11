import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Contacto contacto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu agenda ¿Que deseas hacer hoy?");
        System.out.println("0, Para salir");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Mostrar mis contactos");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Buscar contacto");
        System.out.println("5. Espacios disponibles");

        int eleccion = sc.nextInt();
        AgendaTelefonica miAgenda = new AgendaTelefonica();

        do {
            switch (eleccion){
                case 1 :
                    System.out.println("Ingrese nombre");
                    String datoNombre = sc.next();
                    System.out.println("Ingres Apellido");
                    String datoApellido = sc.next();
                    System.out.println("Ingrese Telefono");
                    String datoTelefono = sc.next();
                    contacto = new Contacto(datoNombre,datoApellido,datoTelefono);
                    System.out.println(contacto.getNombre());
                    miAgenda.añadirContacto(contacto);
                    break;
                case 2 :
                    System.out.println("Estos son tus contactos actuales");
                    miAgenda.listarContactos();
                    break;
                case 3 :
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = sc.next();
                    System.out.print("Apellido del contacto a eliminar: ");
                    String apellidoEliminar = sc.next();
                    Contacto contactoEliminar = new Contacto(nombreEliminar.toLowerCase(), apellidoEliminar.toLowerCase(), "");
                    miAgenda.eliminarContacto(contactoEliminar);
                    break;
                case 4 :
                    System.out.print("Nombre del contacto a buscar: ");
                    String nombreBuscar = sc.next();
                    miAgenda.buscaContacto(nombreBuscar.toLowerCase());
                    break;
                case 5 :
                    System.out.println("Espacios disponibles :" + miAgenda.espaciosLibres());
                    break;
            }
            System.out.println("Escoge otra opcion");
            eleccion = sc.nextInt();
        }while (eleccion != 0 && eleccion >= 0 && eleccion < 6);

        System.out.println("Adios");

    }
}