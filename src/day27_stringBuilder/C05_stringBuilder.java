package day27_stringBuilder;

public class C05_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Life");

        sb1.delete(4,5);
        System.out.println(sb1); // JavaLife

        sb1.deleteCharAt(7);
        System.out.println(sb1);

        sb1.insert(7,"r");
        System.out.println(sb1);

        String str = "Java is the best";
        sb1.insert(8,str,4,16);
        System.out.println(sb1); // JavaLifr is the best

        sb1.replace(4,8,"can");
        System.out.println(sb1); // Javacan is the best






    }
}
