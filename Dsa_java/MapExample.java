// map (dictionary)
// // Map[( dictionary)]
// a map stores key value pair like a dictionary keys are unique
// Syntax..........a
// Map<String,Integer>map = new HaahMap<>();
// map.put("Apple",104);
// map.get(Apple);
// map.containsKey("Apple");

// import java.util.HashMap;
// import java.util.Map;
// public class MapExample{
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         final Map<Integer, Integer>frequency= new HashMap<>();
//         for(int n:arr){
//             frequency.put(1, null);
//         }
//     }
// }

// find Duplication
//find duplicates and remove them
 
// import java.util.Map;
// import java.util.HashMap;
// public class MapExample {
//     public static void main(String[] args) {
//         String str[] = {"Banana", "Banana", "Apple"};

//         Map<String, Integer> map = new HashMap<>();
//         for (String s : str) {
//             map.put(s, map.getOrDefault(s, 0) + 1);
//         }
//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > 1) {
//                 System.out.println("duplicate : " + entry.getValue());
//             }
// }
// }
// }