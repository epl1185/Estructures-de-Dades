public class Engineer extends Person{
    private String especializacion;

    public Engineer(String name, int age, String especializacion) {
        super(name,age);
        this.especializacion = especializacion;
    }
    public String getEspecializacion() {
        return especializacion;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "especializacion='" + especializacion + '\'' +
                '}';
    }
}
