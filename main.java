//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.net.*;

public class main {
    public static void main(String[] args) throws MalformedURLException , IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        URL u =new URL("https://www.google.com");
        InputStream str= u.openStream();
        int c;
        while((c=str.read())!=-1)
        {
        System.out.print((char)c);
        }
        str.close();
    }
}