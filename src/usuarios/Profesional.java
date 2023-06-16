package usuarios;

import java.time.LocalDate;

public class Profesional extends Usuario{
	private String titulo;
	private LocalDate fechaIngreso;
	
	public Profesional() {
		super();
	}
	
	public Profesional(String nombre, LocalDate fechaNacimiento, String run, String titulo, LocalDate fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Titulo: " + titulo);
		System.out.println("Fecha de ingreso: " + fechaIngreso);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
