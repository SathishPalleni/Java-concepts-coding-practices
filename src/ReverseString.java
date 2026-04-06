public class ReverseString {

    public static String reverse(String  str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main (String [] args){
        String  str = "Sathish";
        System.out.println(reverse(str));
        // hsihtaS
    }
}

// area     = width * height
     //
//       =( right - left ) * min(height[left], height[right])
