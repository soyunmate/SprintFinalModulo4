package usuarios;

import java.time.LocalDate;

public class Administrativo extends Usuario{
	private String area;
	private int experienciaPrevia;
	
	public Administrativo() {
		super();
	}

	public Administrativo(String nombre, LocalDate fechaNacimiento, String run, String area, int experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Area: " + area);
		System.out.println("Experiencia previa: " + experienciaPrevia);;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(int experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
