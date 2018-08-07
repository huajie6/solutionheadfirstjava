/**
 * Created by Sfwn on 2015/9/11.
 */
 
import java.io.IOException;
import java.io.InputStream;
 
public class SystemInTest {
    private static InputStream in;
    static {
        in = System.in;
    }
 
    public static void getChar_while() throws IOException {
        /*每执行一次指针会向后移一个byte
        所以要用input变量来保存读取到的值
        返回的是int值,故用printf指定格式为"%c"*/
        int input = in.read();
        if(input == '\n') {
            input = in.read();
        }
        while(input != 'q') {
            System.out.printf("%c", input);
            input = in.read();
        }
    }
 
    public static void getChar_doWhile() throws IOException {
        int input = in.read();
        if(input == '\n') {
            input = in.read();
        }
        do {
            System.out.printf("%c", input);
            input = in.read();
        } while(input != 'q');
    }
 
    public static void main(String[] args) throws IOException {
        System.out.println("Select the method:\n  1.while \n  2.do while");
        int test =0;
        int typeNum = 0;
        while(test!=1){
            test = System.in.read();
            typeNum++;
            System.out.printf("input: %d,and %d try;",test,typeNum);
            System.out.println(" ");
        }
        // int panduan = System.in.read();
        // if(panduan == '1') {
        //     System.out.println("Please input char or String:");
        //     getChar_while();
        // } else if(panduan == '2'){
        //     System.out.println("Please input char or String:");
        //     getChar_doWhile();
        // }
    }
}
