
 package singleLinkedList;

public class test {
 
    Node startNode;
     
    public static void main(String[] args) {
        new test();
    }
     
    public test() {
         
        addNode(new Node(10));
        addNode(new Node(20));
        addNode(new Node(30));
        addNode(new Node(40));
        addNode(new Node(50));
        addNode(new Node(60));
        addNode(new Node(70));
 
        printLinkList();    
         
        int nthLastNodeData = getNthLastNodeFromLinkListRecursive(startNode, 5);
        if(nthLastNodeData!=-1){
            System.out.println("Nth last node is :"+nthLastNodeData);
        }else{
            System.out.println("Input out of linked list range.");
        }
    }
 
    static int count;
    private int getNthLastNodeFromLinkListRecursive(Node startNode, int nodeFromLast) {
        if(startNode==null){
            return -1;
        }
 
        //Recurse till last.
        int data = getNthLastNodeFromLinkListRecursive(startNode.next, nodeFromLast);
         
         
        //count is static, so it will preserve state across recursive calls.
        //Note: we started incrementing count after all recursive call, 
        //because we need Nth node from last, otherwise we would have increment count before recursive call for Nth node from start.
        count++;
         
        //when count value matched the nodeFromLast, we will return node value and from this point onwards, 
        //returned value is same across all up recursive calls.
        if(count==nodeFromLast){
            return startNode.data;
        }
         
        return data; 
    }
             
    private void printLinkList() {
        Node tempNode1 = startNode;
        while(tempNode1!=null){
            System.out.print(tempNode1.data + " ");
            tempNode1 = tempNode1.next;
        }
        System.out.println("\n============================================");
    }
 
    private void addNode(Node node) {
        if(startNode!=null){
            Node tempNode1 = startNode;
            while(tempNode1.next!=null){
                tempNode1 = tempNode1.next;
            }
            tempNode1.next = node;
        }else{
            this.startNode = node;
        }
    }
     
}
