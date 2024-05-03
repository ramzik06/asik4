class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListOperations {

    public ListNode addToBeginning(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        return newNode;
    }

    public ListNode addToEnd(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public ListNode removeLastElement(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean searchElement(ListNode head, int target) {
        ListNode current = head;
        while (current != null) {
            if (current.val == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode insertAtPosition(ListNode head, int val, int position) {
        if (position == 0) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            return newNode;
        }
        ListNode current = head;
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            return head;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public ListNode removeElementByValue(ListNode head, int target) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        while (current != null) {
            if (current.val == target) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }

    public ListNode mergeLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        ListNode current = list1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list2;
        return list1;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public ListNode insertionSortLinkedList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        while (current != null) {
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            ListNode temp = current.next;
            current.next = prev.next;
            prev.next = current;
            current = temp;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListOperations operations = new LinkedListOperations();
    }
}
