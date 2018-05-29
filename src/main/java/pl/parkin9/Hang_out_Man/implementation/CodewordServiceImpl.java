package pl.parkin9.Hang_out_Man.implementation;

import org.springframework.stereotype.Service;
import pl.parkin9.Hang_out_Man.service.CodewordService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Service
public class CodewordServiceImpl implements CodewordService {

    @Override
    public String codeword() throws FileNotFoundException {

        File file = new File("/home/parkin9/Documents/IntelliJ_projects/Hang_out_Man/src/main/resources/static/codeword.txt");
        Scanner in = new Scanner(file);

        String codeword = "";

        int count = 0;
        while(in.hasNextLine()) {
            count++;
            in.nextLine();
        }
        codeword = String.valueOf(count);

        return codeword;
    }
}
