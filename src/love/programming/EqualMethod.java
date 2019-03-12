package love.programming;

public class EqualMethod {
    public static void main(String[] args) {
        String s1 = "Uma";
        String s2 = "UMA";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        {
            System.out.println("Concatenation");
        }

        String a1 = "Uma ";
        String a2 = "Gorakati";
        String s3 = a1.concat(a2);
        {
            System.out.println(s3);
        }
        {
            System.out.println("Example");
            String s = 10 + 10 + "Uma" + 20 + 40;
            System.out.println(s);//80Sachin4040
        }
        {
            System.out.println("Length");
            String s = "Gorakati";
            System.out.println(s.length());
        }
    }
}
