package app;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class CorrectIP {
    public static boolean isCorrectIpAdress(String ip) {
        try {
            return !Inet4Address.getByName(ip)
                    .getHostAddress().equals(ip);
        } catch (UnknownHostException ex) {
            return true;
        }
    }
}

