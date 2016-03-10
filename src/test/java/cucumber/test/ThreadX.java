package cucumber.test;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by tcbinh on 3/8/2016.
 */
public class ThreadX extends Thread{
    private String prefix = StringUtils.EMPTY;

    public ThreadX(String p)
    {
        this.prefix = p;
    }

    @Override
    public void run()
    {
        for (int i=0; i<100; i++)
        {
            System.out.println(prefix + i);
        }
    }

    public static void main (String args[])
    {
        ThreadX t1 = new ThreadX("Luong 1:");
        ThreadX t2 = new ThreadX("Luong 2:");
        ThreadX t3 = new ThreadX("Luong 3:");

        t1.start();
        t2.start();
        t3.start();
    }

}
