import java.util.Scanner;

public class Selection_Sort {

    public static void selectionSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int min = i;

            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }

            if(min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        selectionSort(nums);

        System.out.println("Sorted Array:");

        for(int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}