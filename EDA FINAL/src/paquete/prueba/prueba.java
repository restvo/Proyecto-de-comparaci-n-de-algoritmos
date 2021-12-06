/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import java.util.Random;
import paquete.clases.*;

/**
 *
 * @author Jorge
 */
public class prueba 
{
    public static void mayor(long fin1,long fin2)
    {
        if(fin1<fin2)
        {
            System.out.println("ShellSort se ejecuta en un menor tiempo");
        }
        else if(fin1>fin2)
        {
            System.out.println("HeapSort se ejecuta en un menor tiempo");
        }
        else
        {
            System.out.println("Los dos algoritmos se ejecutan en la misma cantidad de tiempo");
        }
    }
    static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}
    public static void main(String args[])
	{
            int a = 800;
		int arr[] = new int[a];
                int arr2[] = new int[a];
                Random rand = new Random();
                int aux;
                for(int i=0;i<a;i++)
                {
                    aux = rand.nextInt(10000);
                    arr[i] = aux;
                    
                } 
		int n = arr.length;

                printArray(arr);
                System.out.println("\nHeapSort");
		
                
                long inicio = System.nanoTime();
		HeapSort ob = new HeapSort();
		ob.sort(arr);
                long fin = System.nanoTime();
                double dif = (double) (fin - inicio) * 1.0e-9;
                
		
                System.out.println("el programa dura: " + dif + "s\n");
                
                System.out.println("ShellSort");

                long inicio2 = System.nanoTime();

                ShellSort ob2 = new ShellSort();
                ob2.sort(arr2);

                long fin2 = System.nanoTime();
                double dif2 = (double) (fin2 - inicio2) * 1.0e-9;


                System.out.println("el programa dura: " + dif2 + "s\n");
                
                mayor(fin,fin2);
	}
}
