import java.util.*;
public class task2 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your marks in Telugu subject  out of 100");
    int s1=sc.nextInt();
    System.out.println("Enter your marks in Hindi subject  out of 100");
    int s2=sc.nextInt();
    System.out.println("Enter your marks in English subject  out of 100");
    int s3=sc.nextInt();
    System.out.println("Enter your marks in Mathematics subject  out of 100");
    int s4=sc.nextInt();
    System.out.println("Enter your marks in Science subject  out of 100");
    int s5=sc.nextInt();
    System.out.println("Enter your marks in Social subject  out of 100");
    int s6=sc.nextInt();
    sc.close();
    int total;
    total=s1+s2+s3+s4+s5+s6;
    double Avg;
    Avg=total/6;
    char grade;
    if(Avg>=90){
        grade='A';
    }
    else if(Avg>=80){
        grade='B';
    }
    else if(Avg>=70){
        grade='C';
    }
    else if(Avg>=60){
       grade='D';
    }
    else if(Avg>50){
        grade='E';
    }
    else{
        grade='F';
    }
    System.out.println("Total marks ="+total);
    System.out.println("Average percentage = "+Avg+"%");
    System.out.println("Grade ="+grade);
    }
}
