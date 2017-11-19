package Report;

import java.io.*;

public class CreateHtmlDocument {

    static StringBuilder htmlStringBuilder=new StringBuilder();
    static StringBuilder htmlStringLinks=new StringBuilder();


    public static void AddLinkToReport(int count ,String link , boolean result){

        htmlStringLinks.append("<tr><td>"+count+"</td><td>"+link+"</td><td>"+result+"</td></tr>");
    }

    public static void GenerateReport(){
        try {
            //define a HTML String Builder
            //StringBuilder htmlStringBuilder=new StringBuilder();
            //append html header and title
            htmlStringBuilder.append("<html><head><title>Selenium Test </title></head>");
            //append body
            htmlStringBuilder.append("<body>");
            //append table
            htmlStringBuilder.append("<table border=\"1\" bordercolor=\"#000000\">");
            //append row
            htmlStringBuilder.append("<tr><td><b>Link №</b></td><td><b>Link Name</b></td><td><b>TestResult</b></td></tr>");
            //append row

            htmlStringBuilder.append(htmlStringLinks);
            // htmlStringBuilder.append("<tr><td>"+i+"</td><td>"+link+"</td><td>"+result+"</td></tr>");

            htmlStringBuilder.append("</table></body></html>");
            //write html string content to a file
            WriteToFile(htmlStringBuilder.toString(),"LinkLists.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Report is created in resources folder");
    }

    private static void WriteToFile(String fileContent, String fileName) throws IOException {
        //String projectPath = System.getProperty("user.dir");
        //String projectPath = "D:\\Selenium\\widget\\src\\main\\resources\\";
        String projectPath = "src\\main\\resources\\";
        String tempFile = projectPath + File.separator+fileName;
        File file = new File(tempFile);
        // if file does exists, then delete and create a new file
        if (file.exists()) {
            try {
                File newFileName = new File(projectPath + File.separator+ "backup_"+fileName);
                file.renameTo(newFileName);
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //write to file with OutputStreamWriter
        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
        Writer writer=new OutputStreamWriter(outputStream);
        writer.write(fileContent);
        writer.close();

    }
}
