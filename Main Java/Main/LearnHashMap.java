import java.util.*;

public class LearnHashMap {


    public static void main(String[] args) {

        // 1. Sample Data
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Ali");
        students.put(2, "Neema");
        students.put(3, "John");
        students.put(4, "Mary");
        students.put(5, "Asha");
        students.put(6, "Brian");
        students.put(7, "Grace");
        students.put(8, "Daniel");
        students.put(9, "Peter");
        students.put(10, "Sara");
        students.put(11, "Joseph");
        students.put(12, "Fatma");
		
/* 		for(String student: students.values()){
			System.out.println(student);			
		} */
		
		for(Map.Entry<Integer, String> entry: students.entrySet()){
			System.out.printf("key is %d and value is %s%n",entry.getKey(),entry.getValue());
		}
     
    }
}


import java.util.Iterator;

// Iterator class for SimpleNumbers
class SimpleNumbersIterator implements Iterator<Integer> {
    private int[] numbers;
    private int index = 0;

    public SimpleNumbersIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return index < numbers.length;
    }

    @Override
    public Integer next() {
        return numbers[index++];
    }
}

// Iterable class
class SimpleNumbers implements Iterable<Integer> {
    private int[] numbers;

    public SimpleNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SimpleNumbersIterator(numbers); // return the separate iterator
    }

    public static void main(String[] args) {
        SimpleNumbers nums = new SimpleNumbers(new int[]{1, 2, 3, 4, 5});

        // Using for-each loop
        for (int n : nums) {
            System.out.println(n);
        }
    }
}


import java.util.Iterator;

// Our class implements Iterable<Integer>
class SimpleNumbers implements Iterable<Integer> {
    private int[] numbers;

    public SimpleNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    // Implement the iterator() method
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < numbers.length;
            }

            @Override
            public Integer next() {
                return numbers[index++];
            }
        };
    }

    public static void main(String[] args) {
        SimpleNumbers nums = new SimpleNumbers(new int[]{1, 2, 3, 4, 5});

        // Using for-each loop because SimpleNumbers is iterable
        for (int n : nums) {
            System.out.println(n);
        }
    }
}


Iterator<Integer> it = nums.iterator();
while (it.hasNext()) {
    int n = it.next();
    // do something with n
}
