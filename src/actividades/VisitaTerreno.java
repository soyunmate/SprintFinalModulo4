package actividades;

import java.util.ArrayList;
import java.util.List;

public class VisitaTerreno extends Actividad {
	private String comentarios;
	private List<Revision> listaRevisiones;

	public VisitaTerreno() {
		super();
		this.listaRevisiones = new ArrayList<Revision>();
	}

	public VisitaTerreno(int idActividad, String rutCliente, String dia, String hora, String lugar, String comentarios,
			List<Revision> listaRevisiones) {
		super(idActividad, rutCliente, dia, hora, lugar);
		this.comentarios = comentarios;
		this.listaRevisiones = listaRevisiones;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public List<Revision> getListaRevisiones() {
		return listaRevisiones;
	}

	public void setListaRevisiones(List<Revision> listaRevisiones) {
		this.listaRevisiones = listaRevisiones;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [comentarios=" + comentarios + ", listaRevisiones=" + listaRevisiones + ", toString()="
				+ super.toString() + "]";
	}

}
