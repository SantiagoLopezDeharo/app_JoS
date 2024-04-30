import java.util.ArrayList;
import java.util.Collection;

class sumar
{
    private int a = 0;
    public synchronized void s(int b)
    {
        a += b;
    }
}

class A extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Lol");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Lmao");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Hello
{
    public static void main(String args[])
    {
        System.out.println("Hola mundo !");

        byte b = 125;
        Integer a = (int) b;
        System.out.println(a);
        sumar s = new sumar();
        s.s(3);
        System.out.println(a);
        
        Collection<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i ++)
            nums.add(i);
        for (int i : nums)
            System.out.println(i);

        A aa = new A();
        B bb = new B();
        
        aa.start();bb.start();

    }

}