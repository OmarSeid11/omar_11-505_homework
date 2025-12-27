package homeworks;
import java.util.Scanner;
import java.util.HashSet;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = 3;

        String longestNickname = "";
        int totalAge = 0;
        HashSet<String> jobsSet = new HashSet<>();
        StringBuilder addressesWithoutAt = new StringBuilder();

        for (int i = 1; i <= peopleCount; i++) {
            System.out.println("Enter data for person #" + i);

            System.out.print("Nickname: ");
            String nickname = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Job: ");
            String job = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Instagram: ");
            String instagram = scanner.nextLine();

            if (nickname.length() > longestNickname.length()) {
                longestNickname = nickname;
            }

            totalAge += age;

            jobsSet.add(job);

            String addressWithoutAt = address.replace("@", "");
            addressesWithoutAt.append(addressWithoutAt).append("\n");

            System.out.println();
        }

        double averageAge = (double) totalAge / peopleCount;

        System.out.println("Longest Nickname: " + longestNickname);
        System.out.printf("Average Age: %.2f\n", averageAge);
        System.out.println("Number of unique jobs: " + jobsSet.size());
        System.out.println("Addresses without '@':");
        System.out.println(addressesWithoutAt.toString());

        scanner.close();
    }
}
