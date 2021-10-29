import java.util.*;
import model.Hanoi;

public class Main {
	
 private Hanoi hanoi; 
 private Scanner sc;
 
 public Main() {
	
	  hanoi = new Hanoi();
	  sc = new Scanner(System.in);
	 
}
	
	public static void main(String[] args) {

		
		Main main = new Main();
		main.readData();

		
	}


	public void readData(){
		
		
		System.out.println("Numero de discos: ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		hanoi.crearArreglo(n);
		hanoi.imprimirPosicion();
		hanoi.hanoiS(n, 0, 0, 0);
		
		
	}

}
	
