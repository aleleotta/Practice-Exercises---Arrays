package exercise1;
import java.util.*;

public class Functions {
	
	public static char[] placeMines(char array[]){ //Function that will set the mines in the field (array).
		for(int index = 0; index < array.length; index++) {
			int denyRepeat = 0;
			int randomIndex = (int) (Math.random() * 20);
			if(index <= 6) {
				if(randomIndex != denyRepeat) {
					array[randomIndex] = '*';
				}
				denyRepeat = randomIndex;
			}
		}
		return array;
	}
	
	public static int[] gameSetter(int array[], char array1[]) { //This function will set the game to allow the player to play.
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to MineSweeper!\n"
				+ "The player has to pick every box that doesn't have in it in order to win.\n"
				+ "Every time the player picks a box without a mine, a hint number will be shown telling if there are any mines nearby.\n"
				+ "If the player picks a box with a mine, the game is lost!\n"
				+ "Good Luck!\n");
		for(int turn = 1, index = 0; turn < array.length + 1; turn++) {
			System.out.println("Turn " + turn + "\n");
			System.out.println(Arrays.toString(array1));
			System.out.print("Pick a box to uncover: \n\n");
			int chosenBox = sc.nextInt();
			System.out.println(Arrays.toString(array));
			for(int index1 = 0; index1 < array.length; index1++ ) {
				chosenBox = array[index1];
			}
			if(array1[index] == '*') {
				System.out.println("\n\n\nYou lost.\nBetter luck next time!\n");
				System.out.println(Arrays.toString(array1));
				break;
			}
			System.out.println("You win! These were the mines that you avoided.");
			System.out.println(Arrays.toString(array1));
		}
		return array;
	}
}
/*Realizaremos el juego del buscaminas con un array unidimensional.
El juego nos proporcionará pistas, de forma que si destapamos una casilla y no hay una mina,
esta casilla nos indicará cuantas minas hay adyacentes a esa posición.
Por lo tanto el ordenador debe preparar una tabla de 20 casillas para nosotros
en el que colocará 6 minas y las pistas correspondientes.
Ejemplo: {0,1,*,1,1,*,*,2,*,1,0,0,0}
Este panel permanecerá oculto y es el jugador el que debe tratar de descubrirlo.
En cada turno, el jugador indicará qué casilla quiere destapar.
Si en esa casilla no hay ninguna mina, se le debe indicar al jugador la pista que hay en esa casilla.
Si hay una mina, se le mostrará un mensaje al jugador indicando que ha perdido.
El juego debe seguir ejecutándose hasta que el jugador destape una mina, o haya destapado todas las pistas.
*/