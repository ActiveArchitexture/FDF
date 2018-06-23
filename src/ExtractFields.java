

import com.adobe.fdf.*;
import com.adobe.fdf.exceptions.*;

import java.util.Iterator;

public class ExtractFields {

    public static void main(String[] args) {


        try {


            String fdfFileName = "/Users/Ross/IdeaProjects/FDF/src/extract.fdf";
            //String fdfFileName = "/Users/Ross/IdeaProjects/FDF/src/extractSubmitted.fdf";

            FDFDoc fdfinput = new FDFDoc(fdfFileName);

            Iterator fieldNameIter = fdfinput.GetFieldNameIterator();
            while (fieldNameIter.hasNext()) {
                String fieldName = fieldNameIter.next().toString();
                String fieldValue = fdfinput.GetValue(fieldName);

                System.out.print("fieldName: " + fieldName);
                System.out.println("\tfieldValue: " + fieldValue);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close up
        }
    }
}
