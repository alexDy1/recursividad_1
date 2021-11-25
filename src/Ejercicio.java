import java.util.Scanner;
public class Ejercicio {
    public static boolean compararVectores(int [] a, int[] b){
        boolean respuesta = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                respuesta = false;

                break; 
            }
        }
        return respuesta;
    }


    public static boolean compararVectores2(int [] a, int[] b){
        int diferencia =0;
        for (int i = 0; i < a.length; i++) {
            diferencia = diferencia +(Math.abs(a[i] - b[i]));
        }
        return diferencia == 0;
    }

    public static int compararVectoresRecurcividad(int [] a, int []b,int i){
        int diferencia;
        if (i == b.length - 1){
            diferencia = Math.abs(a[i] - b[i]);
        }else{
            diferencia = Math.abs(a[i] - b[i]) + compararVectoresRecurcividad(a,b,i +1);
        }
        return diferencia;
    }

    public static boolean compararVectoresRecurcividad(int [] a, int []b){
        int diferencia = compararVectoresRecurcividad( a,b,0);

        return diferencia == 0;}


   public static int funcionFibonacci(int num){
       if(num == 0 || num==1)
           return num;
       else
           return funcionFibonacci(num-1) + funcionFibonacci(num-2);
   }


   /*METODO RECURSIVO PRA CALCULAR EL MAX VALOR DE UN VECTOR
   * vector={2, 9, 6, 7, 6, 3, 4, 3}
   * */

    private static int maximoVector(int[] vector,int indice,int maximo){

        if (indice==vector.length-1){
            if (vector[indice] > maximo){
                maximo= vector[indice];
            }
        }else {
            if (vector[indice] > maximo){
                maximo= vector[indice];
            }
            maximo= maximoVector(vector,indice + 1,maximo);
        }
        return maximo;
    }
    /*METODO AUXILIAR*/
    public static int maximoVector(int[] vector){
        return maximoVector(vector,0,0);
    }


    //Indice vector
    public static int indiceVector(int []vector,int indice){
        int contador = 0;
        if (indice == vector.length - 1){ //caso base
            if (indice == vector[indice]){
                contador ++;
            }
        }else {  //llamada recursiva
            if (indice == vector[indice]){
                contador++;
            }
            contador = contador +indiceVector(vector , indice + 1);
        }
        return contador;

    }
    //metodo auxiliar
    public static boolean indiceVector(int[] vector){
        return  indiceVector(vector,0)>0;
    }

        public static int busquedaSecuencial(int[] listaDatos, int objeto) {
            for (int i = 0; i < listaDatos.length; i++) {
                if (listaDatos[i] == objeto)
                    return i;
            }
            return -1;
        }

  
        public static int busquedaBinaria(int[] listaDatos, int objeto) {
            int mid = 0;
            int first = 0;
            int last = listaDatos.length - 1;

            while (first <= last) {
                mid = (first + last) / 2;
                if (objeto == listaDatos[mid])
                    return mid;
                else {
                    if (objeto > listaDatos[mid])
                        first = mid + 1;
                    else
                        last = mid - 1;
                }
            }
            return -1;
        }


}
