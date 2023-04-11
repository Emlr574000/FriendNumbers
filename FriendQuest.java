import java.util.Scanner;

public class FriendQuest {
    public void friendQuest(){
        Scanner scanner=new Scanner(System.in);

        isFriend2 isFriend2=new isFriend2();
        isFriend1 isFriend1=new isFriend1();
        System.out.println("Enter the first number");
        int data1=scanner.nextInt();
        int a =isFriend1.isfriend1(data1);
        System.out.println("Enter the second number");
        int data2=scanner.nextInt();
        int b =isFriend2.isfriend2(data2);
        if(a==data2&&b==data1)
        {
            System.out.println("Friend Numbers");
        }
        else
            System.out.println("This isn't Friends");
    }

}
