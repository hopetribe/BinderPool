// ISecurityCenter.aidl
package demo.binderpool.com.binderpool;

// Declare any non-default types here with import statements

interface ISecurityCenter {
    String encrypt(String content);
    String deccrypt(String password);
}
