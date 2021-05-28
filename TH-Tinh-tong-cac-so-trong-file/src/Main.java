import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap duuong dan: ");
        String filePath=scanner.nextLine();
        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText(filePath);

    }
}
