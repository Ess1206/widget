package Report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateHtmlpage {

    public static void main(String[] args) {

        File file = new File("D:\\Selenium\\widget\\src\\main\\resources\\LinkLists.html");
        if(file.exists()){
            System.out.println("File already exist");
        }else{
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file);
                bufferedWriter = new BufferedWriter(fileWriter);

                String htmlPage = "<html><body style=’background-color:#ccc’><b><h3><center><u>Mobile Phones</u></center></h3></b>" ;

                bufferedWriter.write(htmlPage);

                bufferedWriter.append("<strong><h4>Mobile Phone Companies</h4></strong><ul><li>Apple</li><li>Samsung</li><li>Nokia</li></ul></body></html>");

                System.out.println("HTML page created");
                bufferedWriter.flush();
                fileWriter.flush();

            } catch (IOException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }finally{
                try {

                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

        }

    }

}