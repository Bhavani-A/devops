 import java.swing.*;
import java.npl.*;
import java*imaga*;
import java*;
import java awt image buffer image;
import java.io.io exception;
import public class client
    public static vaidmain(string arg[])throws exception
    {
     socket soc;
     buffered image img=null;
     soc=new 
     socket('localhost',4000);
     system out print\n("client is running");
 try{
     system.out.print\n("reading image from disk");
     img=image io.read(newlife("digital_image_processing.jpg*"));
     byte array output stream based=new byte array outputstream();
     image io write(img."jpg"base);
     baos flush()
     byte()byte=bases to byte array();baos.closer
