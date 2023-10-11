import java.util.ArrayList;
import java.util.List;

class AgendaTelefonica {
    private List<Contacto> listaContactos;
    private int capacidad;

    public AgendaTelefonica() {
        this(10); // Tamaño por defecto
    }

    public AgendaTelefonica(int capacidad) {
        this.capacidad = capacidad;
        this.listaContactos = new ArrayList<>(capacidad);
    }

    /*public void añadirContacto(Contacto c) {
        if (!agendaLlena() && !contactos.contains(c)) {
            contactos.add(c);
            System.out.println("Contacto añadido: " + c.getNombre());
        } else {
            System.out.println("No se pudo agregar el contacto. La agenda está llena o el contacto ya existe.");
        }
    }*/
}
