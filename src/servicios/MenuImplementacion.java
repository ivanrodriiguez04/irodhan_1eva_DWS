package servicios;


import java.util.Scanner;

/*
 * Clase que contiene todos los metodos de los menus
 * 10/10/2024
 * @author irodhan
 */
public class MenuImplementacion implements MenuInterfaz{
	Scanner sc = new Scanner(System.in);
	@Override
	public int mostrarMenuYSeleccion() {
		int opcion=0;
		System.out.println("|------------------|");
		System.out.println("|       Menu       |");
		System.out.println("|------------------|");
		System.out.println("| 0. Cerrar App    |");
		System.out.println("| 1. Menu Gerencia |");
		System.out.println("| 2. Menu Empleado |");
		System.out.println("|------------------|");
		System.out.println("Introduzca la opcion deseada:");
		opcion=sc.nextInt();
		return opcion;
	}
	@Override
	public void accederMenuGerencia() {

		//Objeto
		GerenciaInterfaz gI=new GerenciaImplementacion();
		//Variables
		int opcion=0;
		Boolean cerrarMenu=true;
		
		do {
			try {
				opcion=mostrarMenuGerenciaYSeleccion();
				switch(opcion) 
				{
				case 0:
					System.out.println("[INFO] - Ha seleccionado la opcion 0");
					System.out.println("[INFO] - Va a volver al menu principal");
					cerrarMenu=true;
					break;
				case 1:
					System.out.println("[INFO] - Ha seleccionado la opcion 1");
					System.out.println("[INFO] - Ha seleccionado la opcion crear nuevo cliente");
					gI.crearNuevoCliente(controladores.Inicio.listaClientes);
					break;
				default:
					System.out.println("[INFO] - La opcion seleccionada no coincide con ninguna opcion mostrada anteriormente");
					break;
				}
			}catch(Exception e) {
				System.out.println("[INFO] - Ha ocurrido un error");
			}		
		}while(!cerrarMenu);
	}
	/*
	 * Metodo privado que muestra el submenu de la gerencia y obtiene la opcion indicada por el usuario
	 * 10/10/2024
	 * @author irodhan
	 */
	private int mostrarMenuGerenciaYSeleccion() 
	{
		int opcion=0;
		System.out.println("|------------------------|");
		System.out.println("|      Menu Gerencia     |");
		System.out.println("|------------------------|");
		System.out.println("| 0. Volver              |");
		System.out.println("| 1. Crear nuevo cliente |");
		System.out.println("|------------------------|");
		System.out.println("Introduzca la opcion deseada:");
		opcion=sc.nextInt();
		return opcion;
	}
	@Override
	public void accederMenuEmpleados() {
		EmpleadoInterfaz eI=new EmpleadoImplementacion();
		
		int opcion=0;
		Boolean cerrarMenu=true;
		
		do {
			try {
				opcion=mostrarMenuEmpleadosYSeleccion();
				switch(opcion) 
				{
				case 0:
					System.out.println("[INFO] - Ha seleccionado la opcion 0");
					System.out.println("[INFO] - Va a volver al menu principal");
					cerrarMenu=true;
					break;
				case 1:
					System.out.println("[INFO] - Ha seleccionado la opcion 1");
					System.out.println("[INFO] - Ha seleccionado la opcion Calculo Total de ventas mensuales");
					eI.calculoTotalVentas(controladores.Inicio.listaVentas);
					break;
				case 2:
					System.out.println("[INFO] - Ha seleccionado la opcion 2");
					System.out.println("[INFO] - Ha seleccionado la opcion Añadir compras a un cliente");
					eI.anadirCliente(controladores.Inicio.listaVentas);
					break;
				default:
					System.out.println("[INFO] - La opcion seleccionada no coincide con ninguna opcion mostrada anteriormente");
					break;
				}
			}catch(Exception e) {
				System.out.println("[INFO] - Ha ocurrido un error");
			}		
		}while(!cerrarMenu);
	}
	/*
	 * Metodo privado que muestra el submenu de los empleados y obtiene la opcion indicada por el usuario
	 * 10/10/2024
	 * @author irodhan
	 */
	private int mostrarMenuEmpleadosYSeleccion() 
	{
		int opcion=0;
		System.out.println("|------------------------|");
		System.out.println("|      Menu Gerencia     |");
		System.out.println("|------------------------|");
		System.out.println("| 0. Volver              |");
		System.out.println("| 1. Calculo total       |");
		System.out.println("| 2. Añadir compras      |");
		System.out.println("|------------------------|");
		System.out.println("Introduzca la opcion deseada:");
		opcion=sc.nextInt();
		return opcion;
	}

}
