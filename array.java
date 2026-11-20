public class array {

    public static void main(String[] args) {
        int[] arr = {4,2,7,2,8,3,4,1};
        int count =0;
        System.out.println("Дубликаты в массиве: ");

        for (int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    count++;
                }
            }
        }
    }
}