package actividades;

public class Capacitacion extends Actividad {
	private int duracion;
	private int cantidadAsistentes;

	public Capacitacion() {
		super();
	}

	public Capacitacion(int idActividad, String rutCliente, String dia, String hora, String lugar, int duracion,
			int cantidadAsistentes) {
		super(idActividad, rutCliente, dia, hora, lugar);
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public String mostrarDetalle() {
		return "La capacitacion sera en " + getLugar() + " a las " + getHora() + " del dia " + getDia() + " y durará "
				+ getDuracion() + " minutos";
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [duracion=" + duracion + ", cantidadAsistentes=" + cantidadAsistentes + ", toString()="
				+ super.toString() + "]";
	}

}
