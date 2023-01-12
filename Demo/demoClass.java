package Demo;

import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.LinkedList;
import java.util.List;

public class demoClass {
    
    int demoNum;
    String demoName;
    int demoMarks;
    public demoClass(int demoNum, String demoName, int demoMarks) {
        this.demoNum = demoNum;
        this.demoName = demoName;
        this.demoMarks = demoMarks;
    }

    void display(){
        System.out.print(demoNum+" ");
        System.out.print(demoName+" ");
        System.out.print(demoMarks+" ");
        System.out.println();
    }
     
    public static void main(String[] args) {
        demoClass d1 = new demoClass(1, "Satyam", 75);
        demoClass d2 = new demoClass(2, "Shivam", 83);
        demoClass d3 = new demoClass(3, "Sundaram", 80);

        List<demoClass> list = new ArrayList<>();
        
        list.add(d1);
        list.add(d2);
        list.add(d3);

        System.out.println(list.size());
        for(demoClass i : list){
            i.display();
        }
        list.indexOf(d2);

        // Iterator it = list.iterator();
        // while(it.hasNext()){
        //     demoClass obj1 = (demoClass) it.next();
        //     obj1.display();
        // }

        //LinkedList<Integer> list2 = new LinkedList<>();
    }

}
