package Not_Defteri_Okutma;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        removeRecord("src/Not_Defteri_Okutma/records.txt","2323",1,",");
    }

    private static void removeRecord(String filepath, String removeTerm, int posionOfTerm, String delimiter) {
        int position=posionOfTerm-1;
        String tempFile="temp.txt";
        File oldFile=new File(filepath);
        File newFile=new File(tempFile);

        String currentLine;
        String data[];
        try {
            FileWriter fw= new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr=new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            while ((currentLine = br.readLine()) !=null)
            {
                data = currentLine.split(",");
                if(!(data[position].equalsIgnoreCase(removeTerm)))
                {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);

        } catch (IOException e) {

        }

    }
}
