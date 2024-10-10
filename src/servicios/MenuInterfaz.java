package servicios;
/*
 * Interfaz que hace la llamada a los metodos del menu
 * 10/10/2024
 * @author irodhan
 */
public interface MenuInterfaz {
	/*
	 * Metodo que muestra el menu principal y obtiene la indicacion del usuario
	 * 10/10/2024
	 * @author irodhan
	 */
	public int mostrarMenuYSeleccion();
	/*
	 * Metodo que accede al submenu de la gerencia
	 * 10/10/2024
	 * @author irodhan
	 */
	public void accederMenuGerencia();
	/*
	 * Metodo que accede al submenu de los empleados
	 * 10/10/2024
	 * @author irodhan
	 */
	public void accederMenuEmpleados();
}
