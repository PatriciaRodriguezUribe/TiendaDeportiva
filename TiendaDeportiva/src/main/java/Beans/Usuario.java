
package Beans;


public class Usuario {
    private String username;
    private String contrasena;
    private String Nombre;
    private String Apellido;
    private int Cedula;
    private String correo_electronico;
    private int Telefono;
    private String Departamento;
    private String Ciudad;
    private String Direccion;
    private double cuenta_saldo;
    private boolean bonos;

    public Usuario(String username, String contrasena, String Nombre, String Apellido, int Cedula, String correo_electronico, int Telefono, String Departamento, String Ciudad, String Direccion, double cuenta_saldo, boolean bonos) {
        this.username = username;
        this.contrasena = contrasena;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.correo_electronico = correo_electronico;
        this.Telefono = Telefono;
        this.Departamento = Departamento;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.cuenta_saldo = cuenta_saldo;
        this.bonos = bonos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public double getCuenta_saldo() {
        return cuenta_saldo;
    }

    public void setCuenta_saldo(double cuenta_saldo) {
        this.cuenta_saldo = cuenta_saldo;
    }

    public boolean isBonos() {
        return bonos;
    }

    public void setBonos(boolean bonos) {
        this.bonos = bonos;
    }

    @Override
    public String toString() {
        return "usuario{" + "username=" + username + ", contrasena=" + contrasena + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + Cedula + ", correo_electronico=" + correo_electronico + ", Telefono=" + Telefono + ", Departamento=" + Departamento + ", Ciudad=" + Ciudad + ", Direccion=" + Direccion + ", cuenta_saldo=" + cuenta_saldo + ", bonos=" + bonos + '}';
    }


    

}
