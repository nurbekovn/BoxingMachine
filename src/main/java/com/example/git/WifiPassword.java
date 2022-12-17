package com.example.git;

import java.io.IOException;
import java.util.Scanner;

public class WifiPassword {

    public static void main(String[] args) {
        System.out.println("checking wifi password...");
        String networkName = "bhattaraisubash";
        String os = System.getProperty("os.name").toLowerCase();
        String command = "netsh wlan show profiles " + networkName + " key=clear";

        // check if os is unix and replace command if yes
        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
            command = "sudo grep '^psk=' /etc/NetworkManager/system-connections/" + networkName;
        }
        System.out.println("executing " + command + " ...");

        /*
         * Note that the command for linux requires sudo previleges so you might have to
         * find a way to provide a sudo password or grant an access. The windows command
         * however works without needing to change anything.
         */
        try {
            Process process = Runtime.getRuntime().exec(command);
            System.out.println(process.info());
            Scanner scanner = new Scanner(process.getInputStream());
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
