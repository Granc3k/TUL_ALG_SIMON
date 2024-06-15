public class Arrays {
    public static void main(String[] args) {
        
    }
    
    public static void generateRandom (int[] array, int max){
        if(max < array.length){
            throw new IllegalArgumentException("Rozsah cisel musi byt vetsi nez velikost pole");
        }
        
        boolean[] presence = new boolean[max+1];
        
        for(int i = 0; i < presence.length; i++){
            presence[i] = false;
        }
        
        for (int i = 0; i < array.length; i++){
            int generatedNumber = (int)(Math.random()*(max)+1);
            while (presence[generatedNumber]){
                generatedNumber = generatedNumber%(presence.length-1)+1;
            }
            array[i] = generatedNumber;
            presence[generatedNumber] = true;
        }
    }   
    
    public static int[] sortArray(int []array){
        java.util.Arrays.sort(array); 
        return array;
    }
    
    public static int findPosition (int[] array, int value){
        int index = -1;
        int low = 0;
        int high = array.length-1;
        int half;
        do{
            half = (high+low)/2;
            if(array[half] == value){
                index = half;
            }
            else{
                if (array[half] < value){
                    low = half+1;
                }
                else high = half - 1;
            }
        }while(index == 1 && low <= high);
        
        return index;
    }
    
    public static int[] deleteIndex(int[] array, int index){
        if(index == -1){
            int[] newArray = new int [array.length];
            for(int i = 0; i < newArray.length; i++){
                if(i < index) newArray[i] = array[i];
                /*
                //Najdu prvek ktery je vetsi nez to co chci vlozit. Vlozim na jeho pozici a zbytek posunu o jedna.
                //else if (i == )
                //else if (i > index) newArray[i] = array[i+1];
                        */
                return newArray;  
            }
            return newArray;  
        }
        else{
            int[] newArray = new int [array.length-1];
            for(int i = 0; i < newArray.length; i++){
                if(i < index) newArray[i] = array[i];
                else if (i > index) newArray[i] = array[i+1];
                return newArray;  
            }
        }
        return null;
    }
}