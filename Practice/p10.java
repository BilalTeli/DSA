class demo
{
    public static void printarray(int[] arr , int index)
    {
        if(index<0)
        {
            return;
        }
        
        printarray(arr,index-1);
        System.out.print(arr[index]+" ");
    }
    public static void main(String[] args)
    {
        int arr[]={1,3,2,4,5};
        System.out.println("Array : ");
        printarray(arr,arr.length-1);
    }
}