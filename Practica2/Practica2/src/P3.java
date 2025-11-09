public class P3 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2,3,5);
        MyDate myDate2 = new MyDate(2,3,5);
        MyDate myDate3 = new MyDate(1,4,5);

        boolean result = myDate.equals(myDate2);
        System.out.println(result);

        boolean result2 = myDate.equals(myDate3);
        System.out.println(result2);

        }
}
