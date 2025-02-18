package ss11_stack.bai_tap;

import java.sql.Array;
import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack= new Stack<>();
        System.out.print("Nhập số : ");
        int num=Integer.parseInt(scanner.nextLine());
        int temp;
        while (num>0){
            temp=num%2;
            num=num/2;
            stack.push(temp);
        }
        System.out.println(stack);
        System.out.print("Số vừa nhập chuyển sang nhị phân là: ");
        for (int i=0;i<stack.size();i++){
            System.out.print(stack.pop());
            i--;
        }
    }
}
