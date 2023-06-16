package actividades;

public class Accidente extends Actividad {

	private String origen;
	private String consecuencias;

	public Accidente() {
		super();
	}

	public Accidente(int idActividad, String rutCliente, String dia, String hora, String lugar, String origen,
			String consecuencias) {
		super(idActividad, rutCliente, dia, hora, lugar);
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [origen=" + origen + ", consecuencias=" + consecuencias + ", toString()=" + super.toString()
				+ "]";
	}

}
