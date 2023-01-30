# Week 2 & 3 Lab Report

## Part 1: String Server

```java
/** 
 * Name: Sarah Claire Balatbat
 * Email: scbalatbat@ucsd.edu
 * PID: A17415096
 * Sources used: Lab 2 NumberServer.java file
 * 
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
                output = output + param[1];
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
```

## Request 1: /add-message?s=Hello

![/add-message 1](./Lab_Report_2_files/Screenshot%20(354).png)

Methods called:
* `handleRequest(URI url)`: takes a new URL object, which is in this case, "http://localhost:2048/add-message?s=Hello"
   * `url.getPath().contains("/add-message")`: checks if the URL path has the "/add-message" request, which is true in this case
      * `url.getQuery().split("=")`: takes the query of the path (which is "s=Hello") and splits it into a String array by the "=" character, containing "s" in the `[0]` element of the String array and "Hello" in the `[1]` element
      * `param[0].equals("s")`: checks if the first parameter is indeed "s" - results in a true evaluation for the if statement it's contained in, thus resulting in concatenating the `[1]` element to the `output` field, whose value was previously an empty string

The resulting `output` field is returned as a result of the request, as shown by the screenshot containing a single "Hello"

Relevant method arguments and class fields:
* _Method Arguments_
   * `handleRequest(URI url)`: "http://localhost:2048/add-message?s=Hello"
* _Class Fields_
   * `output`: ""

Class field changes:
* `output`: "" -> "Hello" - Hello was concatenated to the original value of `output`, which was an empty string ""

## Request 2: /add-message?s= World!

![/add-message 2](./Lab_Report_2_files/Screenshot%20(355).png)

Methods called:
* `handleRequest(URI url)`: takes a new URL object, which is in this case, "http://localhost:2048/add-message?s=%20World!" - note that the "%20" characters represent a space character that was autoreplaced by Chrome, I tried to _incorrectly_ manually type it as "%" and this resulted in a 404 error outside of the StringServer program
   * `url.getPath().contains("/add-message")`: checks if the URL path has the "/add-message" request, which is true in this case
      * `url.getQuery().split("=")`: takes the query of the path (which is "s= World!") and splits it into a String array by the "=" character, containing "s" in the `[0]` element of the String array and " World!" in the `[1]` element
      * `param[0].equals("s")`: checks if the first parameter is indeed "s" - results in a true evaluation for the if statement it's contained in, thus result in concatenating the `[1]` element to the `output` field, whose value was "Hello" from the previous method call

The resulting `output` field is returned as a result of the request, as shown by the screenshot containing a single "Hello World!"

Relevant method arguments and class fields:
* _Method Arguments_
   * `handleRequest(URI url)`: "http://localhost:2048/add-message?s= World!"
* _Class Fields_
   * `output`: "Hello"

Class field changes:
* `output`: "Hello" -> "Hello World!" - " World!" was concatenated to the previous value of output, wich was "Hello" from the last handled request

## Part 2: Bugs

Failure-inducing input

```JUnit Test and associated code```

Non-failure-inducing input

```JUnit test and associated code```

Symptom
_screenshot: JUnit running w at least 2 above inputs_

Bug

```Before-fix code```

```After-fix code```

**How the fix addressed the issue**
* _explanation_

## Part 3: What I Learned

_Couple sentences: "I learned about..."_