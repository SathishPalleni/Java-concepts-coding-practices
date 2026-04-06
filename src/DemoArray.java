import java.util.Arrays;

public class DemoArray {

    public static void main (String [] args){

        int [] arr = {1,0,2,0,1,2,0};
        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1){
               mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}

/*
Users (user_id, username, registration_date) and
Posts (post_id, user_id, post_content, post_date)

    Select u.user_id, u.username Count(p.post_id) total_posts
    from Users u  Join u.user_id = p.user_id
where p.psot_date >= CURRENT_DATE - INTERNAL "30 days"
Group by u.user_id u.username
HAVING COUNT(p.post_id) >= 5; */