import java.util.Scanner;
public class Main extends Student{

	public static void main(String[] args) {
		
Student s = new Student();
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
 sc=new Scanner(System.in);
String fullName=sc.next();

 sc=new Scanner(System.in);
String birthDate=sc.next();
 sc=new Scanner(System.in);
double avgMark=sc.nextFloat();



System.out.println("id:"+id);
System.out.println("fullName:"+fullName);
System.out.println("birthDate:"+birthDate);
System.out.println("avgMark:"+avgMark);

		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
