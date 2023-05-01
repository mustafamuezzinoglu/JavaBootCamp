package part1;

public class CharSequencesPractice {

    public static void main(String[] args) {


        String a = "Cydeo";
        String b = "Cydeo";
        String c = "Cydeo";

        System.out.println(a==b);

        String str1 = new String("Cydeo");
        String str2 = new String("Cydeo");
        String str3 = new String("Cydeo");

        System.out.println("str1 ==str2= " + (str1 == str2) );

        System.out.println(a.equals(str1));

        String s = "Cydeo";
        s.concat(" School");
        System.out.println(s); // Cydeo
        s = s.concat(" School");
        System.out.println(s); //Cydeo SChool

        System.out.println("------------------------");

        StringBuilder stringBuilder = new StringBuilder("Cydeo");

        stringBuilder.append(" School");

        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("--------------------------------");

        StringBuffer stringBuffer = new StringBuffer("Cydeo");
        stringBuffer.append(" School");

        System.out.println("stringBuffer = " + stringBuffer);







    }
}
