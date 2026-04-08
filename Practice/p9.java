class demo
{
    public static void printarray(int[] arr , int index)
    {
        if(index==arr.length)
        {
            return;
        }
        System.out.print(arr[index]+" ");
        printarray(arr,index + 1);
    }
    public static void main(String[] args)
    {
        int arr[]={1,3,2,4,5};
        System.out.println("Array : ");
        printarray(arr,0);
    }
}