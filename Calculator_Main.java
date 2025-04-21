package Multi_Threading;
public class Calculator_Main 
{
	public static void main(String[] args) 
	{
        Thread add = new Thread(new Calculator(10, 5, '+'));
        Thread sub = new Thread(new Calculator(25, 10, '-'));
        Thread multi = new Thread(new Calculator(40, 15, '*'));
        Thread div = new Thread(new Calculator(50, 5, '/'));
        add.start();
        sub.start();
        multi.start();
        div.start();
        
    }
}
