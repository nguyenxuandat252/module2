package ss13_thuattoan_timkiem.bai_tap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        Set<Character> characters=new TreeSet<>();
        for(char s:str.toCharArray()){
            characters.add(s);
        }
        StringBuilder result = new StringBuilder();
        for(char c: characters){
            result.append(c);
        }
        System.out.println(result);
    }
}
