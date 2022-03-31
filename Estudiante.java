
package Estudiante;

public class Estudiante {
    int edad=0;
    String nombres;
    String apellidos;
    String direccion;
    int carnet;
    
  
    
    
    public Estudiante(){
        
    }

    public Estudiante(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Estudiante(String nombres, String apellidos, String direccion, int carnet) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.carnet = carnet;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    
    
    
}
