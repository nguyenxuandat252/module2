package on_tap.mang;

import java.util.Arrays;

//
public class KhaiBao {
    public static void main(String[] args) {
//        Mảng trong java :
//        - Là một đối tượng trong java chỉ có một thuộc tính .length để lấy độ dài mảng
//        - Có thể truy cập phần tư mảng thông qua chỉ số index, phần tử đầu tiên có chỉ số là 0
//        phần tử cuỗi cùng có chỉ số bằng độ dài mảng - 1
//        - Khai báo mảng nhưng không gán giá trị thì phần tử mảng có giá trị mặc định
//        - Phải có cùng kiểu dữ liệu
//        - Có kích thước cố định phải khai báo mảng trước khi sử dụng

//      Khai báo khởi tạo mảng
        String[] array; // nếu gọi ra sẽ báo lỗi vì chưa khởi tạo mới chỉ khai báo
        String[] array0 = {"1", "2", "3"}; //ok
        String[] array1 = new String[3]; //ok
        String[] array2 = new String[]{"a", "b", "c"}; //ok
        String[] array3 = {"1"};

//      Duyệt mảng

//      For
        for (int i = 0; i < array0.length; i++) {
            System.out.println(array0[i]); //1 2 3
        }

//      For-each
        for (String a : array1) {
            System.out.println(a); // null null null
        }

//      while
        int i = 0;
        while (i < array2.length) {
            System.out.println(array2[i]); //a b c
            i++;
        }

//      do-while
        int j = 0;
        do {
            System.out.print(array3[j] + " "); //mảng rỗng sẽ lỗi
            j++;
        } while (j < array3.length);
//      Sao chép mảng dùng for, System.arraycopy(), Arrays.copyOf(), Arrays.copyOfRange()
//      System.arraycopy(mảng gốc, vị tri gốc, mảng new, vị trí mảng new, vị trí cuối mảng gốc);
//      Arrays.copyOf() Arrays.copyOf(mảng gốc, độ dài mới)
//      Arrays.copyOfRange(mảng gốc, vị trí bắt đầu, vị trí kết thúc);

//      Sắp xếp mảng tăng dần
        String[] arraySx= {"a","z","b"};
        Arrays.sort(arraySx);
        System.out.println(Arrays.toString(arraySx));// ["a","b","c"]

//      Đào ngược mang
        int[] array4 = {1,2,3};
        for (int z=0, y=array4.length-1;z<y;z++,y--){
            int temp = array4[0];
            array4[0]=array4[y];
            array4[y]=temp;
        }
        System.out.println("Mảng sau khí đảo");
        System.out.println(Arrays.toString(array4)); //[3, 2, 1]

        //Gán mảng array= array1 khi thay đổi array hay array 1 thì cả 2 ều thay đổi vì là biến tham chiếu
        //Clone mảng array = array1.clone(); thì thay đổi array thì array1 không thay đổi
        }
}