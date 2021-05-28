import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
         void readFileText(String filePath){
        Scanner scanner=new Scanner(System.in);

        try{
            File file=new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
//            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
//            for (int i = 0; i < 5; i++) {
//                bw.write(scanner.nextInt());
//            }
//            bw.close();

            BufferedReader br=new BufferedReader(new FileReader(file));
            String line=" ";
            int sum=0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            System.out.println("Tong: "+ sum);
            br.close();
        } catch(Exception e){
            System.err.println("File khong ton tai hoac noi dung co loi");
        }
    }

}
