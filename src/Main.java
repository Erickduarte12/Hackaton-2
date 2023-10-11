public class Main {
    public static void main(String[] args) {

        /*Creacion Agenda telefonica*/
        AgendaTelefonica miAgenda = new AgendaTelefonica(10);

        /*Creacion de mis contactos*/
        Contacto contacto1 = new Contacto("Bryan","Andres");
        Contacto contacto2 = new Contacto("Erick","Duarte");
        Contacto contacto3 = new Contacto("Jasmin","LLeras");

        /*Añadir contactos a la agenda*/
        miAgenda.añadirContacto(contacto1);
        miAgenda.añadirContacto(contacto2);
        miAgenda.añadirContacto(contacto1);

        /*Listar contactos*/
        miAgenda.listarContactos();

        /*Buscar contactos*/
        System.out.println(miAgenda.buscaContacto("Erick"));
    }
}