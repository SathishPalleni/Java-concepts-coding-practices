import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
//import static jdk.internal.org.jline.utils.Colors.s;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Int [] arr = [4,5,6,7,1,2,3];
        //  int taget = 2;

       /*
        1. Reverse a String:
        Write a Java program to reverse a given string.
        2. Find the Largest Element in an Array:
        Find and print the largest element in an array.
        3. Check for Palindrome:
        Determine if a given string is a palindrome (reads the same backward as forward).
        4. Factorial Calculation:
        Write a function to calculate the factorial of a number.
        5. Fibonacci Series:
        Generate the first n numbers in the Fibonacci sequence.
        6. Check for Prime Number:
        Write a program to check if a given number is prime.
        7. String Anagrams:
        Determine if two strings are anagrams of each other.
        8. Array Sorting:
        Implement sorting algorithms like bubble sort, merge sort, or quicksort.
        9. Binary Search:
        Implement a binary search algorithm to find an element in a sorted array.
        10. Duplicate Elements in an Array:
        Find and print duplicate elements in an array.
        11. Linked List Reversal:
        Reverse a singly-linked list.
        12. Matrix Operations:
        Perform matrix operations like addition, multiplication, or transpose.
        13. Implement a Stack:
        Create a stack data structure and implement basic operations (push, pop).
        14. Implement a Queue:
        Create a queue data structure and implement basic operations (enqueue, dequeue).
        15. Inheritance and Polymorphism:
        Implement a class hierarchy with inheritance and demonstrate polymorphism.
        16. Exception Handling:
        Write code that demonstrates the use of try-catch blocks to handle exceptions.
        17. File I/O:
        Read from and write to a file using Java's file I/O capabilities.
        18. Multithreading:
        Create a simple multithreaded program and demonstrate thread synchronization.
        19. Lambda Expressions:
        Use lambda expressions to implement functional interfaces.
        20. Recursive Algorithms:
        Solve a problem using recursion, such as computing the factorial or Fibonacci sequence.

        String str = "madam";
         StringBuilder sb = new StringBuilder(new StringBuilder(str).reverse().toString());

         System.out.println(sb);
        String Revesred = "";
        for (int i = str.length() - 1; i >=0; i-- ){
            Revesred = Revesred+str.charAt(i);
        }
        if(str.equals(Revesred)){
            System.out.println("obects are equle");
        }else {
            System.out.println("objects are not equel");
        }
        System.out.println(Revesred);


        int[] numbers = {10, 25, 47, 3, 89, 56};  // sample array

        int largest = numbers[0];  // assume first element is the largest

        // check each element
        for(int num : numbers) {
            if(num < largest) {
                largest = num;
            }
        }

        System.out.println("The largest element is: " + largest);
        int number = 5;
        int fact = 1;
        for(int i =1; i<=number; i++ ){
            fact = fact*i;
        }
        System.out.println(fact);
        int n = 10;
        int a = 0;
        int b = 1;

        for(int i =0; i<=n; i++){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        //prime number
        int number = 7;
        int cout = 0;
        if(number <=1){
            System.out.println("not elgible for the prime number");
        }
        for(int i = 0; i<=number; i++){
            if(i % number == 0){
                cout++;
            }
        }
        if(cout == 2){
            System.out.println("prime number ");
        }


        //anagrams
        String str1 = "listen";
        String str2 = "silent";
        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1, char2)){
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }


        // Binary search
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72}; // sorted array
        int target = 23;

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("mind value " +mid);

            if (arr[mid] == target) {
                found = true;
                System.out.println("Element found at index: " + mid + " vlue is " + arr[mid]);
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        // Duplicate Elements in an Array
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6};
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }



        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("sathish",90);
        marks.put("joythi",91);
        marks.put("raji",92);
        marks.put("srevali",93);
        marks.put("joshan",94);
        marks.put("mounika",95);
        marks.put("Sathish",90);
        marks.put("Sathish",90);
        marks.put("mounika",95);

        System.out.println(marks + "print all the student marks");
        System.out.println(marks.get("sathish"));
        System.out.println(marks.remove("sathish"));
        System.out.println(marks + "print all the student marks");
        System.out.println(marks.containsKey("joshan"));
        System.out.println(marks.size() + "length of the hashmap");
        System.out.println(marks.containsValue("sk"));
       // marks.clear();
       // System.out.println(marks.clear());

        //Scenario: When a user is deleted from table its respective address should also delete.
         //       How User Entity and AddressEntity will be written

    List<Integer> list = Arrays.asList(10,8,4,5,6,7,3,2,45,65,34,5);
     List<Integer> even = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
     System.out.println(even);
     // district numverrs
        List<Integer> num = list.stream().distinct().collect(Collectors.toList());
        System.out.println(num);
        int [] arr =   {1,2,3,4,5,6,7};
        int temp = arr[0];
        int n = arr.length-1;
        for(int i =1; i<=n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(arr);


        int [] nums1 = {1, 2, 3, 4, 5};
        int [] nums2 =  {1, 2, 7};
        int result = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i =0; i<= nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                if(nums1[j] == nums2[i]){

                }
            }

        }
        //Palleni@123
        */
        String str = "'(', ')', '{', '}', '[', ']'";
        System.out.println(Valid(str));
    }


    public static boolean Valid(String str) {
        // String str = "'(', ')', '{', '}', '[', ']'";
        // '(', ')', '{', '[', ']'
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}