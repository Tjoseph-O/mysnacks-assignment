package maySnacks.arrays;

public class OddPosition {
    public static void main(String[] args) {
        int[] oddNumber = {400,900,603,1000,10,3,5,6,7,8,9,13,15,40};

        for (int index = 0; index < oddNumber.length; index++) {

            if (oddNumber[index] %  2 != 0) {
                System.out.println(oddNumber[index]);


            }

        }


    }




}
