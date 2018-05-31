package pl.parkin9.Hang_out_Man.implementation;

import org.springframework.stereotype.Service;
import pl.parkin9.Hang_out_Man.service.CodewordService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class CodewordServiceImpl implements CodewordService {

    @Override
    public String getRandCodeword() throws IOException {

        String filePath = "fileResource/codeword.txt";
        String codeword;
        String line;
        ArrayList <String> codewordList = new ArrayList<>();

        try (BufferedReader bufferedFile = new BufferedReader(new FileReader(filePath))) {

            while((line = bufferedFile.readLine()) != null) {
                codewordList.add(line);
            }

            int randNum = ThreadLocalRandom.current().nextInt(codewordList.size() - 1);
            codeword = codewordList.get(randNum);
        }

        return codeword;
    }
}
