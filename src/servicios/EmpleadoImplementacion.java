package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;

/*
 * Clase que contiene todos los metodos de los empleados
 * 10/10/2024
 * @author irodhan
 */
public class EmpleadoImplementacion  implements EmpleadoInterfaz{

	Scanner sc= new Scanner(System.in);
	@Override
	public void anadirCliente(List<VentaDto> listaVentas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculoTotalVentas(List<VentaDto> listaVentas) {
		VentaDto venta=new VentaDto();
		System.out.println("Introduzca el mes y año que desee: (MM-yyyy)");
		String fechaIndicada=sc.next();
		if(venta.getFechaVenta().toString().equals(fechaIndicada)) 
		{
			for(VentaDto  vent :  listaVentas)
			{
				int aux;
			}
		}
	}

}
