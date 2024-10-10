package servicios;

import java.util.List;

import dtos.ClienteDto;

/*
 * Interfaz que contiene la llamada de los metodos de la gerencia
 * 10/10/2024
 * @author irodhan
 */
public interface GerenciaInterfaz {

	/*
	 * Metodo que crea un nuevo cliente
	 * 10/10/2024
	 * @author irodhan
	 */
	public void crearNuevoCliente(List<ClienteDto> listaClientes);
}
