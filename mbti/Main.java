package mbti;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to MBTI personality test!!");
        System.out.println("Please answer the following questions by selecting A or B");

        String[] response = adminsterTest();
        String personalityType = calculatePersonalityType(response);
        printPersonalityTrait(personalityType);

    }

    private static void printPersonalityTrait(String personalityType) {
        int index = 0;
        for (int i = 0; i < PersonalityTest.personality().length; i++) {
            if (PersonalityTest.personality()[i].endsWith(personalityType)) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            System.out.println("Your personality Trait is: " + PersonalityTest.personality()[index]);
        }else
            System.out.println("Invalid Personality Type");
    }

    private static String calculatePersonalityType(String[] responses) {
        int introvertScore = 0;
        int extrovertScore = 0;

        for (String response : responses) {
            if (response.equals("A")) {
                introvertScore ++;
            }else
                extrovertScore ++;

        }

        StringBuilder personalityType = new StringBuilder();
        if (introvertScore >= extrovertScore) {
            personalityType.append("I");
        }else
            personalityType.append("E");

        if (responses[0].equals("A")) {
            personalityType.append("N");
        }else
            personalityType.append("S");

        if (responses[1].equals("A")) {
            personalityType.append("F");
        }else
            personalityType.append("T");

        if (responses[2].equals("A")) {
            personalityType.append("J");
        }else
            personalityType.append("P");

        return personalityType.toString();

    }

    private static String[] adminsterTest() {
        Scanner input = new Scanner(System.in);
        String[] responses = new String[PersonalityTest.questions().length];
        for (int i = 0; i < PersonalityTest.questions().length; i++) {
            System.out.println(PersonalityTest.questions()[i]);
            while (true) {
                String response = input.nextLine().trim().toUpperCase(Locale.ROOT);
                if (response.equals("A") || response.equals("B")) {
                    responses[i] = response;
                    break;
                }else
                    System.out.println("Invalid response, Please select A or B ");
            }
        }
        return responses;
    }

}
