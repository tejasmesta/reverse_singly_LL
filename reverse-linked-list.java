class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        
        ListNode prev = null;
        
        while(cur!=null)
        {
            ListNode forw = cur.next;
            cur.next = prev;
            prev = cur;
            cur = forw;
        }
        
        return prev;
    }   
    
}
