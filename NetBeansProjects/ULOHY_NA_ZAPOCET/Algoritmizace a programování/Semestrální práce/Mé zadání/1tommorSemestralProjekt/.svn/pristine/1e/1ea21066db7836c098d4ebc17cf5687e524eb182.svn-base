import java.util.Scanner; //Import of library for console input

/**
 * 1 Program searches for the longest sorted subsequence in a given sequence
 *    - The program has the output list:
 *          a) Length of the longest sorted subsequence
 *          b) First index of the first longest sorted subsequence
 *    - Input specifications
 *          - The program should allow to execute any number of tasks
 *            Each sequence will be awarded a number of elements, 
 *            then the individual elements, The program has to end if the
 *            specified sequence length is smaller than 1
 * @author Tomáš Moravec
 * @version 1.0 23/12/2014
 */
public class Main {
    
    /**
     * Main task is finding the length of a sequence, calling other methods and quit. 
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{ //Try do this program
            //Declaration
            Scanner scan = new Scanner(System.in); //Scanner declaration
            int sequence_length; //Personally, I hope that this needs no comment

            //Program ends if the sequence length is less than 1, otherwise, find the length of the sequence
            System.out.print("Enter length of the sequence: ");

            while((sequence_length = scan.nextInt()) > 0){  
                int[] sequence = new int [sequence_length]; //Allocates memory for array of int with specified dimension
                int[] data_container = new int [2]; //Creates a container for the informations [index, length]

                System.out.print("Enter the sequence: ");
                sequence = load_sequence(sequence); //Calls a method that loads data into the array

                data_container = find_longest_subsequence(sequence, data_container); //I think the title speaks for itself
                System.out.println("Longest part of the sorted length is " + data_container[1]); //Print of length
                System.out.println("Begins with " + data_container[0] + ". element \n"); //Print of first element

                System.out.print("Enter length of the sequence: ");
            }
        } catch (Exception e){ //Exception of only one error which may occur
            System.out.println("ERROR --- Values must be type of int --- ");
        }
    }
    
    /**
     * Reads data from standard input and inserts them into an Array.
     * 
     * @param sequence empty array with specified length
     * @return array filled with values
     */
    public static int[] load_sequence (int[] sequence){
        Scanner scan = new Scanner(System.in); //This we have already seen
        
            for (int i = 0; i < sequence.length; i++){ 
                sequence[i] = scan.nextInt(); //Retrieve data
            }

        return sequence; //Return filled sequence. Hope...
    }
    
    /**
     * Search for length of longest sorted subsequence, and index of the first element.
     * 
     * @param sequence array filled with sequence of numbers
     * @param data_container array to store founded informations
     * @return array of founded informations [index, length]
     */
    public static int[] find_longest_subsequence (int[] sequence, int[] data_container){
        int length_longest = 1; //Longest yet found subsequence
        int length_current = 1; //The length of the sequence currently being explored
        int index_first = 0; //Index of the first element current sorted subsequence
        int index_first_longest = 0; //Index of the first element longest sorted subsequence
        
        for (int i = 1; i < sequence.length ;i++){ //Browsing sequence from the second element
            if (sequence[i] >= sequence [i-1]){ //If the current element is larger or equal than the previous member
                length_current++; //Increase the length of current sequence of 1
            }
            else{ //Else if current element is smaller ther previous one
                length_current = 1; //Start counting the length of the sequence from the beginning
                index_first = i; //Writes the new first element
            }
            
            if (length_current > length_longest){ //If current length is bigger then longest
                length_longest = length_current; //Save current length as longest
                index_first_longest = index_first; //And set first index of current as index of longest
            }
        }
        
        data_container[0] = index_first_longest + 1; //On first position set index + 1 because we want position, not index
        data_container[1] = length_longest; //On second position set length
        
        return data_container; //Returns information about the first index and the length of the longest subsequence.
    }
}