package pe.egcc.model;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String email;

    public Estudiante() {
        nombre = "Gustavo";
        apellido = "Coronel";
        edad = 30;
        email = "gcoronel@gmail.com";
        casado = true;
    }

    public Estudiante(String nombre, String apellido, int edad, boolean casado, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.email = email;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        String report = "";
        report += "Nomnbre: " + nombre + "\n";
        report += "Apellido: " + apellido + "\n";
        report += "Edad: " + edad + "\n";
        report += "Email: " + email + "\n";
        report += "Casado: " + casado + "\n";
        
        return report;
    }
    
    //destructor
    //@Override
    
    
}
