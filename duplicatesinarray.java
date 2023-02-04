
class HelloWorld {
    public static void printDuplicates(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int num = Math.abs(arr[i]);
            if(arr[num] > 0) {
                arr[num] = -arr[num];
            } else {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        int []arr = new int[]{4,2,4,5,2,3,1,2,4};
        printDuplicates(arr);
    }
}
