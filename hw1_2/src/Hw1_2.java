/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        int N=credit.length;
        float sum=0,sumcd=0,gpa=0;
        for(int i=0;i<N;i++){
            sum=sum+(grade[i]*credit[i]);
        }
        for(int i=0;i<N;i++){
            sumcd=sumcd+credit[i];
        }
        gpa=sum/sumcd;
        return gpa;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
