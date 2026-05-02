package org.example.Smart_Diet;

import java.sql.SQLOutput;

public class NodeAndLinkedL {
        private int size;
        private Node head;
        private  Node tail;
        // methods

        public int getSize() {
                return this.size;
        }
        // get size

        // add from head

        void addATHead(String foodName,String category,double crabs, int price, double fats, double calories, double proteins){
                Node tempHead = new Node( foodName, category, crabs,  price,  fats,  calories,  proteins);
                if(head == null){
                        head = tempHead;
                        tail = tempHead;
                }
                else {
                        tempHead.next= head;
                        head = tempHead;
                }
                size++;
        }
        // add from tail as usual
        void addAtTail(String foodName,String category,double crabs, int price, double fats, double calories, double proteins){
                if( head == null){
                        addATHead(foodName, category, crabs,  price,  fats,  calories,  proteins);
                        return;
                }
                else {
                        Node tempTail = new Node(foodName, category, crabs,  price,  fats,  calories,  proteins);
                        tail.next= tempTail;
                        tail= tempTail;
                }
                size++;
        }
        // display all
        void displayAll(){
            if(head == null) {
                System.out.println(" There is no item in list>.......");

                return;
            }
                Node loop = head;
                System.out.println("Name    "+ "    Type "+ "     Price "+"     Calories "+"  fats "+"  crabs "+"  proteins ");
                while(loop != null){
                        System.out.println(loop.foodName+"      "+loop.category+"       "+loop.price+"       "+loop.calories+"        "+loop.fats+"     "+loop.crabs+"      "+loop.proteins);
                        loop=loop.next;
                }
        }
        // delete from head
        void deleteAtHead(){
                if(head == null)
                {
                        System.out.println(" list is empty ");
                        return;
                }
                else {
                        head=head.next;
                }
                size--;
        }
        // delete from tail

       void deleteAtTail(){
                if(head == null) {
                        System.out.println(" list is null");
                        return;
                }
                if(head.next == null){
                    tail = null;
                    head = null;
                    size--;
                    return;
                }

                        Node temp ;
                        for (temp= head; temp.next.next!=null ; temp=temp.next) {


                        }
                        temp.next = null;
                        tail = temp;
                        size--;

       }
       // filter
        // view by category
        void displayFilter(String userCategory){
            if(head == null){
                System.out.println(" list is empty ...");
                return;
            }
            boolean found  = false;


                System.out.println("All "+userCategory);
                Node temp = head;

                while(temp !=  null) {
                    if (temp.category.equalsIgnoreCase(userCategory)) {
                        System.out.println(temp.foodName + "      " + temp.category + "       " + temp.price + "       " + temp.calories + "        " + temp.fats + "     " + temp.crabs + "      " + temp.proteins);
                        found = true;
                    }
                    temp = temp.next;
                }
                     if(!found){
                         System.out.println(userCategory+" is  not found");
                     }


        }
        // search by budget
        void searachByBudget(int budget){
                if(head== null) return;
                Node temp = head;
                if(temp.price != budget){
                        System.out.println(" this budget is not exist in list ");
                        return;
                }
               while (temp != null){
                       if(temp.price == budget) {
                               System.out.println(temp.foodName + "      " + temp.category + "       " + temp.price + "       " + temp.calories + "        " + temp.fats + "     " + temp.crabs + "      " + temp.proteins);
                       }
                       temp= temp.next;
               }

        }
        // clean list
        void cleanList(){

             head = null;
             tail = null;
             size = 0;

        }
        // update price
    void update(int price,String name){

            if(head == null){
                System.out.println(" there is not exist any item in list ");
                return;
            }

        for (Node tem = head; tem !=null  ; tem=tem.next) {
            if(tem.foodName.equalsIgnoreCase(name) )
            {
                tem.price= price;
            }

        }
    }
    // smart suggestions
    void smartSuggest(){
            if(head == null){
                System.out.println(" list is empty .....");
                return;
            }
            // for iterations
            Node tempo = head;
            // maxmim protien
            Node high = null, higher = null, highest = null;

            while( tempo != null){
                // check for highest proteins
                //if highest found high protein will be higher , higher p = last highest
                // and highest = new update
                if( highest == null || tempo.proteins > highest.proteins){
                 high = higher;
                 higher= highest;
                    highest = tempo;
                }
                // if protein is less then highest but > then higher
                else if(tempo != highest &&( higher == null || tempo.proteins > higher.proteins)){
                 high = higher;
                 higher = tempo;
                }
                // third case
                else if (tempo != higher &&(high == null || tempo.proteins > high.proteins)) {
                 high = tempo;

                }
                tempo = tempo.next;
            }
            // suggest
        System.out.println("SMART SUGGESTION");
        System.out.println(" TOP 3 HIGHEST PROTEIN FOODS ");
        if(highest != null) {
            System.out.println("Name    " + "    Type " + "     Price " + "     Calories " + "  fats " + "  crabs " + "  proteins ");
            System.out.println(highest.foodName + "      " + highest.category + "       " + highest.price + "       " + high.calories + "        " + highest.fats + "     " + highest.crabs + "      " + highest.proteins);
        }
        if(higher != null){
            System.out.println(higher.foodName + "      " + higher.category + "       " + higher.price + "       " + higher.calories + "        " + higher.fats + "     " + higher.crabs + "      " + higher.proteins);

        }
        if(high != null){
            System.out.println(high.foodName + "      " + high.category + "       " + high.price + "       " + high.calories + "        " + high.fats + "     " +high.crabs + "      " + high.proteins);


        }

    }
    //
    // lowest budget
    void lowBudget(){

    }


}
