public class Main {
    public static void main(String[] args) {
        System.out.println("Hola equipo ganador");
        Contacto contacto1 =  new Contacto("Juan", "Pérez");

        Contacto[] personas = new Contacto[10];
        personas[0] = new Contacto("Juan", "Pérez");
        personas[1] = new Contacto("María", "González");
        personas[2] = new Contacto("Carlos", "Rodríguez");
        personas[3] = new Contacto("Ana", "López");
        personas[4] = new Contacto("Luis", "Martínez");
        personas[5] = new Contacto("Laura", "Hernández");
        personas[6] = new Contacto("Pedro", "Sánchez");
        personas[7] = new Contacto("Elena", "Ramírez");
        personas[8] = new Contacto("Javier", "Torres");
        personas[9] = new Contacto("Sofía", "Díaz");

        contacto1.equals(personas);
    }
}