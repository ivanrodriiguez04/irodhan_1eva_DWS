package servicios;

import java.util.List;
import java.util.Scanner;

import Utils.Util;
import dtos.ClienteDto;

/*
 * Clase que contiene los metodos de la gerencia
 * 10/10/2024
 * @author irodhan
 */
public class GerenciaImplementacion implements GerenciaInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void crearNuevoCliente(List<ClienteDto> listaClientes) {
		String respuesta;
		do {
		ClienteDto nuevoCliente = new ClienteDto();
		nuevoCliente = crearCliente();
		listaClientes.add(nuevoCliente);
		System.out.println("Quiere añadir otro cliente (si=s || no=n):");
		respuesta=sc.next();
		}while(respuesta.equals("s"));
	}

	private ClienteDto crearCliente() {

		ClienteDto cliente = new ClienteDto();
		System.out.println("Introduzca sus apellidos: ");
		cliente.setApellidosCliente(sc.nextLine());
		cliente.setIdCliente(Utils.Util.asigarIdCliente());
		System.out.println("Introduzca su nombre: ");
		cliente.setNombreCliente(sc.next());	
		return cliente;
	}

}
