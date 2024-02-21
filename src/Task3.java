import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Task3 {
    public static void main(String[] args) {

    }

    public void addNums() throws IOException {
        Scanner sc=new Scanner(in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Integer c=a+b;
        String str=c.toString();

        FileOutputStream out;
        try {
            out=new FileOutputStream("result.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        for (int i = 0; i < str.length(); i++) {
            out.write(str.charAt(i));
        }
    }

}
