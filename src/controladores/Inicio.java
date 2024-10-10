package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import dtos.VentaDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/*
 * Clase principal de la aplicacion
 * 10/10/2024
 * @author irodhan
 */
public class Inicio {
	public static List<ClienteDto> listaClientes = new ArrayList<>();
	public static List<VentaDto> listaVentas = new ArrayList<>();
	/*
	 * Método principal de la aplicacion
	 * 10/10/2024
	 * @author irodhan
	 */
	public static void main(String[] args) {
		//Objetos
		MenuInterfaz mI=new MenuImplementacion();
		//Variables
		int opcionSeleccionada=0;
		Boolean cerrarMenu=false;
		//Bucle do...while();
		do {
			//try{}catch(IOException io){}
			try {
				opcionSeleccionada=mI.mostrarMenuYSeleccion();
				switch(opcionSeleccionada) {
				case 0:
					System.out.println("[INFO] - Ha seleccionado la opcion 0");
					System.out.println("[INFO] -  Se va a cerrar la aplicacion");
					cerrarMenu=true;
					break;
				case 1:
					System.out.println("[INFO] - Ha seleccionado la opcion 1");
					System.out.println("[INFO] - Se va a mostrar el menu de la gerencia");
					mI.accederMenuGerencia();
					break;
				case 2:
					System.out.println("[INFO] - Ha seleccionado la opcion 2");
					System.out.println("[INFO] - Se va a mostrar el menu de los empleados");
					mI.accederMenuEmpleados();
					break;
				default:
					System.out.println("[INFO] - La opcion seleccionada no coincide con ninguna opcion mostrada anteriormente.");
					break;
				}
			}catch(Exception e) {
				System.out.println("[INFO] - Ha ocurrido un error.");
			}
		}while(!cerrarMenu);
	}

}
