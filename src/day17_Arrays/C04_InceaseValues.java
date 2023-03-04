package day17_Arrays;

import java.util.Arrays;

public class C04_InceaseValues {

    // increase values of an array by 5

    public static void main(String[] args) {

        int [] intArr = {2,5,8,4};
        int increment = 5;

        intArr=C03_CreatingMethodToIncreaseValues.changeValuesOfArray(intArr,increment);

        System.out.println(Arrays.toString(intArr));

    }


}
