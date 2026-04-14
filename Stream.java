import java.util.*;
public class Stream {
    public static void main(String[] args) {
        
        // List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // ArrayList <Integer> data= new ArrayList <>();
        // data.addAll(list);
        // data.stream().filter(n-> n>50 && n<=60).forEach(n-> System.out.println(n));

    //      List <String> list = Arrays.asList("Java","Python","C++","JavaScript","Ruby");   
    //    ArrayList <String> data= new ArrayList <>();
    //     data.addAll(list);
    //     data.stream().forEach(n-> System.out.println(n.toUpperCase()));

    // change update manupulate in map grace marks

    // List<Integer> grace5=list.stream().map(mark->mark +5).toList();
    
    // List<Integer> marks= Arrays.asList(10,35,76,56,23,98,26);
    // ArrayList<Integer> list= new ArrayList<Integer>();
    // list.addAll(marks);
    // System.out.println(list);
    // List<Integer> grace5=list.stream().filter(n->n<40).map(mark->mark +5).toList();
    // System.out.println(grace5);

    //  List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
    //     ArrayList <Integer> data= new ArrayList <>();
    //     data.addAll(list);
    //     int c= data.stream().reduce(1,(a,b)->a>b?a:b);
    //     System.out.println(c);

        // List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // ArrayList <Integer> data= new ArrayList <>();
        // data.addAll(list);
        // int c= data.stream().reduce(0,(a,b)->a+1);
        // System.out.println(c);

        // List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // ArrayList <Integer> data= new ArrayList <>();
        // data.addAll(list);
        // int c= data.stream().reduce(0,(a,b)->b%2==0?a+b:a);
        // System.out.println(c);

        //  List <String> list = Arrays.asList("Java","Python","C++","JavaScript","Ruby");   
        // ArrayList <String> data= new ArrayList <>();
        //  data.addAll(list);
        // data.stream().forEach(n-> System.out.println(n.charAt(0)));

        //  List <String> list = Arrays.asList("Java","Python","C++","JavaScript","Ruby");   
        // ArrayList <String> data= new ArrayList <>();
        //  data.addAll(list);
        // String s=data.stream().reduce(" ",(a,b)->a +" "+ b);
        // System.out.println(s);

        // List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // ArrayList <Integer> data= new ArrayList <>();
        // data.addAll(list);
        // int c= data.stream().reduce(0,(a,b)->a + b*b);
        // System.out.println(c);

        // List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // ArrayList <Integer> data= new ArrayList <>();
        // data.addAll(list);
        // int c= data.stream().reduce(0,(a,b)->a + b*b);
        // System.out.println(c);

        // List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // ArrayList <Integer> data= new ArrayList <>();
        // data.addAll(list);
        // int c= data.stream().reduce(1,(a,5)->a);
        // System.out.println(c);

        // List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // ArrayList <Integer> data= new ArrayList <>();
        // data.addAll(list);
        // int c= data.stream().reduce(0,(a,b)->a + b*b);
        // System.out.println(c);

        //  List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        //  int max= list.stream().reduce(1,(a,b)->a>b?a:b);
        //  int result=list.stream().reduce(1,(a,b)->a>b)

        //   List <String> list = Arrays.asList("Java","Python","C++","JavaScript","Ruby");   
        // ArrayList <String> data= new ArrayList <>();
        //  data.addAll(list);
        // String s=data.stream().reduce(" ",(a,b)->a+1);
        // System.out.println(s);

        //List.add(new Stream()           )

        //sorted

        //  List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        // List <Integer> shortestList=list.stream()
        //                 .sorted((a,b)->a-b)
        //                 .toList();
        // System.out.println(shortestList);

        List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
        List <Integer> shortestList=list.stream()
                        .sorted((a,b)->a-b)
                        .toList();
        System.out.println(shortestList);


         List <Integer> list = Arrays.asList(10,15,20,25,30,11,17,16,70,56);
         

    }   
}