import java.io.*;
//import java.net.*; It is not used ==> for usage there is another method

public class ping{
    public static void main(String[] args){
        try{
            System.out.println("Enter the Domain address: \n(Eg: www.example.com)");
            String str;
            BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
            String ip = buf1.readLine();
            //Creating the process of commandline execution
            Process run = Runtime.getRuntime().exec("ping "+ip);

            //get the inputs from the pinging process
            InputStream in = run.getInputStream();
            //Creates bufferReader obj
            BufferedReader buf2 = new BufferedReader(new InputStreamReader(in));
            //reads the output from network until it stops
            while((str=buf2.readLine())!=null){
                System.out.println("Output :"+str);
            }          


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}