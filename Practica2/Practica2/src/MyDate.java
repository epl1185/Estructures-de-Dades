

/*
Estudi previ:
    No, ja que, primer de tot, ens hem de remuntar al concepte de conversions.
    En aquest cas, volem fer un "cast down" de la classe object i el volem convertir a
    la classe demanada. D'entrada, no es fa aquesta conversió, per tant, estem comparant dos objectes
    diferents, pel que, la comanda és incorrecte. Després de fer el casteig, hem de comparar tots els
    atributs de l'objecte, sigui en aquest cas la classe date. D'aquesta manera procederem a fer correctament
    la conversió explicita.

    public class MyDate{
        public int month;
        (...)
        @Override
        public boolean equals (Object dt){
            return (dt.month == this.month);
            }
        (...)
}
 */
public class MyDate{
    private final int month; //Millor fer les variables privades
    private final int day;
    private final int year;
    public MyDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals (Object dt)
    {
        if(!(dt instanceof MyDate))
        {
            return false;
        }
        else
        {
            MyDate myDate = (MyDate) dt;
            return month == myDate.month && day == myDate.day && year == myDate.year;
        }

    }
}

