package Utils;

import java.time.LocalDate;
import java.util.List;

import dtos.ClienteDto;
import dtos.VentaDto;

/*
 * Clase que contiene las utilidades de la aplicacion
 * 10/10/2024
 * @author irodhan
 */
public class Util {
	/*
	 * Metodo que genera la id del cliente de forma autoincrementada
	 * 10/10/2024
	 * @author irodhan
	 */
	public static long asigarIdCliente() {
		long id;
		List<ClienteDto> nuevaLista=controladores.Inicio.listaClientes;
		int tamanyoLista = nuevaLista.size();
		if (tamanyoLista > 0) {
			id = nuevaLista.get(tamanyoLista - 1).getIdCliente() + 1;
		} else {
			id=1;
		}
		return id;
	}
	/*
	 * Metodo que genera la id de la venta de forma autoincrementada
	 * 10/10/2024
	 * @author irodhan
	 */
	public static long asigarIdVenta() {
		long id;
		List<VentaDto> nuevaLista=controladores.Inicio.listaVentas;
		int tamanyoLista = nuevaLista.size();
		
		if (tamanyoLista > 0) {
			id = nuevaLista.get(tamanyoLista - 1).getIdVenta() + 1;
		} else {
			id = 1;
		}
		return id;
	}
}
