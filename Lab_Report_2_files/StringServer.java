/** 
 * Name: Sarah Claire Balatbat
 * Email: scbalatbat@ucsd.edu
 * PID: A17415096
 * Sources used: Lab 2 NumberServer.java file
 * 
 * This file provides functionality for a web server that handles requests
 * to modify a String. It comes with the Handler class which implements
 * URLHandler, a StringServer class which runs the webserver, and imported
 * IOException and URI classes.
 */
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // String to be added to by requests
    String output = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return output;
        }
        else if (url.getPath().contains("/add-message")) {
            String[] param = url.getQuery().split("=");
            if (param[0].equals("s")) {
                output = output + "\n" +  param[1];
                return output;
            }
        }
        else {
            return "404 Not Found!";
        }
        return "404 Not Found!";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number " + 
                    "between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}