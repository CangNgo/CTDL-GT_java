package linkedList;

public class singleLinkList {

    public static class Node {

        int value;
        Node next;

        Node(int valeue) {
            this.value = valeue;
        }
    }

    //them phan tu vao dau linklist 
    public static Node addToHead(Node headNode, int value) {
        //tao node moi voi gia tri la value duoc truyen vao
        Node newNode = new Node(value);
        //neu list da ton tai moi them vao, neu list chua ton tai thi khoi tao newNode nhu 1 list moi
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    //them phan tu vao giua linklist 
    //b1 tim cur va next 
    //b2 tro new vao next va tro cur vao new 
    public static Node addToIndex(Node headNode, int value, int index) {
        Node newNode = new Node(value);
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            Node curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                //neu tim duoc vi tri thi thuc hien them
                if (count == index) {
                    //thuc hien them vao
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                //khong tim duoc vi tri thi nhay sang node tiep theo
                curNode = curNode.next;

            }
        }
        return headNode;
    }

    public static void printLinkList(Node head) {
        if (head == null) {
            System.out.println("Linklist is empty");
        } else {
            //gan head node cho temp 
            Node temp = head;
            //duyet toi phan tu cuoi cung cua linklist, phan tu ma linklist tro den null
            while (temp != null) {
                //in ra gia tri temp
                System.out.print(temp.value);
                //tro phan tu den phan tu tiep theo
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    //them vao cuoi list 
    //b1 xac dinh phan tu lastNode, phan tu last la phan tu ma next cua no tro den null
    //b2 tro lastNode vao newNode
    public static Node addtoTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            return headNode;
        }
    }

    //xoa phan tu dau linklist 
    public static Node removeTohead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    //xoa phan tu cuoi linklist 
    //b1 xac dinh last va prev 
    //
    public static Node removeAtTail(Node headNode) {
        if (headNode == null) {
            return null;
        }
        Node prev = null;
        Node lastNode = headNode;
        while (lastNode.next != null) {
            prev = lastNode;
            lastNode = lastNode.next;
        }
        //neu prev == null Node chi co 1 node la lastNode 
        if (prev == null) {
            return null;
        } else {
            prev.next = lastNode.next;
        }
        return headNode;
    }

    //xoa phan tu o giua linklist 
    public static Node removeAtIndex(Node headNode, int index) {
        Node prevNode = null;
        Node curNode = headNode;
        int count = 0;
        if (index < 0 || headNode == null) {
            return null;
        }
        if (index == 0) {
            return removeTohead(headNode);
        }
        //xu ly truong hop con lai
        boolean bIsFound = false;
        while (curNode != null) {
            //tim thay vi tri can xoa
            if (count == index) {
                bIsFound = true;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }
        if (bIsFound) {
            if (prevNode == null) {
                return null;
            } else {
                if (curNode != null) {
                    prevNode.next = curNode.next;
                }
            }
        }
        return headNode;
    }

    // public static class Node
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        printLinkList(n1);
        n1 = removeAtIndex(n1, 1);
        printLinkList(n1);

    }
}
