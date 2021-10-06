package Stack;

public class SimpleStack {
    private int stack[];
    int top,size;

    SimpleStack(int stackSize) {
        stack = new int[stackSize];
        size=stackSize;
        top = -1;
    }

    public void push(int n)
    {
        top+=1;
        if(top<size)
        {
            stack[top]=n;
            System.out.println(stack[top]+" pushed");
        }
        else
        {
            isFull();
        }
    }
    public void pop()
    {
        if(isEmpty()==0)
        {
            System.out.println(stack[top]+" popped");
            top--;
        }
    }
    public int isFull()
    {
        if(top==size) {
            System.out.println("Stack is full");
            return 1;
        }
        return 0;
    }
    public int isEmpty()
    {
        if(top==-1) {
            System.out.println("Stack is empty");
            return 1;
        }
        return 0;
    }
    public void print()
    {
        for(int i=0;i<size;i++)
            System.out.println(stack[i]);
    }

    public static void main(String[] args) {
        SimpleStack s=new SimpleStack(5);
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.print();
    }
}
