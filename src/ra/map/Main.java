package ra.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashMap : danh sách khong theo thứ tự
        // LinkedHashMap: có thư tự như lúc thêm vào
        // TreeMap : sắp xếp theo key
        Map<String,String> map = new TreeMap<>(Comparator.reverseOrder());
//        // thêm một entry(cặp key , value) vào map
//        map.put("S004","Nguyễn Văn A");
//        map.put("S002","Nguyễn Văn B");
//        map.put("S001","Nguyễn Văn C");
//        map.put("S003","Nguyễn Văn D");
////        map.put("S004","Nguyễn Văn E");// trùng lặp key thì sẽ bị ghi đè giá trị
//        // chức năng xóa 1 key
////        map.remove("S003");
//        // kiểm tra tồn taij the key hoặc value
//        if (map.containsKey("S001")){
//            System.out.println("khóa S001 có tòn tại trong map");
//        }
//        if (map.containsValue("Nguyễn Văn A")){
//            System.out.println("học sinh Nguyễn Văn A đã tồn tại");
//        }
//
//        // lấy ra value thông qua keyy
//        System.out.println(map.get("S009"));
//        System.out.println(map);
//
//        // duyệt map
//        // duyệt theo entry
//        for (Map.Entry entry  :map.entrySet()){
//            System.out.println("Key :" + entry.getKey() +"| Value : "+entry.getValue());
//        }
//        // duyệt theo key
//        for (String key: map.keySet()){
//            System.out.println("Key :" + key +"| Value : "+map.get(key));
//        }
//        // duyệt theo value
//        for (String value : map.values()){
//            System.out.println(value);
//        }
//

        // Radom
        Random random = new Random();

        List<Integer>  arrayInt = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayInt.add(random.nextInt(10));
        }
        System.out.println(arrayInt);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int number: arrayInt){
            if(hashMap.containsKey(number)){
                // đã tồn tại thì tăng số lượng thêm 1
                hashMap.put(number,hashMap.get(number)+1);
            }else {
                hashMap.put(number,1);
            }
        }
        for (Integer key :hashMap.keySet()) {
            if(hashMap.get(key)==1) {
                System.out.println("Số " + key + " xuất hiện " + hashMap.get(key) + " lần");
            }
        }
        Map<Person,String> map2 = new TreeMap<>(Comparator.comparing(Person::getAge).reversed());
        map2.put(new Person(24,"Hùng"),"098376373");
        map2.put(new Person(25,"Nam"),"098376373");
        map2.put(new Person(22,"Dức"),"098376373");
        map2.put(new Person(18,"Khánh"),"098376373");
        map2.put(new Person(27,"Thông"),"098376373");
        System.out.println(map2);



    }


}
