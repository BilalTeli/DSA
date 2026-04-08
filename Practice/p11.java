class demo
{
    public static int sum(int[] arr , int index)
    {
        if(index==arr.length)
        {
            return 0;
        }
        
        return (arr[index] + sum(arr,index+1));
    }
    
    public static void main(String[] args)
    {
        int arr[]={1,3,2,4,5};
        System.out.println("sum : "+sum(arr,0));
      
    }
}