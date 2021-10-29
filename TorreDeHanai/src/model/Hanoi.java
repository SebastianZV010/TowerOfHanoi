package model;

public class Hanoi {

	private int poles[];
	private int count = 0; 
	private int count1 = 0;


	public Hanoi() {

		poles = new int [3];
	}



	public void crearArreglo(int n) {

		poles[0] = n;
		poles[1] = 0;
		poles[2] = 0;


	}



	public  void HanoiOriginal(int n, int origen,  int auxiliar, int destino){





		System.out.println("N = " + n + " ;");

		if(n==1) {

			System.out.println("perfere");
			System.out.println("--mover disco " + n + ": de " + origen + " a " + destino);

		}
		else{

			System.out.println("aqui");
			HanoiOriginal(n-1, origen, destino, auxiliar);
			System.out.println("++mover disco " + n + ": de " +  origen + " a " + destino);
			System.out.println("aca");
			HanoiOriginal(n-1, auxiliar, origen, destino);
			System.out.println("aque");
		}

		System.out.println("equeruquere\n ");
	}

	public void hanoiS(int n, int origin, int aux, int destiny) {

        count++;

        if(n == 1) {

            if(count % 2 != 0) {

                if(poles[0] <= 0) {

                    poles[1]--;
                    poles[2]++;
                    imprimirPosicion();

                } else {

                    poles[0]--;
                    poles[2]++;
                    imprimirPosicion();
                }

//                poles[0]--;
//                poles[2]++;
//                System.out.println("--" + printPoles());

            } else { //origin, destiny, aux

                if(poles[0] <= 0) {

                    poles[1]--;
                    poles[2]++;
                    imprimirPosicion();

                } else {

                    poles[0]--;
                    poles[1]++;
                    imprimirPosicion();
                }
            }

        }
else {

            hanoiS(n - 1, origin, destiny, aux);

            if(count % 2 != 0) {

                if(poles[0] <= 0) {

                    poles[0]--;
                    poles[1]++;
                    imprimirPosicion();

                } else {

                    poles[0]--;
                    poles[1]++;
                    imprimirPosicion();
                }

            } else {

                poles[0]--;
                poles[2]++;
                imprimirPosicion();
            }

//            poles[0]--;
//            poles[2]++;
//            System.out.println(printPoles());
            hanoiS(n - 1, aux, origin, destiny);
        }
    }


	public void HanoiGrafico(int n, int origen,  int auxiliar, int destino){





		System.out.println("N = " + n + " ;");
		System.out.println(" ["+origen+"], "+ "["+ auxiliar+"], "+"["+ destino+"]" );		


		if(n==1) {


			System.out.println(" ["+origen+"], "+ "["+ auxiliar+"], "+"["+ destino+"]" );	


		}
		else{


			HanoiGrafico(n-1, origen, destino, auxiliar);



			System.out.println(" ["+origen+"], "+ "["+ auxiliar+"], "+"["+ destino+"]" );	



			HanoiGrafico(n-1, auxiliar, origen, destino);

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
