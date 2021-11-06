import java.util.*;


public class Main {

	private static Scanner sc;
	private int poles[];

	public Main() {
		
		poles = new int [3];
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {

		Main main = new Main();
		
		System.out.println("Operation quantity");
		int s = sc.nextInt();
		
		int operationQ[] = new int[s];
		
	
		
		for(int i = 0; i < s; i++){
			
			operationQ[i] = main.input();
			
		}

		for(int i = 0; i < operationQ.length; i++){
			
			main.readData(operationQ[i]);
			
		}
	}
	
	public int input(){
		
		System.out.println("Number of disk: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		return n;
	}
	
	public void crearArreglo(int n) {

		poles[0] = n;
		poles[1] = 0;
		poles[2] = 0;
	}

	public void readData(int n){
		
		
		crearArreglo(n);
		System.out.print("\nOroginal: ");
		imprimirPosicion();
		HanoiOriginal(n, poles[0], poles[1], poles[2], 0, 1, 2);
		System.out.print("Final: ");
		imprimirPosicion();

	}
	

	public  void HanoiOriginal(int n, int origen,  int auxiliar, int destino, int tower1, int tower2, int tower3){
		
		
		
		if(n==1) {
			poles[tower1]--;
			poles[tower3]++;
			imprimirPosicion();
		}
		else{
			HanoiOriginal(n-1, origen, destino, auxiliar, tower1, tower3, tower2);
			poles[tower1]--;
			poles[tower3]++;
			imprimirPosicion();
			HanoiOriginal(n-1, auxiliar, origen, destino, tower2, tower1, tower3);
		}
	}

	
	public void imprimirPosicion() {
		
		System.out.print("[");
		for (int i = 0; i < 3; i++){
			System.out.print(poles[i] + ",");
		}
		System.out.print("]");
		System.out.print("\n");
	}

}

