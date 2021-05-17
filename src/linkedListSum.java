class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class linkedListSum {
    public static void main(String[] args) {
        ListNode sum=new ListNode();
        System.out.println(sum.val);
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        addNumber(l1,l2);

    }

    private static ListNode addNumber(ListNode l1, ListNode l2) {
        ListNode sum=new ListNode();

        ListNode curr=sum;
        int carry=0;
        while(l1!=null || l2!=null){
            int x= l1!=null? l1.val:0;
            int y= l2!=null? l2.val:0;
            int total=x + y + carry;
            carry=total/10;
            curr.next=new ListNode(total%10);
            curr=curr.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return sum.next;
    }
}
