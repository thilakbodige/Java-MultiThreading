package Multi_Threading;
class Calculator implements Runnable
{
	 int num1;
     int num2;
     char operation;

    public Calculator(int num1, int num2, char operation) 
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    @Override
    public void run() 
    {
        switch (operation)
        {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                {
                    System.out.println("Division: " + (num1 / num2));
                } 
                else 
                {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}