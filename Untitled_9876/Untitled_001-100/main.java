import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
public class PayBarry {
    public static void main(String args[]) throws UnsupportedEncodingException
    { 
        System.setOut(new PrintStream(System.out, true, "windows-1251"));
        double checkAmount = 1257.63;
        System.out.print ("�������� �� ������������ ������ ���");
        System.out.print ("����� ����� ");
        System.out.print ("$");
        System.out.println(checkAmount);
    }
}
