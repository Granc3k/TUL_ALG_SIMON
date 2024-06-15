//Designed by Tomas Moravec
public class Prvocisla {
    public static void main(String[] args) {
        Sito(10);
    }
    public static void Sito (int horniHranice){
        boolean [] array = new boolean [horniHranice + 1];
        for (int i = 0; i < array.length; i++){
            array[i] = true;
        }
        for (int i = 2; i < Math.sqrt(horniHranice); i++){
            if (array[i] == true){
                for (int j = i+1; j < array.length; j +=1){
                    if ((j % i) == 0) {
                        array[j] = false;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == true) System.out.print(i + " ");
        }
    }
}