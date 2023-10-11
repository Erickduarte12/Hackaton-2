class Contacto {
        private String nombre;
        private String apellido;
        private String telefono;

        public Contacto(String nombre, String apellido, String telefono) {
            this.nombre = nombre.toLowerCase();
            this.apellido = apellido.toLowerCase();
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
            return telefono;
        }



        @Override
        public boolean equals(Object obj) {
                if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Contacto contacto = (Contacto) obj;
            return nombre.equals(contacto.nombre) && apellido.equals(contacto.apellido);
        }
}
