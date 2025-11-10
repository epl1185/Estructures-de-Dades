public class Aliasing0 {
        public static void main() {
        Producto a = new Producto("Laptop", 1000);
        Producto b = new Producto("Tablet", 500);
        Producto c = a;

        a.precio = 1200;
        b = c;
        c.nombre = "PC Gaming";
        b.precio = 1500;

        System.out.println(a.nombre + ": " + a.precio);
        System.out.println(b.nombre + ": " + b.precio);
        System.out.println(c.nombre + ": " + c.precio);
    }
}

class Producto {
    String nombre;
    double precio;

    public Producto(String n, double p) {
        nombre = n;
        precio = p;
    }
}
