package demo.binderpool.com.binderpool;

import android.os.RemoteException;

/**
 * Created by hopetribe on 15/11/18.
 */
public class SecurityCenterIplm extends  ISecurityCenter.Stub{
    private final static char SECRET_CODE = '^';
    @Override
    public String encrypt(String content) throws RemoteException {
        char[] chars = content.toCharArray();
        for (int i = 0; i < chars.length; i++){
            chars[i] ^= SECRET_CODE;
        }
        return new String(chars);
    }

    @Override
    public String deccrypt(String password) throws RemoteException {
        return encrypt(password);
    }
}
