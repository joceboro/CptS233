/*
Jocelyn Borovich
CptS 233: PA #1
9/18/2020
gitRepo url:https://github.com/joceboro/CptS233/tree/master/PA1-Benchmarking
*/

import java.util.*; 
import java.io.*;

public class Benchmarking { 

    LinkedList<Integer> list = new LinkedList<Integer>();
    File file;
    int size;

    //constructor
    public Benchmarking() {
    }

    //Reads in values from the file, sorts them, and then inserts them into a LinkedList
    public void insert() throws FileNotFoundException {

        TreeSet<Integer> set = new TreeSet<Integer>(); 
        Scanner scanner = new Scanner(file);

        //reads values and sorts them least to greatest with a TreeSet
        while (scanner.hasNextInt()) {
            set.add(scanner.nextInt());
        }

        size = set.size();
        Iterator<Integer> iterator = set.iterator(); 

        //insert the sorted values into the LinkedList
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

    //calculates the median of the LinkedList
    public double getMed() {

        double med; 

        if(size % 2 == 0) {
            int x = list.get(size / 2); 
            int y = list.get((size / 2) + 1);
            med = (double)(x + y) / 2;
        } else {
            med = list.get((size / 2) + 1);
        }

        return med;
    }
    
    //Main function***************************************************************************
    public static void main(String[] args) throws Exception { 

        double totalStart = System.nanoTime();

        Benchmarking benchmarking = new Benchmarking();

        benchmarking.file = new File(args[0]);

        //calls the function to insert and sort the values while tracking the time
        double start =  System.nanoTime();
        benchmarking.insert();
        double finish =  System.nanoTime();
        double time_insert = finish - start;

        //calculates the min while tracking the time
        start = System.nanoTime();
        int min = benchmarking.list.getFirst();
        finish = System.nanoTime();
        double time_min = finish - start;

        //calculates the max while tracking the time
        start = System.nanoTime();
        int max = benchmarking.list.getLast();
        finish = System.nanoTime();
        double time_max = finish - start;

        //calculates the median (calls getMed function) while tracking the time
        start = System.nanoTime();
        double med = benchmarking.getMed();
        finish = System.nanoTime();
        double time_med = finish - start;


        double totalFinish = System.nanoTime();
        
        //Prints all the results
        System.out.println("Min Value: " + min);
        System.out.println("Max Value: " + max);
        System.out.println("Med Value: " + med);
        System.out.println();
        System.out.println("Min calculation time: " + time_min + "ns");
        System.out.println("Max calculation time: " + time_max + "ns");
        System.out.println("Med calculation time: " + time_med + "ns");
        System.out.println("Sorting and inserting time: " + (double)time_insert/1000000 + "ms " + "(" + time_insert + "ns)");
        System.out.println();
        System.out.println("Total Time of Program: " + (double)((totalFinish - totalStart)/1000000) + "ms" + " (" + (double)(totalFinish - totalStart) + "ns)");
        System.out.println("Length of file: " + benchmarking.size + " lines");
    } 
} 