package javalr4;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.LinkedList;

public class JavaLR4 {

   
    public static void main(String[] args) throws IOException, CsvException {
       List<PersonEntity> list=new LinkedList<>(); 
       
       String FilePath="Here add file path";
       CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
       try(CSVReader reader = new CSVReaderBuilder(new FileReader(FilePath)).withCSVParser(csvParser).withSkipLines(1).build()){
           if (reader == null) {
                throw new FileNotFoundException(FilePath);
           }
           String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                PersonEntity worker=new PersonEntity();
                worker.InputID(Integer.parseInt(nextLine[0]));
                worker.InputName(nextLine[1]);
                worker.InputGen(nextLine[2]);
                worker.InputDoB(nextLine[3]);
                worker.InputSubdiver(nextLine[4]);
                worker.InputSalary(Integer.parseInt(nextLine[5]));
                list.add(worker);
            }
       }
       System.out.println(list.size());//25898
    }
    
}
