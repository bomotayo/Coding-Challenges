public class FillingArrayWithMaxValue {
    public static void main(String args[]) {
        
         int[] arr={10,20,3};
        int max= arr[0];
        int middle= arr.length/2;
        
        for(int i=0; i<arr.length; i++){
            if(arr.length%2==1 && i== middle)
                continue;
            
            if(arr[i]>max){
                    max= arr[i];
                }
        }
        
        int[] newarr= new int[arr.length];
        
        for(int i=0; i<newarr.length; i++)
            newarr[i]=max;



        System.out.println(max);
        for(int n:newarr)
            System.out.print(n+" ");
    }


/* Original
       int[] arr={10,20,3,2};
        int max= arr[0];
        int x= arr.length/2;
        
        for(int i=0; i<arr.length; i++){
            if(arr.length%2==0){
                if(arr[i]>max){
                    max= arr[i];
                }
            }
            else{
                if(arr[i]>max && i!=x ){
                    max= arr[i];
                }
            }
        }
        int[] newarr= new int[arr.length];
        
        for(int i=0; i<newarr.length; i++)
            newarr[i]=max;

//return newarr;

        System.out.println(max);
        for(int n:newarr)
            System.out.print(n+" ");

    }*/
}
