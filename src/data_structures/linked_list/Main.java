package data_structures.linked_list;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee("omon","yok",12);
        Employee employee2 = new Employee("alex","hen",13);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(employee);
        list.addToFront(employee2);

        Employee employee3 = new Employee("bill","hen",11);
        list.addToEnd(employee3);
        list.removeFromFront();
        list.printList();
    }
}
