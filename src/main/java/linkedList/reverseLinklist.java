/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;

/**
 *
 * @author acer
 */
public class reverseLinklist {

    public static class ListNode {

        int value;
        ListNode next;

        ListNode() {
        }

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            //nextNode la node truoc current node
            ListNode nextNode = cur.next;
            //cat nextNode ra khoi linklist
            cur.next = nextNode.next; 
            //gan nextNode vao head
            nextNode.next = head; 
            //gan head vao nextNode
            head = nextNode;
        }
        return head;
    }
    
    public static void printListNode (ListNode head){
        while (head!= null) {
            System.out.print(head.value + "  ");
            head = head.next; 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2; a2.next = a3; 
        printListNode(a1);
        ListNode newList = reverseList(a1);
        printListNode(newList);
    }
}
