import java.util.*
public class level1q1{

         public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(“enter three numbers”);
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
if(a>b&&a>c){
	System.out.println(“Is the first number the largest?yes Is the second number the largest? no Is the third number the largest? no”);
}
else if(b>a&&b>c){
	System.out.println(“Is the first number the largest?no Is the second number the largest? yes Is the third number the largest? no”);
}
else{
	System.out.println(“Is the first number the largest?no Is the second number the largest? no Is the third number the largest? yes”);
}
sc.close();
}
}
