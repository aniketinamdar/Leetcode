package com.company;

import java.util.List;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    //insert using recursion
    public void insert_recursion(int val, int index) {
        head = insert_recursion(val, index, head);
    }

    private Node insert_recursion(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insert_recursion(val, index - 1, node.next);
        return node;
    }

    public void insertAtPos(int val, int pos) {
        if (pos == 0) {
            insertFirst(val);
            return;
        }
        if (pos == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        Node temp = head;
        head = temp.next;
        size--;
        if (head == null) {
            tail = null;
        }
    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPos(int pos) {
        if (pos == 0) {
            deleteFirst();
        }
        if (pos == size - 1) {
            deleteLast();
        }
        Node prev = get(pos - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    private class Node {
        private int value;
        private Node next; // referencee variable pointing to an object

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // questions
    public void delete_duplicates() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    public static LL merge_linkedlist(LL first, LL second) {
        Node curr1 = first.head;
        Node curr2 = second.head;
        LL ans = new LL();
        while (curr1 != null && curr2 != null) {
            if (curr1.value < curr2.value) {
                ans.insertLast(curr1.value);
                curr1 = curr1.next;
            } else {
                ans.insertLast(curr2.value);
                curr2 = curr2.next;
            }
        }
        while (curr1 != null) {
            ans.insertLast(curr1.value);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            ans.insertLast(curr2.value);
            curr2 = curr2.next;
        }
        return ans;
    }
//Linked List Cycle

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
//    public class Solution {
//        public boolean hasCycle(ListNode head) {
//            ListNode fast = head ;
//            ListNode slow = head ;
//            while(fast != null && fast.next!= null)
//            {
//                fast = fast.next.next ;
//                slow = slow.next;
//                if(fast==slow)
//                {
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
    //find length of cycle
    public class Solution {
        public int lengthCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    ListNode temp = slow;
                    int length = 0;
                    do {
                        temp = temp.next;
                        length++;
                    } while (temp != slow);
                    return length;
                }
            }
            return 0;
        }


// starting point of cycle

        public ListNode detectCycle(ListNode head) {
            int length = 0;
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    length = lengthCycle(slow);
                    break;
                }
            }
            if (length == 0) {
                return null;
            }
            //find start
            ListNode pointer1 = head;
            ListNode pointer2 = head;
            while (length > 0) {
                pointer2 = pointer2.next;
                length--;
            }
            while (pointer1 != pointer2) {
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
            return pointer2;
        }

        //is happy number
        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do {
                slow = findSquare(slow);
                fast = findSquare(findSquare(fast));
            } while (fast != slow);
            if (slow == 1) {
                return true;
            }
            return false;
        }

        private int findSquare(int num) {
            int ans = 0;
            while (num > 0) {
                int rem = num % 10;
                ans = ans + rem * rem;
                num = num / 10;
            }
            return ans;
        }

        //middle of linked list
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        //sorted link list
        public void bubble_sort() {
            bubble_sort(size - 1, 0);
        }

        private void bubble_sort(int row, int col) {
            if (row == 0) {
                return;
            }
            if (col < row) {
                Node first = get(col);
                Node second = get(col + 1);
                if (first.value > second.value) {
                    //swap
                    if (first == head) {
                        head = second;
                        first.next = second.next;
                        second.next = first;
                    } else if (second == tail) {
                        Node prev = get(col - 1);
                        prev.next = second;
                        tail = first;
                        first.next = null;
                        second.next = tail;
                    } else {
                        Node prev = get(col - 1);
                        prev.next = second;
                        first.next = second.next;
                        second.next = first;
                    }
                }
                bubble_sort(row, col + 1);
            } else {
                bubble_sort(row - 1, 0);
            }
        }

        //recursion reverse linked list
        private void reverse(Node node) {
            if (node == tail) {
                head = tail;
                return;
            }
            reverse(node.next);

            tail.next = node;
            tail = node;
            tail.next = null;
        }

        //inplace reversal of linked list
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode prev = null;
            ListNode present = head;
            ListNode next = present.next;
            while (present != null) {
                present.next = prev;
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }
            head = prev;
            return head;
        }
        //Reorder List
        public void reorderList(ListNode head) {
            if (head == null || head.next == null) {
                return;
            }
            ListNode mid  = middleNode(head);
            ListNode hs = reverseList(mid);
            ListNode hf = head ;

            while(hf!=null && hs!=null) {
                ListNode temp = hf.next ;
                hf.next = hs ;
                hf = temp ;

                temp = hs.next;
                hs.next = hf ;
                hs = temp;
            }
            if (hf!=null)
            {
                hf.next = null;
            }
        }
        //Reverse ll in k nodes grp

        //Reverse a linked list
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (left == right) {
                return head;
            }
            //skip 1st left-1 nodes
            ListNode present = head;
            ListNode prev = null;
            for (int i = 0; present != null && i < left - 1; i++) {
                prev = present;
                present = present.next;
            }
            ListNode last = prev;
            ListNode newEnd = present;

            ListNode next = present.next;
            for (int i = 0; present != null && i < right - left + 1; i++) {
                present.next = prev;
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = present;
            return head;
        }

        //Palindrome linked list
        public boolean isPalindrome(ListNode head) {
            ListNode mid = middleNode(head);
            ListNode headSecond = reverseList(mid);
            ListNode rereverseHead = headSecond ;
            while (head!=null && headSecond != null) {
                if (head.val != headSecond.val) {
                    break;
                }
                head = head.next;
                headSecond = headSecond.next;}
                reverseList(rereverseHead);
            if (head==null || headSecond==null)
            {
                return true;
            }
            return false;
        }

        //Binary to decimal in ll
        public int getDecimalValue(ListNode head) {
            if (head == null) {
                return 0;
            }
            //calculate length of linked list
            ListNode length = head;
            int len = 0;
            while (length != null) {
                len++;
                length = length.next;
            }
            ListNode temp = head;
            int ans = 0, i = len;
            while (temp != null) {
                ans = ans + (int) Math.pow(2, i) * temp.val;
                i--;
                temp = temp.next;
            }
            return ans;
        }


        //Intersection of two linked list
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode l1 = headA;
            ListNode l2 = headB;
            int len1 = 0, len2 = 0;
            while (l1 != null) {
                len1++;
                l1 = l1.next;
            }
            while (l2 != null) {
                len2++;
                l2 = l2.next;
            }
            l1 = headA;
            l2 = headB;
            int diff = 0;
            if (len1 > len2) {
                diff = len1 - len2;
                while (diff > 0) {
                    l1 = l1.next;
                    diff--;
                }
            }
            if (len1 < len2) {
                diff = len2 - len1;
                while (diff > 0) {
                    l2 = l2.next;
                    diff--;
                }
            }
            while (l1 != null) {
                if (l1 == l2) {
                    return l1;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            return null;
        }

        //Swapping Nodes in a Linked List
//    https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
        public ListNode swapNodes(ListNode head, int k) {
            ListNode length = head;
            int len = 1;
            if (length == null) {
                len = 0;
            }
            while (length != null) {
                length = length.next;
                len++;
            }
            ListNode start = head;
            ListNode end = head;
            int i = 1, j = 1;
            if (k <= len) {
                while (i <= k - 1) {
                    start = start.next;
                    i++;
                }
                while (j <= len - k - 1) {
                    end = end.next;
                    j++;
                }
                ListNode temp1 = end.next;
                ListNode temp2 = start.next;
                start.next = end.next;
                temp1.next = start.next.next;
                temp2.next = end.next.next;
                end.next = temp2;
            }
            return head;
        }
    }
    //add two numbers
