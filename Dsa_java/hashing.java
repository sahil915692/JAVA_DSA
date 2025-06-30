//Hashing 
/*
 * What is Hashing
 * hashing is a technique to convert data into fixed size
 * value(called a hash code)
 * can store and retrive data in structure
 * using a hash function
 * it allow for efficient data retrivals mostly in o(1) time.
 * 
 * 
 uses
 *fast search(0(1)average time)
 *No  need to sort data
 Easy lookup ,insert , delete

 *Usefull for problem involving
      *frequency counting
      *duplicate
      *set operation
      *maping key to value

#hashing common classes
HashMap<G, D> = maps key to values
HashSet< G, D> = store unique values
LinkedListMap<G, D > = HashMap + maintains insertion order
TreeMap<G, D > = sorted map(use BST not Hashing)
HashTable<G, D > = Syncronized HashMap(order)

//Syntax

Map<String,IntegerMap = new HashMap<>();
map.put("Gopal",2);
map.get("Gopal")//return 2
map.cotainskey(:Gopal)//True

 */
//count the frequency of element in an array

// import java.util.HashMap;
// import java.util.Map;
// public class Hashing {
//     public static void main(String[] args) {
//         int arr[] = {1, 5, 3, 8, 4};
//         Map<Integer, Integer> frequency = new HashMap<>();
//         for (int num : arr) {
//             frequency.put(num, frequency.getOrDefault(num, 0) + 1);
//         }
//         for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
//             System.out.println(entry.getKey() + " => " + entry.getValue());
//         }
//     }
// }

// check if two string Are Anagrams (Ex . Listen / silent)

// check if two stringsnare anagrams(Ex. silent/Listen)

// public class Hashing{
//     public static boolean isAnagram(String str1, String str2) {
//         if (str1.length() != str2.length())
//             return false;
//         int count[] = new int[30];
//         for (char c : str1.toCharArray())
//             count[c - 'a']++;
//         for (char c : str2.toCharArray())
//             count[c - 'a']--;
//         for (int i : count);
//             if (i != 0)
//                 return false;
//         return true;
//     }
// public static void main(String[] args) {
//     isAnagram("Listen", "Silent");
// }
// }

//Find first Non-repeating characters


// import java.util.LinkedHashMap;
// import java.util.Map;
// public class Hashing {
//     public static void main(String[] args) {
//         String str = "Fuck You";  
//         Map<Character, Integer> count = new LinkedHashMap<>();
//         for (char c : str.toCharArray()) {
//             count.put(c, count.getOrDefault(c, 0) + 1); 
//         }
//         for (Map.Entry<Character, Integer> entry : count.entrySet()) {
//             if (entry.getValue() == 1) {
//                 System.out.println("First Non-repeating character: " + entry.getKey());
//                 break;
//             }
//         }
//     }
// }


//Duplicate Array element


// public class Hashing {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,3,2,5,1,3};
//         Set<Integer> number = new HashSet<>();
//         for(int num:arr)
//         if(!number.add(num)){
//             System.out.println("Duplicate Array Element found" +num);
//         }
//     }
// }

// Find intersection of Two Array

// public class Hashing {
//       public static void main(String[] args) {
//             int arr1[] = {1,2,3,4};
//             int arr2[] = {3,4,5};
//             Set<Integer> set = new HashSet<>();
//             for(int num : arr1)
//             set.add(num);
//                   for(int num : arr2)
//                   if (set.contains(num)){
//                         System.out.println("Common: " +num);
//                   }
//             }
//       }
      
//Find unique Elements(like XOR but using Hashing)

// import java.util.HashMap;
// public class Hashing {
//     public static void main(String[] args) {
//         int arr1[] = {1, 12, 3, 4, 11, 2, 3, 4,9};
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int num : arr1) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() == 1) {
//                 System.out.println("Unique element found: " + entry.getKey());
//             }
//         }
//     }
// }


//Two sum Using HashMap

// import java.util.HashMap;
// import java.util.Map;
// public class hashing {
//     public static void main(String[] args) {
//         int arr[] = {2, 7, 11, 15};
//         int target = 9;
//         Map<Integer, Integer> map = new HashMap<>(); 
//         for (int i = 0; i < arr.length; i++) {
//             int complement = target - arr[i];
//             if (map.containsKey(complement)) {
//               System.out.println("Pair " + complement + " & " + arr[i]);
//               return;
//             }
//             map.put(arr[i], i);
//        }
// }
// }


