import java.util.Scanner;
public class userinputs{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String name;
        int age;
         double shoe_size;
        System.out.println("pls enter your name;");
        name=scanner.nextLine();
        System.out.println("pls enter your age;");
        age=scanner.nextInt();
        System.out.println("pls enter your shoesize;");
        shoe_size=scanner.nextDouble();
        System.out.println("hello,"+name+" your shoesize is "+shoe_size+ "and you are "+age+"years old");

         scanner.close();



    }
}