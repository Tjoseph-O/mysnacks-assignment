package maySnacks.arrays;

public class EvenNumber {
    public static void main(String[] args) {
        int[] evenNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int index = 0; index < evenNumber.length; index++) {

            if (evenNumber[index] % 2 == 0) {

                System.out.println(evenNumber[index]);

            }

        }

    }
}
