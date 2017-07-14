package Question1;
public class TestMyList {
    
    public static void main(String[] args) {
        Part1();
        Part2();
        Part3();
    }
    
    public static void Part1(){
        System.out.println("PART 1");
        String[] list1 = {"Tom", "George", "Peter", "Jean", "Jane"};
        String[] list2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};

        MyArrayList<String> myList1 = new MyArrayList<String>(list1);
        MyArrayList<String> myList2 = new MyArrayList<String>(list2);
        
        System.out.println(myList1.addAll(myList2));
        System.out.println(myList1.toString());
        System.out.println(myList2.toString());
        System.out.println();
    }
    
    public static void Part2(){
        System.out.println("PART 2");
        String[] list1 = {"Tom", "George", "Peter", "Jean", "Jane"};
        String[] list2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};

        MyArrayList<String> myList1 = new MyArrayList<String>(list1);
        MyArrayList<String> myList2 = new MyArrayList<String>(list2);
        
        System.out.println(myList1.removeAll(myList2));
        System.out.println(myList1.toString());
        System.out.println(myList2.toString());
        System.out.println();
    }
    
    public static void Part3(){
        System.out.println("PART 3");
        String[] list1 = {"Tom", "George", "Peter", "Jean", "Jane"};
        String[] list2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};

        MyArrayList<String> myList1 = new MyArrayList<String>(list1);
        MyArrayList<String> myList2 = new MyArrayList<String>(list2);
        
        System.out.println(myList1.retainAll(myList2));
        System.out.println(myList1.toString());
        System.out.println(myList2.toString());
        System.out.println();
    }
}
