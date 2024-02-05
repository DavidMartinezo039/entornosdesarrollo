import java.text.SimpleDateFormat;
import java.util.Date;
public class Principal{
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
}