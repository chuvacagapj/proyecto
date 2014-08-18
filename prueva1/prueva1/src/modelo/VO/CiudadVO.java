package modelo.VO;

/* esta clase es un Value Object por lo que su unica funcion es el paso de informacion por bloque entre
 * todas y cada una de las partes que necesiten de la informacion.
 * */

public class CiudadVO {

	// atributos

	private Integer clave;
	private String nombre;
	private Integer habitantes;

	// getters

	public Integer getClave() {
		return this.clave;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Integer getHabitantes() {
		return this.habitantes;
	}

	// setters

	public void setClave(Integer clave) {
		this.clave = clave;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHabitantes(Integer habitantes) {
		this.habitantes = habitantes;
	}
}
