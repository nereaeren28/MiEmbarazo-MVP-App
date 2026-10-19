import java.util.ArrayList;
import java.util.List;

// Clase principal para ejecutar el MVP de MiEmbarazo
public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIALIZANDO MVP: MiEmbarazo ===");
        
        // Simulación de entidades del sistema
        Especialista esp1 = new Especialista(1, "Dra. Ana Gómez", "Ginecología");
        CitaMedica cita1 = new CitaMedica(1, "2026-05-10", "Eco de control", "Dra. Ana Gómez");
        RegistroDiario reg1 = new RegistroDiario("2026-04-06", 65.5, "Sin molestias, energía normal.");

        // Mostrar por consola los datos del MVP funcionales
        System.out.println("\n[1] Especialista asignado:");
        esp1.mostrarDetalles();

        System.out.println("\n[2] Próxima Cita Médica:");
        cita1.mostrarDetalles();

        System.out.println("\n[3] Registro Diario de la Usuaria:");
        reg1.mostrarDetalles();
        
        System.out.println("\n=== MVP FUNCIONANDO CORRECTAMENTE ===");
    }
}

// Clase Especialista
class Especialista {
    private int id;
    private String nombre;
    private String especialidad;

    public Especialista(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarDetalles() {
        System.out.println("Dr/Dra: " + nombre + " (" + especialidad + ")");
    }
}

// Clase CitaMedica
class CitaMedica {
    private int id;
    private String fecha;
    private String motivo;
    private String especialista;

    public CitaMedica(int id, String fecha, String motivo, String especialista) {
        this.id = id;
        this.fecha = fecha;
        this.motivo = motivo;
        this.especialista = especialista;
    }

    public void mostrarDetalles() {
        System.out.println("Fecha: " + fecha + " | Motivo: " + motivo + " | Con: " + especialista);
    }
}

// Clase RegistroDiario
class RegistroDiario {
    private String fecha;
    private double peso;
    private String notas;

    public RegistroDiario(String fecha, double peso, String notas) {
        this.fecha = fecha;
        this.peso = peso;
        this.notas = notas;
    }

    public void mostrarDetalles() {
        System.out.println("Fecha: " + fecha + " | Peso: " + peso + " kg | Notas: " + notas);
    }
}