//    public ListNode addTwoNumbers(ListNode l1, Li stNode l2) {
//        ListNode first_num = l1 ;
//        ListNode second_num = l2 ;
//        ListNode ans = new ListNode();
//        while (first_num!=null && second_num !=null)
//        {
//            if (first_num.val + second_num.val < 10)
//            {
//                ans.val = first_num.val + second_num.val ;
//                first_num = first_num.next;
//                second_num = second_num.next;
//                ans = ans.next;
//            }
//            else
//            {
//                ans.val = (first_num.val + second_num.val)%10 ;
//                first_num = first_num.next;
//                second_num = second_num.next;
//                ans = ans.next;
//                ans.next.val += 1 ;
//            }
//            if (first_num==null)
//            {
//                while (second_num!=null)
//                {
//                    ans = second_num ;
//                    ans = ans.next;
//                    second_num=second_num.next;
//                }
//            }
//            if (second_num==null)
//            {
//                while (first_num!=null)
//                {
//                    ans = first_num ;
//                    ans = ans.next;
//                    first_num=first_num.next;
//                }
//            }
//        }
//        return  ans;
//        }
//    }
}

    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }



    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.display();
        System.out.println();
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        second.display();
        System.out.println();
        LL ans = LL.merge_linkedlist(first,second);
        ans.display();
    }

}
