package org.example.Smart_Diet;

public class DriverClass {
    public static void main(String[] args) {
        NodeAndLinkedL  test = new NodeAndLinkedL();
        test.addAtTail("onion","vage",3.5,100,6.0,12,607.89);
        test.addATHead("Apple","fruit",3.5,100,6.0,12,617.89);
        System.out.println("size "+ test.getSize());
        test.addAtTail("bnana","fruit",9.5,110,6.10,22,7.89);
        System.out.println("size "+ test.getSize());
        test.addATHead("mango","fruit",3.5,122,6.0,12,6.89);
        System.out.println("size "+ test.getSize());
        test.addAtTail("bnana","fruit",9.5,110,6.10,22,167.89);

        test.addAtTail("potato","veg",9.5,10,6.10,21,67.89);

      //  test.deleteAtTail();
        //test.deleteAtTail();
        test.displayAll();
        test.displayFilter("fru");
        test.searachByBudget(90);
        test.update(340,"bnana");
       // test.displayAll();
        //test.cleanList();
       // test.displayAll();
        test.displayFilter("veg");
        test.deleteAtTail();
        test.displayAll();
        test.smartSuggest();
        test.deleteAtHead();
        test.displayAll();

    }
    // clean list

}
