import ra.map.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Set - không lưu trữ phần tử trùng lặp
        // HashSet // không theo thứ tự add vào
        // LinkedHashSet // thứ tự add vào sẽ là thứ tự lưu trữ trong danh sách
        // TreeSet // các phân tử thêm vào sẽ được săp xếp theo thứ tự
        int[] arr = {99,62,88,7,99,5,7,12,3,4,5,62,12,4}; //99,62,88,7,5,12,3,4
        TreeSet<Integer> hashSet = new TreeSet<>();
        for (int n:arr) {
            hashSet.add(n);
        }
        System.out.println(hashSet);
//
//        Set<Person> set = new HashSet<>();
//        set.add(new Person(8));
//        set.add(new Person(8));
//        System.out.println(set);
//
//        ArrayDeque<Character> queue = new ArrayDeque<>();
//        System.out.println("Nhập chuỗi cần kiểm tra");
//        String str = new Scanner(System.in).nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            queue.add(str.charAt(i));
//        }
//        StringBuilder strReverse = new StringBuilder();
//        while (!queue.isEmpty()){
//            strReverse.append(queue.getLast());
//            queue.removeLast();
//        }
//        if (strReverse.toString().equals(str)){
//            System.out.println("đây là chuỗi đối xứng");
//        }else {
//            System.out.println("không là chuỗi đối xứng");
//        }


        // treeset
//        99,62,88,7,5,12,3,4
        System.out.println(hashSet.lower(62));

    }
}