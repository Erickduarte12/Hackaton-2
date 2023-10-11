class Contacto {
        private String nombre;
        private String apellido;
        private String telefono = "3112535030";

        public Contacto(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
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
            System.out.println(contacto);
            return nombre.equals(contacto.nombre) && apellido.equals(contacto.apellido);
        }
}
