public static class Empleado {
    String nombre;
    int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;

        Empleado empleado = (Empleado) o;
        return id == empleado.id; // Solo comparamos id
    }

    // ❌ Sin hashCode() por ahora - funciona pero no óptimo
}

class Gerente extends Empleado {
    String departamento;

    public Gerente(String nombre, int id, String departamento) {
        super(nombre, id);
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gerente)) return false;
        if (!super.equals(o)) return false; // Verifica id del padre

        Gerente gerente = (Gerente) o;
        // Comparar Strings con equals(), no con ==
        return departamento.equals(gerente.departamento);
    }

    // ❌ Sin hashCode() por ahora
}

class Director extends Gerente {
    double presupuesto;

    public Director(String nombre, int id, String departamento, double presupuesto) {
        super(nombre, id, departamento);
        this.presupuesto = presupuesto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        if (!super.equals(o)) return false; // Verifica id y departamento

        Director director = (Director) o;
        return presupuesto == director.presupuesto;
    }

    // ❌ Sin hashCode() por ahora
}
public void main()
{
        Director director = new Director("Marcel", 0, "Física", 10000);
        Empleado empleado = new Empleado("Aleix", 1);
        Gerente gerente = new Gerente("Aleix", 1, "Informatica");
        Gerente gerente2 = new Gerente("Aleix", 1, "Informatica");

        boolean result = director.equals(empleado);  // false - tipos diferentes
        boolean result2 = gerente.equals(empleado);  // false - tipos diferentes
        boolean result3 = director.equals(gerente);  // false - tipos diferentes
        boolean result4 = gerente.equals(gerente2);  // true - mismos datos

        System.out.println("director.equals(empleado): " + result);
        System.out.println("gerente.equals(empleado): " + result2);
        System.out.println("director.equals(gerente): " + result3);
        System.out.println("gerente.equals(gerente2): " + result4);

        // Tests adicionales
        Empleado emp1 = new Empleado("Juan", 1);
        Empleado emp2 = new Empleado("Pedro", 1); // Mismo id, diferente nombre
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // true - solo importa id

        Director dir1 = new Director("Carlos", 2, "Ventas", 50000);
        Director dir2 = new Director("Luis", 2, "Ventas", 50000); // Mismo id, depto y presupuesto
        System.out.println("dir1.equals(dir2): " + dir1.equals(dir2)); // true
}

