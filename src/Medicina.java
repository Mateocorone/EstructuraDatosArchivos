import java.util.Date;

public class Medicina {
    private static int contador = 1;
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private Date fechaCaducidad;

    public Medicina(String nombre, int cantidad, double precio, Date fechaCaducidad) {
        this.codigo = String.format("#%03d", contador++);
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getTotal() {
        return cantidad * precio;
    }
}