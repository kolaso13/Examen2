import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Calc {
    
    //Metodo1 que devuelva un valor entero desde un texto introducido
    public int deStringANumero(String n){
        int d=0,i;
        String num = n.trim().toLowerCase();
        
        if(num.equals("uno"))
            d = 1;

         else if(num.equals("dos"))
            d = 2;

        else if(num.equals("tres"))
            d = 3;
        else if(num.equals("cuatro"))
            d =  4;
    
        else if(num.equals("cinco"))
                d = 5;
    
        else if(num.equals("seis"))
                d = 6;

        else if(num.equals("siete"))
                d = 7;
        
        else if(num.equals("ocho"))
                    d = 8;
        
        else if(num.equals("nueve"))
                d = 9;

        return d;
    }
   

    //Metodo2 Devolver una lista de un texto introducido
    public List<Integer> f3(String str){
        List<Integer> valores = new ArrayList<Integer>();
        String[] palabras = str.trim().split("\s+");
        for(int i = 0; i < palabras.length;i++){
            System.out.println(i + ".- " + palabras[i]);
            valores.add(deStringANumero(palabras[i]));
        }
        for(int i = 0; i < valores.size();i++)
        System.out.println(valores.get(i));
        return valores;
    }


    //Metodo3 Que obtenga proporcionalmente los correctos numeros
    public static double to2Deci(double valor) {
        return Math.floor(valor * 100) / 100d;
    }

    public double[] regla3Array(int[] array) {
        double[] result = new double[array.length];
        int sumaTot = 0;
        for (int i = 0; i < array.length; i++) {
            sumaTot = sumaTot + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            result[i] = to2Deci(array[i] * 60 / (double) sumaTot);
        }
        return result;
    }	
   
    //Metodo4 Que obtenga proporcionalmente los correctos numeros escritos como String
    
    public double[] Regla3Letras(String n) {
        int i;
        int [] array=new int [3];
        List<Integer> cambio = f3(n);
        for(i=0;i< ((CharSequence) cambio).length(); i++) {
            array[i]=cambio.get(i);
        }
        double[] regla = regla3Array(array);
        return regla;

    }	
    

}
    


