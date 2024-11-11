/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinaled;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author luisi
 */
public class ProyectoFinalED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=1,opmet;
       int cant,op2;
        int[] arr;
        Scanner lec= new Scanner(System.in);
        Random rand = new Random();
        long ti,tf,t;
        bubble bur=new bubble();
        inserccionDirecta id= new inserccionDirecta();
        Shell sh= new Shell();
        metquicksort qs= new metquicksort();
         SeleccionDirecta sd= new SeleccionDirecta();
        
        while(op!=7){           
            
            System.out.println("Escoge el metodo de ordenacion o comparativa");
            System.out.println("1.Burbuja\n" +
                                "2.Inserción Directa\n" +
                                "3.Shell\n" +
                                "4.Quick Sort \n" +
                                "5.Selección directa.\n" +
                                "6.Comparativa de Métodos\n"+
                                "7.Salir");
            op=lec.nextInt();
            
            if (op==6) {
                int[] og;
                long tc,tu,t1;
                 System.out.println("Cuantos numeros vamos a ordenar?");
                cant=lec.nextInt();
                og= new int[cant];
                for (int i = 0; i < og.length; i++) {
                og[i] = rand.nextInt(100);
                }
                System.out.println("Arreglo no ordenado");
                System.out.println(Arrays.toString(og));
                tc=System.currentTimeMillis();
                bur.bubbleSort(og.clone());
                tu=System.currentTimeMillis();
                t1=tu-tc;
                System.out.println("Burbuja: "+t1);
                //insercion directa
                tc=System.currentTimeMillis();
                id.InsercionDirecta(og.clone());
                tu=System.currentTimeMillis();
                t1=tu-tc;
                System.out.println("Inserccion directa: "+t1);
                //shell
                tc=System.currentTimeMillis();
                sh.metShell(og.clone());
                tu=System.currentTimeMillis();
                t1=tu-tc;
                System.out.println("Shell: "+t1);
                //quicksort
                tc=System.currentTimeMillis();
                qs.quicksort(og.clone(),0,cant-1);
                tu=System.currentTimeMillis();
                t1=tu-tc;
                System.out.println("Quick sort: "+t1);
                //Seleccion directa
                tc=System.currentTimeMillis();
                sd.selectionSort(og.clone());
                tu=System.currentTimeMillis();
                t1=tu-tc;
                System.out.println("Seleccion directa: "+t1);
                
                
                Arrays.sort(og);
                System.out.println(Arrays.toString(og));
                
                
            }
            else{
                System.out.println("Cuantos numeros vamos a ordenar?");
                cant=lec.nextInt();
            arr=new int[cant];
            System.out.println("1.Para generar los numeros aleatorios");
            System.out.println("2.Para ingresarlos 1 por 1");
            op2=lec.nextInt();
            if (op2==1) {              
             for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100);
                }
            }else if (op2==2) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("ingresar el numero par la posicion "+(i+1));
                arr[i] = lec.nextInt();
                }
            }
            switch(op){
                case 1:
                    System.out.println("Arreglo no ordenado");
                    System.out.println(Arrays.toString(arr));
                    
                    ti=System.currentTimeMillis();
                    bur.bubbleSort(arr);
                    tf=System.currentTimeMillis();
                    t=tf-ti;
                    System.out.println(Arrays.toString(arr));
                    System.out.println("ordenado en "+t+" milisegundos");
                    break;
                case 2:
                    System.out.println("Arreglo no ordenado");
                    System.out.println(Arrays.toString(arr));
                    
                    ti=System.currentTimeMillis();
                    id.InsercionDirecta(arr);
                    tf=System.currentTimeMillis();
                    t=tf-ti;
                    System.out.println(Arrays.toString(arr));
                    System.out.println("ordenado en "+t+" milisegundos");
                    break;
                case 3:
                    System.out.println("Arreglo no ordenado");
                    System.out.println(Arrays.toString(arr));
                    
                    ti=System.currentTimeMillis();
                    sh.metShell(arr);
                    tf=System.currentTimeMillis();
                    t=tf-ti;
                    System.out.println(Arrays.toString(arr));
                    System.out.println("ordenado en "+t+" milisegundos");
                    break;
                case 4:
                    System.out.println("Arreglo no ordenado");
                    System.out.println(Arrays.toString(arr));
                    
                    ti=System.currentTimeMillis();
                    qs.quicksort(arr, 0, cant-1);
                    tf=System.currentTimeMillis();
                    t=tf-ti;
                    System.out.println(Arrays.toString(arr));
                    System.out.println("ordenado en "+t+" milisegundos");
                    break;
                case 5:
                    System.out.println("Arreglo no ordenado");
                    System.out.println(Arrays.toString(arr));
                   
                    ti=System.currentTimeMillis();
                    sd.selectionSort(arr);
                    tf=System.currentTimeMillis();
                    t=tf-ti;
                    System.out.println(Arrays.toString(arr));
                    System.out.println("ordenado en "+t+" milisegundos");
                    break; 
            }
            }
            
            
            
        }
    }
    
    public void lollmao(){
        
    }
    
}
