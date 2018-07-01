package pl.parkin9.Hang_out_Man.implementation;

import org.springframework.stereotype.Component;
import pl.parkin9.Hang_out_Man.service.ReadFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 /*
 * The class reads the contents of the TXT file and returns it as a list.
 */

@Component
public class ReadFromFileImpl implements ReadFromFile {

    @Override
    public List<String> getContentFile() throws IOException {

        String filePath = "fileResource/codeword.txt";
        String line;
        List<String> codewordList = new ArrayList<>();

        try (BufferedReader bufferedFile = new BufferedReader(new FileReader(filePath))) {

            while ((line = bufferedFile.readLine()) != null) {
                codewordList.add(line);
            }
        }

        return codewordList;
    }
}
