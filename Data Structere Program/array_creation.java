import java.util.Scanner;

public class array_creation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter values: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Elements are: ");
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }

        System.out.println("");

        System.out.println("If you want to add element write(yes/no)");
        String choice = sc.next();
        if(choice.equals("yes")) {
            int[] b = new int[n+1];

            System.out.println("Elements position of element to ADD: ");
            int position = sc.nextInt();

            System.out.println("Elements position value to ADD: ");
            int value = sc.nextInt();

            for(int i = 0; i < n+1; i++) {
                if(i < position) {
                    b[i] = arr[i];
                }
                else if(i == position) {
                    b[i] = value;
                }else{
                    b[i] = arr[i-1];
                }
            }

            System.out.println("Elements are: ");
            for(int j = 0; j < n+1; j++) {
                System.out.print(b[j]+" ");
            }
            arr = b;
        }

        System.out.println();

        System.out.println("If you want to DELETE element write(yes/no)");
        String deletechoice = sc.next();
        if(deletechoice.equals("yes")) {
            System.out.println("Enter position of element to DELETE ");
            int position2 = sc.nextInt();        
            if(position2 < 0 ||  position2 >= arr.length) {
                System.out.println("Invalid Position");
                return;
            }

            int[] c = new int[arr.length-1];
            int j = 0;
            for(int i = 0; i < arr.length; i++) {
                if(i == position2) {
                    continue;
                }
                c[j++] = arr[i];
            }

            arr = c;
            System.out.println("Elements values: ");
            for(int k = 0; k < c.length; k++) {
                System.out.print(c[k]+"  ");
            }
        } else {
            System.out.println("No deletion performed.");
        }
    }
}
