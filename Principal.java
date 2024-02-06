//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;
public class Principal{
	public static void main(String[] arg){
		Usuario[] usuario = pedir();
		for(int i = 0; i < usuario.length; i++){
			System.out.println("\n");
			System.out.println((i+1) + "º Usuario: ");
			System.out.println("Nombre: " + usuario[i].nombre);
			System.out.println("Apellido: " + usuario[i].apellido);
			System.out.println("Email: " + usuario[i].email);
		}
			
	}
	public static Usuario[] pedir(){
		Scanner teclado = new Scanner(System.in);
		boolean valido = false;
		int cantidad = 0;
		try{
			System.out.println("Introduce una cantidad de usuarios: ");
			cantidad = Integer.parseInt(teclado.nextLine().trim()); 
			valido = true;
		}catch(Exception e){
			System.out.println("No es un numero");
		}

		Usuario[] usuarios = new Usuario[cantidad];
		if(valido){
			for(int i = 0; i < cantidad; i++){
				Usuario usuario = new Usuario();
				System.out.println((i+1) + "º Usuario: ");
				System.out.println("Introduce el nombre de usuario: ");
				usuario.nombre = teclado.nextLine().trim();
				System.out.println("Introduce el apellido de usuario: ");
				usuario.apellido = teclado.nextLine().trim();
				System.out.println("Introduce el email de usuario: ");
				usuario.email = teclado.nextLine().trim();
				usuarios[i] = usuario;
			}
		}
		return usuarios;
	}
	
	
	
	/*
	public static void main(String[] arg){
		System.out.println("Hola mundo");
		fecha();
	}
	public static void fecha(){
		Date objDate = new Date();
		String strDateFormat = "HH:mm:ss dd-MM-yyyy";
  		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
  		System.out.println(objSDF.format(objDate));
	}
	*/
}
