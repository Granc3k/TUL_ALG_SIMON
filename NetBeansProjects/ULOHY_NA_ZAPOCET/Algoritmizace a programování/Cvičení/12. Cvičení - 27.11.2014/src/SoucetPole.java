public class SoucetPole {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 8};
        int[] array2 = {5, 9, 6, 7};
        int[] array;
              
        array = SoucetPoli(array1, array2);
        
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int[] SoucetPoli(int[] array1, int[] array2){
        int[] array;
        if (array1.length > array2.length){ 
            array = new int [array1.length]; 
        }
        else { 
            array = new int [array2.length]; 
        }

        for (int i = 0; i < array.length; i++){
            if (array1.length < array2.length){ 
                if (i == array1.length){
                    array[i] = array2[i];
                }
                else{
                    array[i] = array1[i] + array2[i];
                }
            }
            else{
                if (i == array2.length){
                    array[i] = array1[i];
                }
                else{
                    array[i] = array1[i] + array2[i];
                }
            }
        }
        return array;
    }
}
