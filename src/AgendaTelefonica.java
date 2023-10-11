import java.util.ArrayList;
import java.util.List;

class AgendaTelefonica {
    public List<Contacto> listaContactos;
    private int capacidad;

    // Constructores
    public AgendaTelefonica() {
        this(10); // Tamaño por defecto
    }
    public AgendaTelefonica(int capacidad) {
        this.capacidad = capacidad;
        this.listaContactos = new ArrayList<>(capacidad);
    }

    public void añadirContacto(Contacto c) {
        if (!agendaLlena() && !listaContactos.contains(c)) {
            listaContactos.add(c);
            System.out.println("Contacto añadido: " + c.getNombre());
        } else {
            System.out.println("No se pudo agregar el contacto. La agenda está llena o el contacto ya existe.");
        }
    }

    public boolean agendaLlena() {
        return listaContactos.size() >= capacidad;
    }

    public void listarContactos() {
        System.out.println("Lista de contactos:");
        for (Contacto c : listaContactos) {
            System.out.println(c.getNombre() + " - " + c.getApellido() +  " - "  + c.getTelefono());
        }
    }

    public void buscaContacto(String nombre) {
        for (Contacto c : listaContactos) {
            if (c.getNombre().equals(nombre)) {
                System.out.println(c.getNombre() +" - "+ c.getApellido() +" - "+ c.getTelefono());
            }else {
                System.out.println("Contacto no encontrado");
            }
        }
    }

    public boolean eliminarContacto(Contacto c){
        if (listaContactos.remove(c)){
            System.out.println("Contacto eliminado " + c.getNombre());
            return true;
        }else {
            System.out.println("Contacto no existe ");
            return false;
        }
    }

    public int espaciosLibres(){
        return capacidad - listaContactos.size();
    };
}
