/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaled;

/**
 *
 * @author luisi
 */
public class metquicksort {
    public void quicksort(int A[],int izq,int der){
        int pivote=A[izq];//tomamos el primer elemento como pivote
        int i=izq;//i realiza la busqueda de izquierda a derecha
        int j= der;//j realiza la busqueda de derecha a izquierda
        int aux;
        
        while(i<j){
            //mientras nose crucen las busquedas
            while(A[i]<=pivote && i<j){
                i++;//busca elemento mayor que pivote
            }
            while(A[j]>pivote){
                j--;//busca elemento menor que pivote
            }
            if (i<j) {//si no se han cruzado
                aux=A[i];//los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }
        A[izq]=A[j];//se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;//los menores a su izquierda y los mayores a su derecha
        
        if (izq<j-1) {
            quicksort(A,izq,j-1);//ordenamos subarray izquierdo
        }
        if (j+1<der) {
            quicksort(A,j+1,der);//ordenamos subarray derecho
        }
    }
}
