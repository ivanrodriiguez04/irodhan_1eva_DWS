package dtos;
/*
 * Clase que contiene los dtos de los clientes
 * 10/10/2024
 * @author irodhan
 */
public class ClienteDto {

	//Variables
	private long idCliente;
	private String nombreCliente="aaaaa";
	private String apellidosCliente="aaaaa";
	//Constructores
	public ClienteDto(long idCliente, String nombreCliente, String apellidosCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
	}
	public ClienteDto() {
		super();
	}

	//Getters & Setters
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	
}
