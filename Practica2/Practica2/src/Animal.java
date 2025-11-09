public abstract class Animal
{
    String nombre;
    private int edad;
    public Animal()
    {
        nombre = "Lola";
        System.out.println("nombre");
    }
    public void showName(){
        System.out.println(nombre);
    }

}

/*
    public class Engineer {
    protected String name;
    public Engineer(){
        name = "Ingeniero Sergio";
        System.out.println("name");
    }
    public void showName(){
        System.out.println(name);
    }
}
 */
