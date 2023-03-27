public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(17);
        persona1.setNombre("Daniel");
        persona1.setTelefono(606711110);
        int Edad = persona1.getEdad();
        String Nombre = persona1.getNombre();
        int Telefono = persona1.getTelefono();
        System.out.println(Edad);
        System.out.println(Nombre);
        System.out.println(Telefono);
    }
}

class Persona {
    private int Edad;
    private String Nombre;
    private int Telefono;

    public void setEdad(int valor) {
        this.Edad = valor;
    }
    public int getEdad() {
        return this.Edad;
    }
    public void setNombre(String valor) {
        this.Nombre = valor;
    }
    public String getNombre() {
        return this.Nombre;
    }
    public void setTelefono(int valor) {
        this.Telefono = valor;
    }
    public int getTelefono() {
        return this.Telefono;
    }
}