package exercise1;
import java.util.*;

public class Functions {
	
	public static int[] fillArray(int array[]){ //To modify!
		for(int i = 0; i < array.length; i++) {
			array[i] = 10 * i;
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