package ss11_stack.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu"+ Arrays.toString(array));
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        System.out.println("stack ban đầu: "+stack);
        for (int i=0;i<array.length;i++){
            array[i]=stack.pop();
        }
        for (int i=0;i<array.length;i++){
            System.out.println("mảng sau khi đảo ngược"+ Arrays.toString(array));
        }

        System.out.println("--------------------------------------------");

        String input="code gym 123";
        String[] stringArray = input.split(" ");
        Stack<String> stack1=new Stack<>();
        for(int i=0;i<stringArray.length;i++){
            stack1.push(stringArray[i]);
        }
        System.out.println("stack ban đầu: "+stack1);
        for (int i=0;i<stringArray.length;i++){
            stringArray[i]=stack1.pop();
        }
        for (int i=0;i<stringArray.length;i++){
            System.out.println("mảng sau khi đảo ngược"+ Arrays.toString(stringArray));
        }
        String lastString=String.join(" ",stringArray);
        System.out.println(lastString);
    }
}
