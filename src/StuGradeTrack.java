import java.util.*;
public class StuGradeTrack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            names.add(sc.next());

            System.out.print("Enter " + names.get(i) + "'s marks: ");
            marks.add(sc.nextInt());
            sc.nextLine();
        }

        // Calculations
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int m : marks) {
            sum += m;
            if (m > highest) highest = m;
            if (m < lowest) lowest = m;
        }

        double avg = (double) sum / n;

        // Display Summary
        System.out.println("\n--------- STUDENT GRADE REPORT ---------");
        for (int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " : " + marks.get(i));
        }

        System.out.println("----------------------------------------");
        System.out.println("Average Score : " + avg);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);
        System.out.println("----------------------------------------");
    }
}
