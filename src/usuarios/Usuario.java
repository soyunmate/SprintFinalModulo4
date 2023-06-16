package usuarios;

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements IAsesoria{
	private String nombre;
	private LocalDate fechaNacimiento;
	private String run;
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	


	public Usuario(String nombre, LocalDate fechaNacimiento2, String run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento2;
		this.run = run;
	}



	
	public int mostrarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }
	
	
	public void analizarUsuario() {
		System.out.println("Datos del " + this.getClass().getSimpleName());
		System.out.println("Nombre: " + nombre);
		System.out.println("RUN: " + run);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	
	
	
}
