package day13_NestedLoops_MethodCreation;

public class C10_ReverseString {
    // reverse a string

    public static void main(String[] args) {

        System.out.println(reverseString("asdf"));
        System.out.println(reverseString("qwer"));
        System.out.println(reverseString("Java is funny"));

        reverseString("you should reverse this");  // this method will return a string but we have not used it anywhere
                                                    // so it won't be printed on the console

    }
    //standart           name
    public static String reverseString(String str) {
  //              return type         parameters


        String outPut = "";
        int a = str.length() - 1;

        for (int i = a; i >= 0; i--) {
            outPut = outPut + str.charAt(i);
        }

        return outPut;


    }


}
