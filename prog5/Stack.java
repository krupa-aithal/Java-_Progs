package ticketcounter;
// stack class
public class Stack {

    private Person arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        capacity = size;
        arr = new Person[capacity];
        top = -1;
    }

    Stack(Person[] inputArr) {
        capacity = inputArr.length;
        arr = new Person[capacity];
        top = -1;
        for (int i = 0; i < inputArr.length; i++) {
            arr[++top] = inputArr[i];
        }
    }
// push single person
void push(Person p) {
    if (top == capacity - 1) {
        System.out.println("Stack Overflow");
        return;
    }
    arr[++top] = p;
}
// overload push
void push(Person p1, Person p2) {
    push(p1);
    push(p2);
}
// pop a person
Person pop() {
    if (top == -1) {
        System.out.println("Stack Underflow");
        return null;
    }
    return arr[top--];
}
// underflow condition
void pop(int n) {
    for (int i = 0; i < n; i++) {
        if (top == -1) {
            System.out.println("Stack Underflow");
            break;
        }
        Person p = pop();
        if (p != null) p.displayPerson();
    }
}
// display
void display() {
    if (top == -1) {
        System.out.println("Stack is empty");
        return;
    }
    for (int i = top; i >= 0; i--) {
        arr[i].displayPerson();
    }
}

void display(int n) {
    if (top == -1) {
        System.out.println("Stack is empty");
        return;
    }
    for (int i = top; i > top - n && i >= 0; i--) {
        arr[i].displayPerson();
    }
}
}
