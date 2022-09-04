/* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

public class Pago {
    private String Nombre;
    private String Apellido;
    private int Cedula;
    private String correo_electronico;
    private int Telefono;
    private String Departamento;
    private String Ciudad;
    private String Direccion;

    public Pago(String Nombre, String Apellido, int Cedula, String correo_electronico, int Telefono, String Departamento, String Ciudad, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.correo_electronico = correo_electronico;
        this.Telefono = Telefono;
        this.Departamento = Departamento;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Pago{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + Cedula + ", correo_electronico=" + correo_electronico + ", Telefono=" + Telefono + ", Departamento=" + Departamento + ", Ciudad=" + Ciudad + ", Direccion=" + Direccion + '}';
    }
    
    
}
