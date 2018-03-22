import java.io.*;
import java.util.Scanner;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/20
 * @Time: 21:05
 * To change this template use File | Settings | File Templates.
 */
public class StringTimes {

    /**public static int getKeyStringCount(String str,String key){
        int count=0;
        int index=0;
        while ((index=str.indexOf(key,index))!=-1){
            index=index+key.length();
            count++;
        }
        return count;
    }     **/


   /** public static void main(String[] args) {
        File file =new File("D:/设计模式.txt");
        FileInputStream fls=null;
        try {
            fls=new FileInputStream(file);
            int len=0;
            byte[] buf=new byte[1024];
            String str=null;
            while ((len=fls.read(buf))!=-1){
                str=new String(buf,0,len,"GBK");
            }
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入你要查询的字符串");
            String key= scanner.nextLine();
            int count=getKeyStringCount(str,key);
            System.out.println("该文件出现此字符串的次数为:"+count+"次");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fls.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}       **/

   public static int getKeyStringCount(String str, String key) {
       int count = 0;
       int index = 0;
       while((index = str.indexOf(key,index))!=-1){
           index = index + key.length();
           count++;
       }
       return count;
   }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File file = new File("D:/设计模式.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            int len = 0;
            byte[] buf = new byte[1024];
            String str = null;
            while((len = fis.read(buf)) !=-1){
                str = new String(buf, 0, len,"UTF-8");
            }
            Scanner sc  = new Scanner(System.in);
            System.out.println("请输入你要查询字符串：");
            String key = sc.nextLine();
            int count = getKeyStringCount(str,key);
            System.out.println("文件中此字符串出现次数为："+count+"次");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}