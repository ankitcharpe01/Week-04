package com.regexproblems.advanceproblems.validateipaddress;

public class IPAddressValidationCheck {
        public static void main(String[] args) {
            String ip1 = "192.168.1.1";
            String ip2 = "256.100.50.25";
            String ip3 = "192.168.01.1";
            String ip4 = "192.168.1";
            String ip5 = "192.168.1.abc";

            System.out.println(ip1 + " - " + isValidIPv4(ip1));
            System.out.println(ip2 + " - " + isValidIPv4(ip2));
            System.out.println(ip3 + " - " + isValidIPv4(ip3));
            System.out.println(ip4 + " - " + isValidIPv4(ip4));
            System.out.println(ip5 + " - " + isValidIPv4(ip5));
        }

        public static boolean isValidIPv4(String ip) {
            String ipv4Pattern = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)(\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)){3})$";

            return ip.matches(ipv4Pattern);
        }
    }
