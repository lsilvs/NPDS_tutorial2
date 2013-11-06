/*
 * Classname IPAddrDemo.java
 * Version Information R1A
 * Date 18/09/2008
 * @Copyright Paul Stynes
 */

package networkprogramming;

import java.net.*;

public class IPAddrDemo
{
    public static void main(String args[]) {
        System.out.println ("Looking up the IP address of the local host");
        try {
            // Get the local host
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("IP address of this machine: " +localAddress.getHostAddress());
	} catch (UnknownHostException uhe) {
            System.out.println ("Error - unable to resolve localhost");
            }
	}
}