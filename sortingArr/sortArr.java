// package sortingArr;

public class sortArr {

    static void display(int[] num){
        for(int val : num){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void sortArr(int[] num){
        int n = num.length;
        int x = -1, y = -1;

        // process all adjacent elements
        for(int i = 1; i<n; i++){
            if(num[i-1] > num[i]){
                if(x == -1){
                    x = i-1;
                    y = i;
                }
                else{
                    y=i;
                }
            }
        } 
        // swap
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }
    public static void main(String[] args){
        int[] num = {10, 5, 6, 7, 8, 9, 3};
        sortArr(num);
        display(num);
    }
}
