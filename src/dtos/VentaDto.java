package dtos;

import java.time.LocalDate;

public class VentaDto {

	//Variables
	private long idVenta;
	private LocalDate fechaVenta;
	private double precioVenta=0.0;
	//Constructores
	public VentaDto(long idVenta, LocalDate fechaVenta, double precioVenta) {
		super();
		this.idVenta = idVenta;
		this.fechaVenta = fechaVenta;
		this.precioVenta = precioVenta;
	}
	//Getters & Setters
	public VentaDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
}
