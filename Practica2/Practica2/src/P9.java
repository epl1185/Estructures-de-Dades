public class P9 {
    public static void main() {
        Storage<Number> s1 = new Storage<>();//Guardem number
        s1.addItem(0);
        s1.addItem(1);
        Storage<Integer> s2 = new Storage<>(); //Guardem Integer
        s2.addItem(32);
        s2.addItem(42);
        /*
        s1.copyTo(s2);
        No es pot, ja que Integer hereda de number, és a dir number es la superclase de Integer.
        Per tant, no podem dir que un Integer sigui un number.
         */
        s2.copyTo(s1);
        System.out.println(s1.getItems().toString());

        /*
        Sí que es pot. Un integer és "fill" de Number, per tant, podem dir que com un Integer és un Number, es pot fer la transformació.
        Provat al Main
         */
    }
}

