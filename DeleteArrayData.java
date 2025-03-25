import java.util.*;

public class DeleteArrayData {
    
    public static void main(String[] args) {
        //I changed this line using GitHub code editor
        int[] arr = new int[10];
        int size =5;

        Scanner UserIn = new Scanner(System.in);

        System.out.println("Enter Data : ");
        for(int j=0; j<size; j++){
            arr[j] = UserIn.nextInt();
        }

        System.out.println("Output of Array ");
        for(int i=0; i<size;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the Index : ");
        int ind = UserIn.nextInt();

        for(int j=ind; j<size; j++){
            arr[j] = arr[j+1];
        }

        size--;

        System.out.println("Output of Array ");
        for(int i=0; i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
