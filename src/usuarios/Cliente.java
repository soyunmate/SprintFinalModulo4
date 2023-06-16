package usuarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import actividades.Accidente;
import actividades.Capacitacion;
import actividades.VisitaTerreno;

public class Cliente extends Usuario {
	private String rut;
	private String nombres;
	private String apellidos;
	private int telefono;
	private int sistemaDeSalud;
	private String direccion;
	private String comuna;
	private int edad;
	private List<Capacitacion> listaCapacitaciones;
	private List<Accidente> listaAccidentes;
	private List<VisitaTerreno> listaVisistasTerreno;
	
	
	public Cliente() {
		super();
		this.listaCapacitaciones = new ArrayList<Capacitacion>();
		this.listaAccidentes = new ArrayList<Accidente>();
		this.listaVisistasTerreno = new ArrayList<VisitaTerreno>();
	}

	

	public Cliente(String nombre, LocalDate fechaNacimiento, String run, String rut, String nombres, String apellidos,
			int telefono, int sistemaDeSalud, String direccion, String comuna, int edad,
			List<Capacitacion> listaCapacitaciones, List<Accidente> listaAccidentes,
			List<VisitaTerreno> listaVisistasTerreno) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.sistemaDeSalud = sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.listaCapacitaciones = listaCapacitaciones;
		this.listaAccidentes = listaAccidentes;
		this.listaVisistasTerreno = listaVisistasTerreno;
		
		
	}
	
	public String obtenerNombre() {
		return nombres + " " + apellidos;
	}
	
	public void obtenerSistemaSalud() {
		if(sistemaDeSalud == 1) {
			System.out.println("Fonasa");
		} else if (sistemaDeSalud == 2) {
			System.out.println("Isapre");
		}
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Direccion: " + direccion);
		System.out.println("Comuna: " + comuna);
	}



	public String getRut() {
		return rut;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public int getSistemaDeSalud() {
		return sistemaDeSalud;
	}



	public void setSistemaDeSalud(int sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getComuna() {
		return comuna;
	}



	public void setComuna(String comuna) {
		this.comuna = comuna;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public List<Capacitacion> getListaCapacitaciones() {
		return listaCapacitaciones;
	}



	public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
		this.listaCapacitaciones = listaCapacitaciones;
	}



	public List<Accidente> getListaAccidentes() {
		return listaAccidentes;
	}



	public void setListaAccidentes(List<Accidente> listaAccidentes) {
		this.listaAccidentes = listaAccidentes;
	}



	public List<VisitaTerreno> getListaVisistasTerreno() {
		return listaVisistasTerreno;
	}



	public void setListaVisistasTerreno(List<VisitaTerreno> listaVisistasTerreno) {
		this.listaVisistasTerreno = listaVisistasTerreno;
	}



	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", sistemaDeSalud=" + sistemaDeSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad="
				+ edad + ", listaCapacitaciones=" + listaCapacitaciones + ", listaAccidentes=" + listaAccidentes
				+ ", listaVisistasTerreno=" + listaVisistasTerreno + ", toString()=" + super.toString() + "]";
	}
	
	

	
}
