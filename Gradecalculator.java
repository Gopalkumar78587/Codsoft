package Codsoft.task2;
import java.util.*;
public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Input: Take marks obtained (out of 100) in each subject.
        System.out.println("Enter the Subject");
        int numSubject=sc.nextInt();
        int totalNum=0;
        for (int i=1;i<=numSubject;i++){
            System.out.println("Enter the obtained mark"+i+":-");
            int marks=sc.nextInt();
            totalNum +=marks;
        }
        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        double AveragePercentage=(double) totalNum/(numSubject*100);

//        Assign grades based on the average percentage achieved.
        if (AveragePercentage>=0.9){
            System.out.println("Grade A");
        } else if (AveragePercentage>=0.8) {
            System.out.println("Grade B");
        } else if (AveragePercentage>=0.7) {
            System.out.println("Grade c");
        }
        else if (AveragePercentage>=0.6){
            System.out.println("Grade D");
        } else if (AveragePercentage>=0.5) {
            System.out.println("Grade E");
        }else {
            System.out.println("fail");
        }
        System.out.println("Total Marrks :-"+totalNum);
        System.out.println("Average percentage: "+AveragePercentage*100+"%");
        sc.close();
    }
}
