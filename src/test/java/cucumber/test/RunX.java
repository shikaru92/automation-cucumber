package cucumber.test;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by tcbinh on 3/8/2016.
 */
public class RunX implements Runnable{
    private String prefix = StringUtils.EMPTY;

    public RunX(String p)
    {
        this.prefix = p;
    }

    public void run() {
        for (int i = 0; i< 100; i++)
        {
            System.out.println(prefix+i);
        }
    }
}
