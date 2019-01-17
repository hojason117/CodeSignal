// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
//     if(l == null)
//         return null;
    
    ListNode<Integer> preHead = new ListNode(-1001);
    preHead.next = l;
    ListNode<Integer> pointer = preHead;
    while(pointer.next != null) {
        if(pointer.next.value == k)
            pointer.next = pointer.next.next;
        else
            pointer = pointer.next;
    }
    
    return preHead.next;
}
