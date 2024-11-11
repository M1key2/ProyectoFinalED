/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaled;

/**
 *
 * @author luisi
 */
public class Shell {
    public void metShell(int[] numeros) {
        int salto, aux, i; // declaración de variables enteras salto, aux e i
        boolean cambios; // declaración de una variable booleana llamada cambios
        int cont = 0; // inicialización de una variable entera llamada cont con un valor de 0

        // iteración sobre el arreglo de entrada con un tamaño de salto decreciente en cada iteración
        for (salto = numeros.length / 2; salto != 0; salto = salto / 2) {
            cambios = true; // inicialización de la variable booleana cambios en verdadero
            
            // bucle para iterar sobre el arreglo mientras haya cambios que hacer
            while (cambios == true) {
                cambios = false; // cambios se inicializa en falso al inicio de cada iteración
                
                // bucle para comparar elementos a una distancia de salto
                for (i = salto; i < numeros.length; i++) {
                    // si se encuentra un par de elementos en la posición i y i - salto que no están en orden
                    
                    if (numeros[i - salto] > numeros[i]) {
                        // se intercambian los elementos utilizando una variable auxiliar
                        aux = numeros[i];
                        numeros[i] = numeros[i - salto];
                        numeros[i - salto] = aux;
                        cambios = true; // se actualiza la variable cambios a verdadero porque se hizo un cambio
                    }
                }
            }
        }
    }

}
