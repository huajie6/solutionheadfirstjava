import java.io.*;
 
public class BRRead {
    public static void main(String args[]) throws IOException {
        int c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = br.read();
            // c = (char) System.in.read();
            System.out.println(c);
        } while (c != 'q');
    }
}