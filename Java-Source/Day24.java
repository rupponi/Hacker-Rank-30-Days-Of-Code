//DAY 24 OF HACKERRANK 30 DAY CHALLENGE: MORE LINKED LISTS (JAVA)

import java.util.*;
class day24Node{
    int data;
    day24Node next;
    day24Node(int d){
        data=d;
        next=null;
    }

}
class Day24
{
    public static day24Node removeDuplicates(day24Node head) {
        ArrayList<Integer> alreadyUsed = new ArrayList<Integer>();
        day24Node traverser = head;
        alreadyUsed.add(head.data);

        while (traverser.next != null) {
            if (alreadyUsed.contains(traverser.next.data)) {
                traverser.next = traverser.next.next;
            }
            else {
                alreadyUsed.add(traverser.next.data);
                traverser = traverser.next;
            }
        }
        return head;
    }
    public static  day24Node insert(day24Node head,int data)
    {
        day24Node p=new day24Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            day24Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(day24Node head)
    {
        day24Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        day24Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}