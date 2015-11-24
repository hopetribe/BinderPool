package demo.binderpool.com.binderpool;

import android.os.RemoteException;

/**
 * Created by hopetribe on 15/11/18.
 */
public class ComputerImpl extends ICompute.Stub{

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

}
