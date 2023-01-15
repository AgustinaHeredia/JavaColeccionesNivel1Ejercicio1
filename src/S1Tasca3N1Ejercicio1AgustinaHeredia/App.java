package S1Tasca3N1Ejercicio1AgustinaHeredia;
import java.util.*;
public class App {

	public static void main(String[] args) {
		
		// Ejercicio con ArrayList
		ArrayList <Month> year = new ArrayList<Month>();
	
		Month enero = new Month ("Enero");
		Month febrero = new Month ("Febrero");
		Month marzo = new Month ("Marzo");
		Month abril = new Month ("Abril");
		Month mayo = new Month ("Mayo");
		Month junio = new Month ("Junio");
		Month julio = new Month ("Julio");
		Month septiembre = new Month ("Septiembre");
		Month octubre = new Month ("Octubre");
		Month noviembre = new Month ("Noviembre");
		Month diciembre = new Month ("Diciembre");
		
		year.add(enero);
		year.add(febrero);
		year.add(marzo);
		year.add(abril);
		year.add(mayo);
		year.add(junio);
		year.add(julio);
		year.add(septiembre);
		year.add(octubre);
		year.add(noviembre);
		year.add(diciembre);
		
		System.out.println("ANTES de agregar Agosto:");
		
		for(int i =0; i<year.size();i++) {
			System.out.println(year.get(i).getName());
		}
		
		Month agosto = new Month ("Agosto");
		year.add(7, agosto);
		
		System.out.println("");
		System.out.println("DESPUÉS de agregar Agosto:");
		for(int i =0; i<year.size();i++) {
			System.out.println(year.get(i).getName());
		}
		
		// para separar visualmente
		System.out.println("=================");
		// mismo Ejercicio con HashSet
		
		Set <Month> otherYear = new HashSet <Month>(); 
		
		otherYear.add(enero);
		otherYear.add(febrero);
		otherYear.add(marzo);
		otherYear.add(abril);
		otherYear.add(mayo);
		otherYear.add(junio);
		otherYear.add(julio);
		otherYear.add(agosto);
		otherYear.add(septiembre);
		otherYear.add(octubre);
		otherYear.add(noviembre);
		otherYear.add(diciembre);
		
		Month agosto2 = new Month ("Agosto");
		
		otherYear.add(agosto2);
		
		for(Month mes : otherYear) {
			System.out.println(mes.getName());
		}
		System.out.println("");
		
		Iterator<Month> it = otherYear.iterator();
		
		for(int i =0; i<otherYear.size();i++) {
		 System.out.println(it.next().getName());
		}
		
		
	}

}
