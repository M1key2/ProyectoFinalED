/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaled;

/**
 *
 * @author luisi
 */
public class inserccionDirecta {
     public  void InsercionDirecta(int[] numeros) {
        for (int i = 1; i < numeros.length; i++) {//empezamos en la seguda posicion del arreglo
            int aux = numeros[i];//guardamos lo que hay en la posicion de la i
            int j = i - 1;//la j va a ser el de la izquierda de la i
            while (j >= 0 && aux < numeros[j]) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
    }
}
