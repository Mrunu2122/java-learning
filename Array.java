import java.util.Arrays;
public class Array {
    
    public static void main(String[] args) {
        
        int age = 30;
        int phy = 97;
        int chem = 98;
        int eng = 95;

        // 1d array
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);

        // Lenght
        System.out.println(marks.length);

        // Sort(ascending)
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // 2D array
        int[][] finalMarks = {{97, 98, 95}, {95, 95, 98}};
        System.out.println(finalMarks[1][1]);
        System.out.println(finalMarks[0][0]);        

    }
}
