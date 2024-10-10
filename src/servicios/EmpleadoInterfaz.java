package servicios;

import java.util.List;

import dtos.VentaDto;

/*
 * Interfaz que hace la llamada a los metodos de los empleados
 * 10/10/2024
 * @author irodhan
 */
public interface EmpleadoInterfaz {

	/*
	 * Metodo que añade un pedido al cliente
	 * 10/10/2024
	 * @author irodhan
	 */
	public void anadirCliente(List<VentaDto> listaVentas);
	/*
	 * Metodo que calcula el total de ventas del mes indicado
	 * 10/10/2024
	 * @author irodhan
	 */
	public void calculoTotalVentas(List<VentaDto> listaVentas);
}
