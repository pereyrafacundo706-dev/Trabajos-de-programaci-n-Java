package clases;

public abstract class Edificio {

	
	private String nombre;
	private int id;
	private String direccion;
	private int codPostal;
	private int anioConstruccion;
	private double superficieTotal;
	private String propietario;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public int getAnioConstruccion() {
		return anioConstruccion;
	}

	public void setAnioConstruccion(int anioConstruccion) {
		this.anioConstruccion = anioConstruccion;
	}

	public double getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(double superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public Edificio(String nombre, int id, String direccion, int codPostal, int anioConstruccion, double superficieTotal,
			String propietario) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.anioConstruccion = anioConstruccion;
		this.superficieTotal = superficieTotal;
		this.propietario = propietario;
	}

}
