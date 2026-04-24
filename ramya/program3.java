                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               import java.util.Scanner;
public class Program3a{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter circle radius:");
double radius=sc.nextDouble();
System.out.println("Area of circle:" +(Math.PI*radius*radius));
System.out.println("circumference of circle" + (2*Math.PI*radius));
}
}