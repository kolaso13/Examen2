public class App {
    
    public static void main(String[] args) throws Exception {
        Calc c = new Calc();

        System.out.println(c.deStringANumero("CuAtRo"));
        c.f3(" TrEs  CinCO   CuatrO     Seis");

        int [] array = {1,5,7};

        double [] arrayRegla = new double [array.length];

        arrayRegla = c.regla3Array(array);

        String arrayS = "";
        String solRegla = "";

        for(int i = 0; i < arrayRegla.length; i++){
            arrayS = arrayS + ", " + array[i];
        }

        for(int i = 0; i < arrayRegla.length; i++){
            solRegla = solRegla + ", " + arrayRegla[i];
        }

        System.out.println("El array: " + arrayS + " proporcional a 60 es: " + solRegla);
       
    }
}
