interface IntStack{
    void push(int x);
    int pop();
}
class StaticIntStack implements IntStack{
    private int[] stk;
    private int top;
    StaticIntStack(int size){
        stk = new int[size];
        top = -1;
    }
    public void push(int x){
        if(top == stk.length - 1){
            System.out.println("Stack overflow");
        }
        else{
            stk[++top] = x;
        }
    }
    public int pop(){
        if(top == -1)
            System.out.println("Stack undeflow");
        else{
            return stk[top--];
        }

    return -1;
    }
}
public class IFTest {
    public static void main(String[] args) {
        StaticIntStack s = new StaticIntStack(5);
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        System.out.println(s.pop());
//        s.push(15);
    }
}
