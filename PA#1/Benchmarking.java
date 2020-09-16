import java.util.*; 
import java.io.*;
  
//https://www.java67.com/2012/11/how-to-read-file-in-java-using-scanner-example.html
//https://www.geeksforgeeks.org/treeset-in-java-with-examples/#:~:text=TreeSet%20is%20one%20of%20the,an%20explicit%20comparator%20is%20provi

public class Benchmarking { 

    public static LinkedList<Integer> insert(File data) throws FileNotFoundException {

        TreeSet<Integer> set = new TreeSet<Integer>(); 
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(data);

        while (scanner.hasNextInt()) {
            set.add(scanner.nextInt());
        }

        Iterator<Integer> iterator = set.iterator(); 

        while (iterator.hasNext()) {
            list.add(iterator.next());
        }

        return list;
    }
  
    public static void main(String[] args) throws FileNotFoundException { 

        File file = new File(args[0]);

        double start = System.currentTimeMillis();

        LinkedList<Integer> list = insert(file); 

        double finish = System.currentTimeMillis();

        Double time_insert = finish - start;

        System.out.println(time_insert);

    } 
} 